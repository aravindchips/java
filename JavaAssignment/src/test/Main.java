package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an Integer");
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> arr1 = new ArrayList<Integer>();
	    ArrayList<Integer> arr2 = new ArrayList<Integer>();
	    System.out.println("Enter elements in ArrayList1");
	    for (int i = 0; i < 2*n; i++) {
	      arr1.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter elements in ArrayList2");
	    for (int i = 0; i < 2*n; i++) {
	      arr2.add(Integer.parseInt(sc.nextLine()));
	    }
	    char c = sc.nextLine().charAt(0);
	    System.out.println(UserMainCode.performSetOperations(arr1,arr2,c));


	}

}
