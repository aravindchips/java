package examples;

class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80f;
	double  Hra =1000.50f;
	double totalSalary=0;
	Employee(long Id,String Name,String address,long phone){
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=address;
    	this.employeePhone=phone;
	}
	

	 
	public void calculateSalary() {
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Employees Salary without TA is"+" "+salary);
		totalSalary=salary;
	}
	public void calculateTransportAllowance() {
		double transportAllowance=(10*basicSalary/100);
		double salary=basicSalary+transportAllowance;
		totalSalary=salary;
	}
}
	
  class Manager extends Employee{
		 Manager(long id,String Name,String address,long phone,double salary){
			super(id,Name,address,phone);
			this.employeeId=id;
			this.employeeName=Name;
			this.employeeAddress=address;
			this.employeePhone=phone;
			this.basicSalary=salary;
		}
		 @Override
		 public void calculateTransportAllowance() {
			 double transportAllowance=(15*basicSalary/100);
			 double salary=totalSalary+transportAllowance;
			 System.out.println("Salary Of Manager after TA only is"+salary);
			 //totalSalary=salary;
			 //System.out.println("Manager Total Salary After TA is"+totalSalary);
		 }

}
  class Trainee extends Employee{
		Trainee(long id,String Name,String address,long phone,double salary){
			super(id,Name,address,phone);
			this.employeeId=id;
			this.employeeName=Name;
			this.employeeAddress=address;
			this.employeePhone=phone;
			this.basicSalary=salary;
		}
		@Override
		public void calculateTransportAllowance() {
			double transportAllowance=(10*basicSalary/100);
			double salary=totalSalary+transportAllowance;
			System.out.println("Salary of Trainee after TA only is"+" "+salary);
			//totalSalary=salary;
			//System.out.println(" Trainee Total Salary after TA is"+" "+totalSalary);
		}

}


