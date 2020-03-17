package stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("stero-bean.xml");
		TennisCoach tch=cont.getBean("myCoach",TennisCoach.class);
		System.out.println(tch.getDailyWorkOut());
		System.out.println(tch.getFortune());

	}

}