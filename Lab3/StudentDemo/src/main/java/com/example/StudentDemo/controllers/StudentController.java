package com.example.StudentDemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.StudentDemo.models.Student;
import com.example.StudentDemo.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService stuService;
	
	//create
	
	@PostMapping("api/v1/students")
	public Student createStudent(@RequestBody Student student)
	{
		return stuService.createStudent(student);
	}
	
	//read
	
	@GetMapping("api/v1/students")
	public List<Student> findAllStudents()
	{
		return stuService.findAllStudents();
	}
	
	//update
	@PutMapping("api/v1/students/{studentid}")
	public void updateStudent(@PathVariable("studentid") Integer id, @RequestBody Student student)
	{
		stuService.updateStudent(id, student);
	}
	
	
	//delete
	@DeleteMapping("api/v1/students/{studentid}")
	public void deleteStudent(@PathVariable("studentid") Integer id)
	{
		stuService.deleteStudent(id);
	}
	
}
