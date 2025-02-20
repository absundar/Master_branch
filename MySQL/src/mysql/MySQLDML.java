package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1) Create a connection
2) Create statement/query
3) Execute statement/query
4) Close connection

 */
public class MySQLDML {

	public static void main(String[] args) throws SQLException {
		//1) Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root"); //connection, username, password
		//2) Create statement/query
		Statement stmt= con.createStatement();
		//String s= "INSERT INTO STUDENT VALUES(102, 'LEELA')";
		//String snew= "UPDATE STUDENT SET SNAME='RAGAV' WHERE SID=102";
		String sdel= "DELETE FROM STUDENT WHERE SID=2";
		//3) Execute statement/query
		//stmt.execute(s);
		//stmt.execute(snew);
		stmt.execute(sdel);
		//4) Close connection
		con.close();
		System.out.println("Query executed....");
	}

}
