package Assignmants;
import java.util.ArrayList;
public class ArrayListRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arl=new ArrayList();
		arl.add("Aravind");
		arl.add("Sai");
		arl.add("Venkat");
		arl.add("Dinesh");
		System.out.println(arl.get(0));
		System.out.println("Before Updation");
		System.out.println(arl.get(1));
		arl.set(1, "Dheeraj");
		System.out.println("After Updation");
		System.out.println(arl.get(1));
		arl.remove(2);
		System.out.println(arl.get(2));

	}

}
