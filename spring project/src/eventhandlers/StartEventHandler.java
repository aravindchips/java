package eventhandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent> {
	public void onApplicationEvent(ContextStartedEvent cste) {
		System.out.println("From Context Started Event...");
	}

}
