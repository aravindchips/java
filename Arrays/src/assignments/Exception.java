package assignments;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e,f,h;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter e,f");
		e=cin.nextInt();
		f=cin.nextInt();
		try {
			h=e/f;
			System.out.println(h);
		}
		catch(java.lang.ArithmeticException obj) {
			System.out.println("Error is"+obj);
		}
		System.out.println("hello Aravind");
		System.out.println("this is exception handling program");

	}

}
