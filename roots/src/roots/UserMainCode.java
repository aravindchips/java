package roots;

public class UserMainCode {
	public static String findRoots(int a,int b,int c) {
		
		int d=(b*b)-4*a*c;
		if(d>0) 
			return"real and unequal";
		
		else if(d==0)
			return "real and equal";
		else
			return"roots are imaginary";
		
		
	}

}
