package examp;
import java.util.Scanner;
public class MaxArray {
	public void getArray() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter the size of the array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxArray may=new MaxArray();
		may.getArray();

	}

}
