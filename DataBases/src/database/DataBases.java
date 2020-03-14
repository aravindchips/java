package database;
import java.sql.*;

public class DataBases {

	public static void main(String[] args) throws SQLException ,ClassNotFoundException{
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
		Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String query="select *from item_master";
		String query1="insert into item_master values"+"('I00027','Eraser','Y','Rubber','Stationery','5')";
		//String query2="update item_master set item_make='Non-Sattionery' where id='I00024'";
		int count=statement.executeUpdate(query1);
		//int count1=statement.executeUpdate(query2);
		System.out.println(count);
		//System.out.println(count1);
		ResultSet resultset=statement.executeQuery(query);
		while(resultset.next()) {
			System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+ " "+ resultset.getInt(6));
		}
		while(resultset.previous()) {
			System.out.println("From Previous");
			System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+ " "+ resultset.getInt(6));
		}
		resultset.close();
		statement.close();
		connection.close();

	}

}
