package Set;
import java.util.*;
class Student implements Comparable<Student>{
	String name;
	String id;
	Student(String name, String id){
		this.name=name;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	public int compareTo(Student stu) {
		if(name.compareTo(stu.name)<0) {
			return -1;
		}
		else if(name.compareTo(stu.name)>0) {
			return 1;
		}
		else
			return 0;
	}
}
public class SetsDescription {
	public static void main(String args[]) {
		Set s=new TreeSet();
		s.add("India");
		s.add("Japan");
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		Set s1=new TreeSet();
		s1.add(new Student("101","Aravind"));
		s1.forEach(System.out::println);
	}

}
