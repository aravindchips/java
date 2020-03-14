package dao;

import java.util.List;

import data.Student;

public interface IStudentDAO {
	//used to create a record in table
	public void create(Student student);
	
	//used to list down all the records from student table
	public List<Student> getStudents();
	

}
