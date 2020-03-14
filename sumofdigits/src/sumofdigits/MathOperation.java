package sumofdigits;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		float avg;
		try{
		int array[]=new int[args.length];
		for(int i=0;i<array.length;i++)
		{
		array[i]=Integer.parseInt(args[i]);
		sum=sum+array[i];
		}
		avg=sum/array.length;
		System.out.println(sum);
		System.out.println(avg);

		}
		
		catch(ArithmeticException e)
		{
		System.out.println("From ArithmeticException... divide by zero cant done");
		}
		catch(NumberFormatException e)
		{
		System.out.println("From NumberFormatException...");
		}
		

	}

}
