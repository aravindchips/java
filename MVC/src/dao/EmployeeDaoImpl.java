package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	public int insertEmployee(Employee emp) {
		int result=0;
		try {
			Connection connection=getConnection();
			String query="insert into employee values(?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(query);
			
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getEmpname());
			ps.setString(3, emp.getDept());
			ps.setString(4, emp.getDesg());
			ps.setString(5, emp.getEmail());
			result=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
		
	}
	public List<Employee> showEmployees() {
		List<Employee> list=new ArrayList<Employee>();
		try {
			Connection connection=getConnection();
			Statement ps=connection.createStatement();
			ResultSet rs=ps.executeQuery("select * from employee");
			while(rs.next())
			{
			Employee u=new Employee();
			u.setEmpid(rs.getString(1));
			u.setEmpname(rs.getString(2));
			u.setDept(rs.getString(3));
			u.setDesg(rs.getString(4));
			u.setEmail(rs.getString(5));
			list.add(u);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	public Employee searchEmployee(String empid) {
		
		try {
			Connection connection=getConnection();
			String query="select *from employee where empid=?";
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, empid);
			ResultSet rs=ps.executeQuery();
			rs.next();
			Employee emp=new Employee();
			emp.setEmpid(rs.getString(1));
			emp.setEmpname(rs.getString(2));
			emp.setDept(rs.getString(3));
			emp.setDesg(rs.getString(4));
			emp.setEmail(rs.getString(5));
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

}
