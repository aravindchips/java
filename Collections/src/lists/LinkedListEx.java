package lists;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		LinkedList ll=new LinkedList();
		ArrayList ar=new ArrayList(3);
		ll.add("Venkat");
		ll.add("Dinesh");
		ar.add("");
		ar.add("");
		ar.add("");
		Iterator itr=ll.iterator();
		//System.out.println(ll.next());
		System.out.println(ll);
		Collections.copy(ar, ll);
		System.out.println(ar);

	}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index is not suited");
		}

}
}