package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("qb-bean.xml");
		Questionbank qbnk=(Questionbank)cont.getBean("qb");
		qbnk.showAnswers();

	}

}