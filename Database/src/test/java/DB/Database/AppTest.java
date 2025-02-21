package DB.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	Class.forName("mysql-connector-j-8.4.0");
	Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");
	Statement statement = connection.createStatement();
	ResultSet result = statement.executeQuery("SELECT * FROM super_heros_table");
	
}
}
