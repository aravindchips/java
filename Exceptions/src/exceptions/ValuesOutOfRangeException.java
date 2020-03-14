package exceptions;

public class ValuesOutOfRangeException extends NumberFormatException {
	ValuesOutOfRangeException(){
		super("Values Should Between 0 and 100 only...");
	}

}
