import java.util.ArrayList;
import java.util.function.Predicate;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Students> l=new ArrayList<Students>();
		Students s1=new Students("Aravind",90);
		Students s2=new Students("Venkat",90);
		Students s3=new Students("Dinesh",70);
		Students s4=new Students("Chandu",75);
		Students s5=new Students("Dheeraj",60);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		Predicate<Students> p=s->s.marks>=60;

	}

}
