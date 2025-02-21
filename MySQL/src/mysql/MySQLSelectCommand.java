package mysql;
/*1) Create a connection
2) Create statement/query
3) Execute statement/query
4) Store the results in resultset
5) Close connection*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectCommand {

	public static void main(String[] args) throws SQLException {
		//1) Create a connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root"); //connection, username, password
				//2) Create statement/query
				Statement stmt= con.createStatement();
				String s = "select id, name, population from city";
				//3) Execute statement/query and store in resultset
				ResultSet rs= stmt.executeQuery(s);
				while(rs.next()) {  //we dont know the exact range
				int id=	rs.getInt("id");
				String name = rs.getString("name");
				int population = rs.getInt("population");
				
				System.out.println(id+ "   " +name+ "     "+population);
				}
				//5) Close connection
				con.close();
				System.out.println("Query executed....");
			}

	
}
