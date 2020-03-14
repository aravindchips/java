package prime;

public class UserMainCode {
	
	public static boolean isPrime(int number) {
		 boolean flag=true;
		 //int count=0;
		 for(int i = 2; i <= number/2; i++)
	        {
	            // condition for nonprime number
	            if(number % i == 0)
	            {
	                flag=false;
	            }
	        }
		 
		return flag;
	}

}
