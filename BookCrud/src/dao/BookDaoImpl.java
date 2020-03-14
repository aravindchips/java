package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;

import dto.Book;

public class BookDaoImpl implements BookDao{
	Connection connection=null;;

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
		return connection;
	}

	@Override
	public void closeConnections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertBookDao(Book book) {
		// TODO Auto-generated method stub
		String sql="insert into book values(?,?,?,?)";
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setInt(1,book.getId());
		pst.setString(2, book.getTitle());
		pst.setString(3, book.);
	}

	@Override
	public List<Book> showAllBooksDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookDao(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBookDao(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookDao(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertBookDao(Connection con, Book book) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
