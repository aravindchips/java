package sumofdigits;
class Assignment3 {
	int x=10,y=0,z;
	public void division()throws ArithmeticException{
		z=x/y;
		if(z!=1)
			
		System.out.println(z);
		
		
	}
}

public class AssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 ass3=new Assignment3();
		try{	
			ass3.division();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
