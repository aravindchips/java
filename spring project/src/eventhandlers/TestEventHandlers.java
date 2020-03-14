package eventhandlers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEventHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cont=new ClassPathXmlApplicationContext("eventhandlers-bean.xml");
		cont.start();
		HelloWorld hw=(HelloWorld)cont.getBean("helloworld");
		System.out.println(hw.getMessage());
		cont.stop();
		cont.refresh();

	}

}
