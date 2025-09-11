package JDBC;
import java.util.Scanner;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class DML {
	public static void main(String args[]) {
		int id = 0;
		int marks = 0;
		Scanner sc = new Scanner (System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			
			//String query = "create table student(sid number,marks number)";
			
			
//			String query = "insert into student(sid,marks) values(?,?)";
//			PreparedStatement stmt = conn.prepareStatement(query);
//			for(int i = 0; i < 5; i++) {
//				System.out.println("Enter students id:");
//				id = sc.nextInt();
//				System.out.println("Enter student marks:");
//				 marks = sc.nextInt();
//				stmt.setInt(1,id);
//				stmt.setInt(2, marks);
//				stmt.executeUpdate();
//				System.out.println("Row Inserted");
//			}
			
//			String query = "update student set marks = 90 where sid = 1";
//			Statement stmt = conn.createStatement();
//			stmt.executeUpdate(query);
			 
			
			
			
		}
		catch(Exception e) {
			
		}
		 
	}
}
