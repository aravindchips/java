import java.util.function.Predicate;
class TestUser{
	String uid;
	String pswd;
	TestUser(String uid,String pswd){
		super();
		this.uid=uid;
		this.pswd=pswd;
	}
	@Override
	public String toString() {
		return "TestUser [uid=" + uid + ", pswd=" + pswd + "]";
	}
}


public class User {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUser u1=new TestUser("admin","1234");
		TestUser u2=new TestUser("aravind","4321");
		Predicate<TestUser>tu=u->u.uid.equals("admin")&&u.pswd.equals("1234");
		if(tu.test(u2))
			System.out.println("valid");
		else
			System.out.println("Invalid");

	}

}