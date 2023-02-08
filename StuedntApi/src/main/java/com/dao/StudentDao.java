package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	public boolean saveStudent(Student student);
	public List<Student> getStudents();
	public boolean deleteStudent(Student student);
	public List<Student> getStudentByID(Student student);
	public boolean updateStudent(Student student);
	
	

}
