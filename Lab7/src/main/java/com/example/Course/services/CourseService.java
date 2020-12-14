package com.example.Course.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Course.models.Course;
import com.example.Course.repositiories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public ArrayList<Course> getAllCourses(){
	
		return (ArrayList<Course>) courseRepository.findAll();
	}
	
	
}
