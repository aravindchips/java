package noxmlfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
	@Bean
	public HelloWorld getName() {
		return new HelloWorld();
	}
	@Bean
	public Employee getString() {
		return new Employee("Aravind");
	}

}
