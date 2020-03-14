package mapping;
import java.util.*;
class CollegeCourses{
    String  b1,b2,b3;
	CollegeCourses(String b1,String b2,String b3){
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
	}
	@Override
	public String toString() {
		return "CollegeCourses [b1=" + b1 + ", b2=" + b2 + ", b3=" + b3 + "]";
	}
}

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,CollegeCourses> hm=new HashMap<String,CollegeCourses>();
		hm.put("jntu",new CollegeCourses("cse","ece","mech"));
		hm.put("jntuK",new CollegeCourses("cse","eee","ece"));
		hm.put("jntuA",new CollegeCourses("cse","mech","eee"));
		hm.put("OU",new CollegeCourses("ece","eee","mech"));
		//System.out.println(hm);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department to see the colleges list");
	    String branch=sc.next();
	    System.out.println("ur course is offered in ");
	    Set entries=hm.entrySet();
	    Iterator itr=entries.iterator();
	    while(itr.hasNext()){
	    	Map.Entry me=(Map.Entry)itr.next();
	    	CollegeCourses cc=(CollegeCourses)me.getValue();
	    	//branch=(cc)me.getValue();
	    	
	    	if(cc.b1.equals(branch)||cc.b2.equals(branch)||cc.b3.equals(branch)) {
	    		System.out.println(me.getKey());
	    	}
	    	    		
    	}

	}

}
