package com.sw409.Employee.repositories;


import org.springframework.data.repository.CrudRepository;

import com.sw409.Employee.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
