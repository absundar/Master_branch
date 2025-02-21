package storedProcedureTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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


public class StoredProcedureTesting {
	Connection con = null;
	Statement stmt;
	ResultSet rs;
	CallableStatement cstmt;
	ResultSet rs1;
	ResultSet rs2;
	@BeforeClass
	void setup() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");

	}
	@AfterClass
	void tearDown() throws SQLException {
		con.close();
	}
	@Test(priority=1)
	void spExists() throws SQLException {
		stmt = con.createStatement();
		rs= stmt.executeQuery("show procedure status where db='classicmodels'");
		rs.next();
		Assert.assertEquals(rs.getString("db"), "classicmodels");
	}

	/*Syntax for sp:
	{call procedure_name()} - accept no parameters and returns no values
	{call procedure_name(?,?)} - accept two parameters and returns no values
	{?= call procedure_name()} - accept no parameter and return values
	{?= call procedure_name(?)} accept one parameter and return values*/

	@Test(priority=2)
	void selectAllCustomers() throws SQLException {
		cstmt= con.prepareCall("{CALL SelectAllCustomers()}"); //used to call the stored procedure
		rs1=cstmt.executeQuery();
		Statement stmt=con.createStatement();
		rs2= stmt.executeQuery("select * from customers");
		Assert.assertEquals(compareResultSets(rs1, rs2), true);
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
	@Test(priority=3)
	void selectAllCustomersByCity() throws SQLException {
		cstmt= con.prepareCall("{CALL SelectAllCustomersByCity(?)}"); //used to call the stored procedure
		cstmt.setString(1, "Singapore");
		rs1=cstmt.executeQuery();
		Statement stmt=con.createStatement();
		rs2= stmt.executeQuery("select * from customers where city ='Singapore'");
		Assert.assertEquals(compareResultSets(rs1, rs2), true);
	}
	@Test(priority=4)
	void selectAllCustomersByCityAndPinCode() throws SQLException {
		cstmt= con.prepareCall("{CALL selectallcustomersbycityandpin(?,?)}"); //used to call the stored procedure
		cstmt.setString(1, "Singapore");
		cstmt.setString(2, "079903");
		rs1=cstmt.executeQuery();
		Statement stmt=con.createStatement();
		rs2= stmt.executeQuery("select * from customers where city ='Singapore'and postalcode='079903'");
		Assert.assertEquals(compareResultSets(rs1, rs2), true);
	}
	@Test(priority=5)
	void getOrderByCustomer() throws SQLException {
		cstmt= con.prepareCall("{call getorderbycust(?, ?, ?, ?, ?)}");
		cstmt.setInt(1, 141);
		cstmt.registerOutParameter(2, Types.INTEGER);
		cstmt.registerOutParameter(3, Types.INTEGER);
		cstmt.registerOutParameter(4, Types.INTEGER);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.executeQuery();
	int shipped=	cstmt.getInt(2); //for the output parameter in the second position
	int canceled= cstmt.getInt(3);
	int resolved=cstmt.getInt(4);
	int disputed=cstmt.getInt(5);
	//System.out.println(shipped+"       "+canceled+"     "+resolved+"     "+disputed);
	Statement stmt=con.createStatement();
	rs=stmt.executeQuery("select(select count(*) as 'shipped' from orders where customernumber=141 and status='shipped') as shipped,(select count(*) as 'canceled' from orders where customernumber=141 and status='canceled') as canceled,(select count(*) as 'resolved' from orders where customernumber=141 and status='resolved') as resolved,(select count(*) as 'disputed' from orders where customernumber=141 and status='disputed') as disputed");
	rs.next();
	int expectedShipped= rs.getInt("shipped");
	int expectedCanceled=rs.getInt("canceled");
	int expectedResolved=rs.getInt("resolved");
	int expectedDisputed=rs.getInt("disputed");
	if(shipped==expectedShipped && canceled==expectedCanceled && resolved==expectedResolved && disputed ==expectedDisputed) {
		Assert.assertTrue(true);
	}
	else
		Assert.assertTrue(false);
	}
	@Test(priority=6)
	void getCustomerByShipping() throws SQLException {
		cstmt= con.prepareCall("{call getcustomershipping(?, ?)}");
		cstmt.setInt(1, 112);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.executeQuery();
		String shippingTime=	cstmt.getString(2);
		Statement stmt=con.createStatement();
		rs=stmt.executeQuery("select country, case when country='usa' then '2-day Shipping'when country='canada' then '3-day Shipping'else '5-day Shipping'end as Shippingtime from customers where customernumber=112");
		rs.next();
		String expectedShippingTime=rs.getString("ShippingTime");
		Assert.assertEquals(shippingTime, expectedShippingTime);
	}
}


