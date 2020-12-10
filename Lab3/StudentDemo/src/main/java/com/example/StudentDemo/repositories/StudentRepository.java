package com.example.StudentDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.StudentDemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
