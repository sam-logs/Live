package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200") 
@RequestMapping("/student")
public class Controller {
	
	@Autowired(required =false)
	private StudentService studentService;
	
	@PostMapping("/save")
	public boolean saveStudent(@RequestBody Student student) {
		System.out.println("hey");
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/view")
	public List<Student> allStudetns(){
		return studentService.getStudents();
	}
	
	@DeleteMapping("/delete/{student_id}")
	public boolean deleteStudent(@PathVariable int student_id, Student student) {
		student.setStudent_id(student_id);
		return studentService.deleteStudent(student);
	}
	
	@GetMapping("/view/{student_id}")
	public List<Student> allStudentByID(@PathVariable int student_id,Student student){
		student.setStudent_id(student_id);
		return studentService.getStudentByID(student);
	}
	
	@PutMapping("/update/{student_id}")
	public boolean updateStudent(@RequestBody Student student, @PathVariable int student_id) {
		student.setStudent_id(student_id);
		return studentService.updateStudent(student);
	}

}
