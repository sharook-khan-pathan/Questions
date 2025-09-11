package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnectionDemo {
	
    public static void main(String[] args) {
        try {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");

            // SQL Query to create Table
            //String query = "create table student(sid number, sname varchar2(50), age number,gender varchar2(10),class number,marks number)";
            
            //Add Email Column
           //String query = "alter table student add email varchar2(50)";

            //Remove Email
			//String query = "Alter table student drop column email";
            
            //Rename Marks to Percentage
            //String query = "Alter table student rename column marks to percentage";
            
            //Drop Table
            String query = "drop table student";
            // Create Statement
            Statement stmt = conn.createStatement();
            stmt.execute(query);

            System.out.println("Query exceuted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
