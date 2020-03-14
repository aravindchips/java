package handson;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		BookDAO bdao=new BookDAO("jdbc:mysql://localhost:3306/assignments","root","root");
		bdao.connect();
		Book book=new Book();
		//bdao.insertBook(book);
		//bdao.deleteBook(book);
		//bdao.updateBook(book);
		//bdao. book getBook(id);
		while(true) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for insertBook");
		System.out.println("Press 2 for deleteBooks");
		System.out.println("Press 3 for updateBook");
		System.out.println("Press 4 for getallBook");
		System.out.println("Press 5 to  getbook");
		System.out.println("Press 6 to  exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
		       System.out.println("Enter id");
		       int id=sc.nextInt();
		       System.out.println("Enter title");
		       String title=sc.next();
		       System.out.println("Enter author");
		       String author=sc.next();
		       System.out.println("Enter price");
		       float price=sc.nextFloat();
		       Book book1 = new Book(id,title,author,price);
		       bdao.insertBook(book1);
		       System.out.println("Book inserted with the values"+id+" "+title+" "+author+" "+price);
		       break;
		case 2:bdao.deleteBook(book);
		        System.out.println("Enter id of the book u wish to delete");
	            id=sc.nextInt();
	            System.out.println("Book deleted of id value"+id);
	            break;
		case 3:bdao.updateBook(book);
		       System.out.println("Enter id of the book u wish to update");
               id=sc.nextInt();
               System.out.println("Book updated of id value"+id);
               break;
		case 4:List<Book> books=bdao.listAllBooks();
		       for(Book b:books) {
		    	   System.out.println(b.getTitle()+" "+b.getAuthor());
		       }
		       break;
		/*case 5:bdao.getBook(id);
		       System.out.println("Enter id of the book u wish to get");
               id=sc.nextInt();
               System.out.println("Book of id value"+id+" "+ "is here...");
               break;*/
		case 6:System.exit(0);
		       break;
		default:System.out.println("Choose from the options provided only....");
		      

		}
		}
		

	}

	

	

}
