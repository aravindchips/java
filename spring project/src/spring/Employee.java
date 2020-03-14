package spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Employee {
	Connection con;
	private String empid;
	public String empname;
	public String dept;
	public String desg;
	public String email;
	public Employee() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
			System.out.println("Connection Successfull");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public Employee(String empid) {
		this.empid=empid;
		
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void results() {
		try {
			ArrayList list=new ArrayList();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from employee where empid="+getEmpid());
			while(rs.next()) {
				empid=rs.getString(1);
				empname=rs.getString(2);
				dept=rs.getString(3);
				desg=rs.getString(4);
				email=rs.getString(5);
				list.add(empid);
				list.add(String.valueOf(empname));
				list.add(String.valueOf(dept));
				System.out.println(list);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		Employee emp=new Employee();
		//emp.setEmpid(1);
		emp.results();
	}
		
 
}
