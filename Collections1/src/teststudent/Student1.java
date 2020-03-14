package teststudent;

public class Student1 {
	String name;
	Integer m1,m2,m3;
	Student1(String name,int m1,int m2,int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getM1() {
		return m1;
	}
	public void setM1(Integer m1) {
		this.m1 = m1;
	}
	public Integer getM2() {
		return m2;
	}
	public void setM2(Integer m2) {
		this.m2 = m2;
	}
	public Integer getM3() {
		return m3;
	}
	public void setM3(Integer m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

}
