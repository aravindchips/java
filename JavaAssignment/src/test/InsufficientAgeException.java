package test;

public class InsufficientAgeException extends NumberFormatException{
	public InsufficientAgeException() {
		
		super("Ur age is not suuficient to vote");
	}
	

}
