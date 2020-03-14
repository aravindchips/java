package setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.Questionbank;

public class TestQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("setter-bean.xml");
		Question q=(Question)cont.getBean("ques");
		q.showAnswers();


	}

}
