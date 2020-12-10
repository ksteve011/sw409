package com.example.StudentDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDemo.models.Student;
import com.example.StudentDemo.repositories.StudentRepository;

@Service	
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	//we will be creating create, read, update, and delete methods
	List<Student> studentList = new ArrayList<>();
	
	//create
	public Student createStudent(Student student) 
	{
		studentList.add(student);		
		return student;
	}
	
	//read
	public List<Student> findAllStudents()
	{
		return (List<Student>) studentRepository.findAll();
	}
	
	//update
	public void updateStudent(Integer id, Student student)
	{
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId().equals(id)) {
				studentList.set(i, student);
			}
		}
	}
	
	//delete
	public void deleteStudent(Integer id)
	{
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId() == id)
			{
				studentList.remove(i);
			}
		}
	}
	
	
}
