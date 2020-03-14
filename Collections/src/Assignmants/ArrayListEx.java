package Assignmants;
import java.util.*;

class Stud {
	String name;
	String id;
	Stud(String name, String id){
		this.name=name;
		this.id=id;
	}
	public String  toString() {
		return name+" "+id;
	}
}
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{
			System.out.println("Inside the thread...");
		};
		Thread t = new Thread(r);
		t.start();
		ArrayList<Stud> ar = new ArrayList<Stud>();
		ar.add(new Stud("Aravind","1001"));
		ar.add(new Stud("Ramesh","1008"));
		ar.add(new Stud("Krishna","1005"));
		System.out.println(ar);
		Collections.sort(ar, (Stud s1,Stud s2)->s1.name.compareTo(s2.name));
		ar.forEach(System.out::println);
	}

}
