package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Student;


public interface StudentService {

	public boolean saveStudent(Student student);

	public List<Student> getStudents();

	public boolean deleteStudent(Student student);

	public List<Student> getStudentByID(Student student);

	public boolean updateStudent(Student student);

}
