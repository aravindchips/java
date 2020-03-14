package database;
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		Statement statement=connection.createStatement();
		String query="create table IF NOT EXISTS test(id int(10),name varchar(20))";
		int count=statement.executeUpdate(query);
		System.out.println(count+"table created");
		statement.close();
		connection.close();

	}

}
