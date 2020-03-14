package jdbcprograms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import jdbcprograms.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e) {
		String query="insert into employee(empid,empname,desg)"+"values('"+e.getEmpid()+"','"+e.getEmpname()+"','"+e.getDesg()+"')";
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(Employee e) {
		String query="update employee set dept='"+e.getDept()+"'where empid='"+e.getEmpid()+"'";
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Employee e) {
		String query="delete from employee where empid='"+e.getEmpid()+"'";
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(String empid,String empname) {
		String query="update employee set empname=? where empid=?";
		return jdbcTemplate.update(query,empname,empid);
	}
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from student", new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Employee> list=new ArrayList<Employee>();
				while(rs.next()) {
					Employee e=new Employee();
					e.setEmpid(rs.getString(1));
					e.setEmpname(rs.getString(2));
					e.setDept(rs.getString(3));
					list.add(e);
				}
				return list;
				
			}
		});
	}
	

}
