package Try;

abstract class Name {
	
	abstract public void id();
	
	public void calCulation() {
		System.out.println("Marks is to be caluculated");
	}
	

}
class MyName extends Name{
	public void id() {
		System.out.println("Id of Person");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyName mn=new MyName();
		mn.calCulation();
		mn.id();

	}

}
