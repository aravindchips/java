package database;
import java.sql.*;
import java.util.Scanner;
public class Insert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		String query="insert into Employee values(?,?,?,?,?)";
		PreparedStatement pst=connection.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter id ");
		int id=sc.nextInt();
		System.out.println("Enter department");
		String dept=sc.next();
		System.out.println("Enter desgination");
		String desg=sc.next();
		System.out.println("Enter companyname");
		String cmpny=sc.next();
		System.out.println("Enter emailid");
		String email=sc.next();
		pst.setString(1, name);
		pst.setInt(2,id);
		pst.setString(3, dept);
		pst.setString(4, desg);
		pst.setString(5, cmpny);
		pst.setString(6, email);
		int x=pst.executeUpdate();
		System.out.println(x+ " "+ " Record inserted");

	}

}
