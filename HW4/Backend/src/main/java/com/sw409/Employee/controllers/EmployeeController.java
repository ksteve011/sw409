package com.sw409.Employee.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.sw409.Employee.models.Employee;
import com.sw409.Employee.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	// create

	@PostMapping("api/v1/employees")
	public Employee createStudent(@RequestBody Employee employee) {
		return empService.createEmployee(employee);
	}

	// read

	@GetMapping("api/v1/employees")
	public List<Employee> findAllEmployees() {
		return empService.findAllEmployees();
	}
	
	// update
	@PutMapping("api/v1/employees/{employeeid}")
	public void updateStudent(@PathVariable("employeeid") Integer id, @RequestBody Employee employee) {
		empService.updateEmployee(id, employee);
	}

	// delete
	@DeleteMapping("api/v1/students/{employeeid}")
	public void deleteEmployee(@PathVariable("employeeid") Integer id) {
		empService.deleteEmployee(id);
	}

}
