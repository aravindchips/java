package database;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of arraylists");
	    Scanner sc = new Scanner(System.in);
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> arr1 = new ArrayList<Integer>();
	    ArrayList<Integer> arr2 = new ArrayList<Integer>();
	    System.out.println("Enter  values  for ArrayList1");
	    for (int i = 0; i < 2*n; i++) {
	            arr1.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter  Values for Arraylist2");
	    for (int i = 0; i < 2*n; i++) {
	            arr2.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter the Operation to perform");
	    char c = sc.nextLine().charAt(0);
	    System.out.println(getvalues(arr1, arr2, c));
	  }
	  public static ArrayList<Integer> getvalues(ArrayList<Integer> a1, ArrayList<Integer> a2, char c) {
	    ArrayList<Integer> ar1 = new ArrayList<Integer>();
	    int k = 0;
	    switch (c) {
	    case '+':
	              a1.removeAll(a2);
	              a1.addAll(a2);
	              ar1 = a1;
	              break;
	    case '*':
	              a1.retainAll(a2);
	              ar1 = a1;
	              break;
	    case '-':
	              for (int i = 0; i < a1.size(); i++) {
	              k = 0;
	              for (int j = 0; j < a2.size(); j++) {
	              if (a1.get(i) == a2.get(j))
	              k = 1;
	              }
	              if (k == 0)
	              ar1.add(a1.get(i));
	              }
	              break;
	              }
	              return ar1;

	}

}
