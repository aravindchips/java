package assignment;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80f;
	double hra=100.50f;
	Employee(long id,String name,String address,long phoneNumber){
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phoneNumber;
		
	}
	
	public void calculateSalary() {
		double Salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		
		System.out.println(Salary);
	}

}

public class Manager extends Employee{
	Manager(long id,String name,String address,long phone,double salary){
		
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		
		
	}
}
