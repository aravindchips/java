package test;
import java.util.Scanner;

public class SumOfMinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter ur elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			 if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		if(size==1) {
			System.out.println(arr[0]);
		}
		else {
			System.out.println("result is"+ " "+(max-min));
		}

	}

}