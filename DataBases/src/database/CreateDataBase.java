package database;
import java.sql.*;
import java.util.Scanner;
public class CreateDataBase {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		String query="create database IF NOT EXISTS'?'";
		PreparedStatement pst=connection.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of database u wish to create");
		String dname=sc.next();
		pst.setString(1,dname);
		ResultSet count=pst.executeQuery();
		System.out.println(count + " "+ "DataBase Created");
				

	}

}
