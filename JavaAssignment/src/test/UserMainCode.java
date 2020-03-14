package test;

import java.util.ArrayList;

public class UserMainCode {
	public static ArrayList<Integer> performSetOperations(ArrayList<Integer> arr1,ArrayList<Integer> arr2, char c)
	{
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
    int k = 0;
    switch (c) 
    {
    	case '+':
    		      arr1.removeAll(arr2);
    		      arr1.addAll(arr2);
    		      ar1 = arr1;
    		      break;
    	case '*':
    		      arr1.retainAll(arr2);
    		      ar1 = arr1;
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
                   ar1.add(arr1.get(i));
                  }
                  break;
    }
    return ar1;
	}

}
