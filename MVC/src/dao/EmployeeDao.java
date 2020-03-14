package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import data.Employee;

public interface EmployeeDao {
	public default Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
		return connection;
		
	}
	public int insertEmployee(Employee emp);
	public List<Employee> showEmployees();
	public Employee searchEmployee(String empid);

}
