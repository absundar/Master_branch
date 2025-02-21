package storedFunctionTesting;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StoredFunctionTesting {
	Connection con=null;
	Statement stmt;
	ResultSet rs;
	ResultSet rs1;
	ResultSet rs2;
	CallableStatement cstmt;
	
	@BeforeClass
	void setup() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");
	}
	@AfterClass
	void tearDown() throws SQLException {
		con.close();
	}
	@Test(priority=1)
	void storedFunctionExists() throws SQLException {
		stmt =con.createStatement();
		rs=stmt.executeQuery("show function status where name='customerlevel'");
		rs.next();
Assert.assertEquals(rs.getString("name"),"customerlevel");
	}
	@Test(priority=2)
	void customerLevelWithSQLStatement() throws SQLException {
		rs1 =con.createStatement().executeQuery("select customername, customerlevel(creditlimit) from customers");
		rs2=con.createStatement().executeQuery("select customername,case when creditlimit > 50000 then 'platinum'when creditlimit >=10000 and creditlimit<=50000 then'gold' when creditlimit<10000 then 'silver'end as customerlevel from customers");

		Assert.assertEquals(compareResultSets(rs1, rs2), true);
		rs1.close();
        rs2.close();
	}

	public boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException {
		while(resultSet1.next()) {
			resultSet2.next();
			int count= resultSet1.getMetaData().getColumnCount();
			for(int i=1;i<=count;i++) {
				if(!StringUtils.equals(resultSet1.getString(i), resultSet2.getString(i))) {
					return false;
				}
			}
		}
			return true;
		}
	@Test
	void CustomerLevelWithStoredProcedure() throws SQLException {
	cstmt=	con.prepareCall("{call getcustomerlevel(?, ?)}"); //according to the syntax
	cstmt.setInt(1, 131);  //input has to be set
	cstmt.registerOutParameter(2, Types.VARCHAR); //output has to be registered
	cstmt.executeQuery();
	String custLevel= cstmt.getString(2); //as output parameter is defined in the second position according to line 64
	rs=con.createStatement().executeQuery("select customername,case when creditlimit > 50000 then 'platinum'when creditlimit >=10000 and creditlimit<=50000 then'gold' when creditlimit<10000 then 'silver' end as customerlevel from customers where customerNumber=131");
	rs.next();
	String expectedCustomerLevel= rs.getString("customerlevel");
	Assert.assertEquals(custLevel, expectedCustomerLevel);
	}
}
