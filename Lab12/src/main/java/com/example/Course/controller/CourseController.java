package com.example.Course.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.models.Course;
import com.example.Course.services.CourseService;

@RestController
@CrossOrigin("*")
public class CourseController {

	@Autowired
	CourseService courseService;
	@GetMapping("api/courses")
	public ArrayList<Course>getAllCourses(){
		
		return courseService.getAllCourses();
	}
	
}
