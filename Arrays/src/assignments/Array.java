package assignments;
import java.util.Scanner;
public class Array {
	public void getArray() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		int [] array=new int[size];
		//int array1[]=new int[size];
		//int key=10;
		
		System.out.println("Enter the elements into array");
		for(int i=0;i<size;i++) {
			array[i]=scan.nextInt();
		}
		System.out.println("Enterd elements are");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]==size-1||array[i]==10) {
				array[i]=array[i+1];
				array[i]=0;
		        
				
			
		}
			else
			{
			}
		}
		System.out.println("obtained array:");
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		
	
		}
	}
}