package examples;

public class MyArea {
	
	int length,height,side;
	
	public void areas(int side) {
		int result=4*side;
		System.out.println("The area of square is"+" "+result);
	}
	public void areas(int length,int height) {
		int result=length*height;
		System.out.println("The area of rectangle is"+" "+result);
	}
	public void areas(int height,float breadth) {
		double result=0.5*(height*breadth);
		System.out.println("The area of triangle is"+" "+result);
		
	}
	public void areas(float breadth,int length,int height,int side) {
		
		double result=(breadth+length+height+side);
		System.out.println("The perimeter  of quadrilateral is"+" "+result);
	}

}
