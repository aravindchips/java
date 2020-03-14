package assignments;
import java.util.Scanner;
public class Sum {

	public void getSum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//int n=num;
		int sum=0;
		while(num>0) {
			if(num>9) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
	}
		System.out.println(sum);;
}
}


