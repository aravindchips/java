package exceptions;
import java.util.Scanner;
public class AccountDetails {
	float balance=5000;
	public void withDraw() throws InsufficientBalanceException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount for withdrawl from ur account");
		int amount=sc.nextInt();
		balance=balance-amount;
		if(balance<5000) {
		 throw  new InsufficientBalanceException();
		}
		else {
			System.out.println("You have withdrawn amount of rupees"+amount);
			System.out.println("Your updated balance is rupees"+balance);
		}
	}
	public void doCredit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be credited to  ur account");
		int amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("Your updated balance is rupees"+balance);
		
		
	}
}
