package mains;
import java.sql.SQLException;
import java.util.Scanner;

import dao.AccountsDao;
import dao.UsersDao;
import dto.Accounts;
import dto.Users;

public class DisplayMenu {
	public static int existingUser() throws SQLException {
		UsersDao usersdao = new UsersDao("jdbc:mysql://localhost:3306/assignments","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Customer Application");
		System.out.println("Enter User name");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		Users users = new Users(uname,pwd);
		int status = usersdao.checkUser(users);
		usersdao.disconnect();
		return status;
	}
	public static void newUser() throws SQLException {
		UsersDao userdao = new UsersDao("jdbc:mysql://localhost:3306/assignments","root","root");
		AccountsDao accountsdao = new AccountsDao("jdbc:mysql://localhost:3306/assignments","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have to register first...");
		System.out.println("Enter username");
		String uname = sc.nextLine();
		System.out.println("Enter password");
		String pwd = sc.nextLine();
		Users users = new Users(uname,pwd);
		System.out.println("Enter AccountNumber");
		String acctNumber = sc.nextLine();
		System.out.println("Enter AccountType");
		String acctType = sc.nextLine();
		System.out.println("Enter Customer Name");
		String custName = sc.nextLine();
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		Accounts accounts = new Accounts(acctNumber,acctType,custName,balance);
		UsersDao.createCustomer(accounts, users);
		System.out.println("Account created sucessfully");
		//System.out.println("Do u wish to login to see ur details");
		//String y=sc.next();
		
	}
	public void showMenuOptions() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("***************Bank Application ************");
		System.out.println("1.New User...");
		System.out.println("2.Existing User...");
		System.out.println("Enter your choice...");
		int choice= sc.nextInt();
		switch(choice) {
		case 1: newUser();break;
		case 2: int status=existingUser();
		        if(status==1) {
		        	
		        	System.out.println("1.deposit");
		        	System.out.println("2.withdraw");
		        	System.out.println("3.getbalance");
		        	System.out.println("4.to exit");
		        	System.out.println("Enter ur choice");
		        	int ch=sc.nextInt();
		        	while(ch!=4) {
		        	switch(ch) {
		        	case 1:System.out.println("Enter accountnumber");
		        	       String actn=sc.next();
		        	       System.out.println("Enter the amount to deposit");
		        	       float amt=sc.nextFloat();
		        		   AccountsDao.deposit(actn,amt);
		        		   //System.out.println("Amount Deposited");
		        		   //break;
		        	case 2:System.out.println("Enter accountnumber");
	        	           String actn1=sc.next();
	        	           System.out.println("Enter the amount to withdraw");
	        	           float amt1=sc.nextFloat();
	        		       AccountsDao.withdraw(actn1,amt1);
	        		       break;
		        	case 3:System.out.println("Enter accountnumber");
     	                   String actn2=sc.next();
     	                   //System.out.println("Enter the amount to withdraw");
     	                   //float amt1=sc.nextFloat();
     		               AccountsDao.getBalance(actn2);
     		               //System.out.println(actn2);
     		               break;
		        	case 4:System.exit(0);
		        	default: System.out.println("Wrong Choice...");
		        	         break;
		        	}
		        }
		          
		
		}
		        break;
		default: System.out.println("Wrong Choice...");
		         break;
		}
	}

}