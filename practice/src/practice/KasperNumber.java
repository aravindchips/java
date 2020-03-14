package practice;

import java.util.Scanner;

public class KasperNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sqnum=num*num;
		System.out.println("Square is "+sqnum);
		int count=0;
		int sum=0;
        while(sqnum!=0) {
			sqnum=sqnum/10;
			count++;
			
		}
		System.out.println(count);
		
		

}
}