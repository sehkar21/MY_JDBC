package jdbcconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDMLCommands {
public static void main(String[] args) throws SQLException {
	
	//1.creating a connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	
	// 2.creating a statement
	Statement stmt = con.createStatement();
	//String s = "INSERT INTO STUDENT VALUES(104,'david',65)";
	//String s = "UPDATE STUDENT SET STUNAME='SMITH' WHERE SID=104";
	//String s = "INSERT INTO STUDENT VALUES(105,'david',65)";
	String s = "DELETE FROM STUDENT WHERE SID=105";
	
	
	//3.exceute the statement
	stmt.execute(s);
	
	//close connection
	con.close();
	
	System.out.println("query exceuted......");
	}
}
