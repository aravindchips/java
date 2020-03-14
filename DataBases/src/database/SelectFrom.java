package database;
import java.sql.*;
import java.util.Scanner;
public class SelectFrom {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		String query="select *from test where id=?";
		PreparedStatement pstatement=connection.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter idno to search from test record ");
		int idno=sc.nextInt();
		//ResultSet count=statement.executeQuery(query);
		pstatement.setInt(1,idno);
		//int x=pstatement.executeUpdate();
		
		ResultSet rs=pstatement.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(2));
		}
		

	}

}
