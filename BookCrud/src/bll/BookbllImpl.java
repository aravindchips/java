package bll;

import java.util.List;

import dao.BookDaoImpl;
import dto.Book;

public class BookbllImpl implements Bookbll{

	@Override
	public List<Book> listAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		BookDaoImpl bookimpl=new BookDaoImpl();
		bookimpl.insertBookDao(book);
		
	}

}
