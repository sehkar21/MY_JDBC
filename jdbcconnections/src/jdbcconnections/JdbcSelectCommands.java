package jdbcconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectCommands {
public static void main(String[] args) throws SQLException {
	
	//1.creating a connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	
	// 2.creating a statement
	Statement stmt = con.createStatement();
	
	String s = "SELECT SID,STUNAME,MARKS FROM STUDENT";
	
	//3.exceute the statement and store the retrieved data
	
	
	ResultSet rs = stmt.executeQuery(s);
	
	while(rs.next()) {
		
		int StID = rs.getInt("SID");
		String name = rs.getString("STUNAME");
		int marks = rs.getInt("MARKS");
		
		System.out.println(StID+"   "+name+"   "+marks );
	}
	
	 //close connection
	con.close();
	
	System.out.println("query exceuted......");
	}
}
