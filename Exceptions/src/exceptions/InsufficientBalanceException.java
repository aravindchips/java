package exceptions;

public class InsufficientBalanceException  extends Exception{
	InsufficientBalanceException(){
		super("Your Balance Is Below 5000/- S0,Please Maintain Minimum Balance For Further Withdrawls...");
	}

}
