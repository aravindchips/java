package examp;

public class Recursive {
  class Fact{
	  public int fact(int n){
			int f;
			if(n==0||n==1) {
				return 1;
			}
			else
				 f =n*(n-1);
			
			     return f;
			
		
		}
		
	}
  public void disp() {
		Fact fac=new Fact();
		System.out.println(fac.fact(6));
	}

}
