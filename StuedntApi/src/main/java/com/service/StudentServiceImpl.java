package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.model.Student;



@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.saveStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.getStudents();
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(student);
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getStudentByID(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

}
