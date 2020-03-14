package test;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentDetails>list=new ArrayList<StudentDetails>();
		StudentDetails s1=new StudentDetails("Aravind",90);
		StudentDetails s2=new StudentDetails("venkat",55);
		StudentDetails s3=new StudentDetails("dinesh",60);
		StudentDetails s4=new StudentDetails("chandu",35);
		StudentDetails s5=new StudentDetails("dheeraj",48);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("students Grade Details Are As Follows ");
	Predicate<StudentDetails>p=s->s.marks>=40;
	Function<StudentDetails,String>f=stud->{
		int m=stud.marks;
		if(m>=80)
			return "Distinction";
		else if(m>=60 && m<=79)
			return "FirsT Class";
		else if(m>=40 && m<=50)
			return "Second class";
		else
			return "fail";
	};
	Consumer<StudentDetails>c=std->{
		
		System.out.print(std.name+"  ");
		System.out.println(f.apply(std));
	};
	for(StudentDetails std:list) {
		if(p.test(std))
		{
			c.accept(std);
		}
			
	}


	}

}
