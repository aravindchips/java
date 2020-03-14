package jdbcprograms;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbcprograms.Employee;

public class TestEmployeeJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("jdbc-springbean.xml");
		EmployeeDao empdao=(EmployeeDao)cont.getBean("edao");
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		
		List<Employee> employees=empdao.getEmployees();
                 for(Employee e:employees) 
	               System.out.println(e.getEmpid()+e.getEmpname()+e.getDept());
                

	}

}
