package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("spring-bean.xml");
		Student s=(Student)cont.getBean("student");
		s.getName();
		s.showDetails();
		
	}

}