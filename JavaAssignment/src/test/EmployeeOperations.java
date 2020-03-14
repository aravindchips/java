package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeOperations {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		Statement statement=connection.createStatement();
		String query="create table IF NOT EXISTS Employee(name varchar(20),id int(10),dept varchar(20),desg varchar(20),company varchar(20),emailid varchar(15))";
		int count=statement.executeUpdate(query);
		System.out.println(count+"table created");
		statement.close();
		connection.close();

	}

}
