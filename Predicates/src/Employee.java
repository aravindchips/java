
public class Employee {
	String ename;
	String edesg;
	String ecity;
	float  esal;
	Employee(String ename,String edesg,String ecity,float esal ){
		this.ename=ename;
		this.edesg=edesg;
		this.ecity=ecity;
		this.esal=esal;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", edesg=" + edesg + ", ecity=" + ecity + ", esal=" + esal + "]";
	}
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(ename.equals(e.ename)&& edesg.equals(e.edesg)&& ecity.equals(e.ecity)&& esal==e.esal) {
			return true;
		}
		else {
			return false;
		}
	}

}
