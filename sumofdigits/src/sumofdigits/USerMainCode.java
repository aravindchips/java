package sumofdigits;

public class USerMainCode {

	public static int checkSum(int number) {
		int sum=0;
	
		 while (number != 0) 
	        { 
	            sum = sum + number % 10; 
	            number = number/10; 
	        } 
	      if(sum%2==0) {
	    	  return -1;
	      }
	      else {
	    	  return 1;
	      }
	}

}
