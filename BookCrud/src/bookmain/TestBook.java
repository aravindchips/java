package bookmain;

import dao.BookDaoImpl;
import dto.Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(2001,"Java Programming","CTS Academy",4000);
		BookDaoImpl bookimpl=new BookDaoImpl();

	}

}
