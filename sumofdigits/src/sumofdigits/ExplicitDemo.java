package sumofdigits;

public class ExplicitDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		try {
			if(x==10)
				throw new StringIndexOutOfBoundsException("String error occured...");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
	}

}