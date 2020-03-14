package eventhandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class RefreshEventHandler implements ApplicationListener<ContextRefreshedEvent> {
	public void onApplicationEvent(ContextRefreshedEvent cste) {
		System.out.println("From Context Refreshed Event...");
	}

}
