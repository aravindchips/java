package test;

public class InvalidAgeException extends NumberFormatException {
	InvalidAgeException(){
		super("Ur age is not valid for voting");
	}

}
