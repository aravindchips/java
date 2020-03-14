package Assignmants;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arl=new ArrayList();
		
		arl.add("Aravind");
		arl.add("Dinesh");
		arl.add("Venkat");
		arl.add("Dheeraj");
		arl.add("Chandu");
		arl.add("Hari");
		Iterator itr=arl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//arl.forEach(System.out::println);

	}

}
