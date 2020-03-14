package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext factory=new FileSystemXmlApplicationContext("d://beans.xml");
		HelloWorld hr=(HelloWorld)factory.getBean("helloworld");
		hr.getMessage();
		hr.display();

	}

}
