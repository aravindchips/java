package examp;
class Demo1 {
	public interface One{
		void greater(int e,int f);
	}
}
public class Demo extends FirstInterfce.one  implements Demo1.One{
	 public void greater(int e,int f) {
		 int h=(e>f)?e:f;
		 System.out.println(h);
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dm=new Demo();
		dm.disp();
		dm.greater(10,20);

	}

}
