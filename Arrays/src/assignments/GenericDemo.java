package assignments;

public class GenericDemo<A> {
	A a;
	A b;
	public GenericDemo(A obj1,A obj2) {
		a=obj1;
		b=obj2;
	}
	public void disp() {
		System.out.println(a+","+b);
	}
	public A reta() {
		return a;
	}
	public A retb() {
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo <Integer> obj=new GenericDemo <Integer>(11,13);
		int x=(int)obj.reta();
		int y=(int)obj.retb();
		int z=x+y;
		System.out.println(z);
		GenericDemo<String> obj1=new GenericDemo<String>("Hello","Aravind");
		obj1.disp();
		

	}

}
