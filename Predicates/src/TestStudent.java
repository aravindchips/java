import java.util.ArrayList;
//import java.util.function.Function;
import java.util.function.Predicate;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("Aravind","1234",50);
		Student stu2=new Student("Venkat","2345",60);
		Student stu3=new Student("Dheeraj","3456",70);
		
		//Predicate<Student> p1=stu->stu.sid.equals("Developer");
		Predicate<Student> p2=stu->stu.total<70;
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		display(p2,list);
		

	}
	public static void display(Predicate<Student> p,ArrayList<Student> list) {
		for(Student st:list) {
			if(p.test(st)) {
				System.out.println(st);
			}

}
	}
}