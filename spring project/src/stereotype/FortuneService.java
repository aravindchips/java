package stereotype;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {
	public String getMessage() {
		return "I am form fortune service class";
	}

}
