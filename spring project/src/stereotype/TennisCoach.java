package stereotype;


import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach {
	private FortuneService fs;
	
	public TennisCoach(FortuneService fs) {
		this.fs=fs;
	}
	public String getDailyWorkOut() {
		return "Do Work Out Daily For Success...";
	}
	public String getFortune() {
		return fs.getMessage();
	}

}
