package dao;
import dto.Book;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface BookDao {
	public Connection getConnection() throws SQLException;
	public void closeConnections();
	public void insertBookDao(Connection con,Book book)throws SQLException;
	public List<Book> showAllBooksDao();
	public void deleteBookDao(int id);
	public void showBookDao(int id);
	public void updateBookDao(int id);

}
