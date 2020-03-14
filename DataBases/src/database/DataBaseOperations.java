package database;
import java.sql.*;
public class DataBaseOperations {
	public void createConnection() throws SQLException {
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		System.out.println("Connection Established");
	}
	public void insertData() throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
		Statement statement=connection.createStatement();
		statement.addBatch("insert into item_master values('I00028','Pen','Y','Plastic','Stationery','10')");
		statement.addBatch("insert into item_master values('I00029','Pencil','Y','Plastic','Stationery','4')");
		statement.addBatch("insert into item_master values('I00030','Sofa','Y','Furniture','Stationery','1000')");
		
		int res[]=statement.executeBatch();
		for(int i=0;i<res.length;i++) {
			System.out.println(" "+res[i]);
		}
		
	}
	public void deleteData() throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		Statement statement=connection.createStatement();
		String query="delete from item_master where item_id='I00028'";
		ResultSet count=statement.executeQuery(query);
		System.out.println(count + "Row Deleted");
		
	}
	public void updateData() {
		
		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		DataBaseOperations dbo=new DataBaseOperations();
		try {
		dbo.createConnection();
		dbo.insertData();

	}
		catch(SQLException e) {
			System.out.println(e);
		}

}
}