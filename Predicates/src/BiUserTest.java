import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emply{
	String name;
    double salary;
    Emply(String name,double salary){
    	this.name=name;
    	this.salary=salary;
    }
}

public class BiUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emply>l=new ArrayList<Emply>();
		l.add(new Emply("Aravind",10000));
		l.add(new Emply("venkat",20000));
		l.add(new Emply("chandu",30000));
		l.add(new Emply("dinesh",40000));
		BiConsumer<Emply,Double> c=(e,d)->e.salary=e.salary+d;
		for(Emply e:l) {
			c.accept(e,500.0);
		}
		for(Emply e:l) {
			System.out.println("Employee name"+e.name);
			System.out.println("Employee Salary"+e.salary);
			System.out.println();
		}



	}

}
