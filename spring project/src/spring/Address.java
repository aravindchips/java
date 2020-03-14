package spring;

public class Address {
	String dno;
	String street;
	String city;
	public Address(String dno,String street,String city) {
		this.dno=dno;
		this.street=street;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	
	

}
