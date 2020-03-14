package spring;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("This is the message"+message); 
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void display() {
		System.out.println("I am from container class");
	}

}
