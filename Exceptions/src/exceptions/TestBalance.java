package exceptions;

public class TestBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails ad=new AccountDetails();
		ad.doCredit();
		try {
			ad.withDraw();
		}
		catch(InsufficientBalanceException ie) {
			System.out.println(ie);
		}

	}

}
