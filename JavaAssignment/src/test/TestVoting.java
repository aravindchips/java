package test;

public class TestVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting vt=new Voting();
		try{
			vt.testAge();
		}
		catch(InsufficientAgeException ife) {
			System.out.println(ife);
		}
		catch(InvalidAgeException iae) {
			System.out.println(iae);
		}

	}

}
