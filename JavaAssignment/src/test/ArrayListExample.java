package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static ArrayList<Integer> performSetOperations(ArrayList<Integer> arr1,ArrayList<Integer> arr2, char c)
	{
	ArrayList<Integer> arl1 = new ArrayList<Integer>();
    int k = 0;
    switch (c) 
    {
    	case '+':
    		     arr1.removeAll(arr2);
    		     arr1.addAll(arr2);
    		     arl1 = arr1;
    		     break;
    	case '*':
    		     arr1.retainAll(arr2);
    		     arl1 = arr1;
    		     break;
    	case '-':
                 for (int i = 0; i < arr1.size(); i++) 
                 {
                  k = 0;
                 for (int j = 0; j < arr2.size(); j++) 
                  {
                       if (arr1.get(i) == arr2.get(j))
                       k = 1;
                 }
                   if (k == 0)
                    arl1.add(arr1.get(i));
                  }
                   break;
    }
    return arl1;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample axe=new ArrayListExample();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Size of an ArrayList");
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> ar1 = new ArrayList<Integer>();
	    ArrayList<Integer> ar2 = new ArrayList<Integer>();
	    System.out.println("Enter Elements in First ArrayList");
	    for (int i = 0; i < 2*n; i++)
	    {
	    ar1.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter Elements in Second ArrayList");
	    for (int i = 0; i < 2*n; i++)
	    {
	    ar2.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter your choice : '+' for SET-UNION, '*' for SET-INTERSECTION, '-' for SET-DIFFERENCE ");
	    char c = sc.nextLine().charAt(0);
        System.out.println("Resultant Arraylist : "+axe.performSetOperations(ar1,ar2,c));


	}

}
