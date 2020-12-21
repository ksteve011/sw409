package com.sw409.Employee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	String emp_name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer emp_id;
	String emp_title;
	
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_title() {
		return emp_title;
	}

	public void setEmp_title(String emp_title) {
		this.emp_title = emp_title;
	}

	public Employee(String name, Integer id, String title) {
	
		this.emp_name = name;
		this.emp_id = id;
		this.emp_title = title;
	}
	
	public Employee() {
		
	}
}