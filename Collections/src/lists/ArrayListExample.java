package lists;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("Aravind");
		ar.add("Sai");
		Iterator itr=ar.iterator();
		System.out.println(itr.next()+" Hello " );


	}

}
