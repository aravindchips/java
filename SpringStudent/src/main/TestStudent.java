package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.StudentDaoImpl;
import data.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl sdao=(StudentDaoImpl)context.getBean("edao");
		Student student=new Student();
		
		Scanner sc=new Scanner(System.in);
		List<Student> students=sdao.getStudents();
                 for(Student s:students) 
	               System.out.println(s.getId()+s.getName()+s.getAge());
                

	}

}
