package examples2;

abstract class Test {
	
	abstract public void id();
	
	public void calCulation() {
		System.out.println("Marks is to be caluculated");
	}
	

}
class MyName extends Test{
	public void id() {
		System.out.println("Id of Person");
	}
}
public class Test{
	public static void main(String args[]) {
	MyName mn=new MyName();
	mn.calCulation();
	mn.id();
}

}