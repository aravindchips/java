package test;
import java.util.Scanner;
public class PowerOfIndexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=(int)(sum+Math.pow(arr[i], i));
			
		}
			System.out.println(sum);
		


	}

}
