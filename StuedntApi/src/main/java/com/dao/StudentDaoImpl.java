package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		boolean status = false;
		
		try {
			sessionFactory.getCurrentSession().persist(student);
			status = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from student",Student.class);
		List<Student> list = query.getResultList();
		return list;
	}

	
	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
			sessionFactory.getCurrentSession().remove(student);
			status = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from student where student_id=:student_id",Student.class);
		query.setParameter("student_id", student.getStudent_id());
		List<Student> list = query.getResultList();
		return list;
	}


	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
			sessionFactory.getCurrentSession().merge(student);
			status = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	

}
