package examples;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mngr=new Manager(126534,"Peter","Chennai India",237844,65000);
		mngr.calculateSalary();
		mngr.calculateTransportAllowance();
		Trainee tre=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		tre.calculateSalary();
		tre.calculateTransportAllowance();
	}

}

