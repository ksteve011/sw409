package com.sw409.Employee.services;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.sw409.Employee.models.Employee;
	import com.sw409.Employee.repositories.EmployeeRepository;

	@Service	
	public class EmployeeService {

		@Autowired
		EmployeeRepository employeeRepository;
		
		//we will be creating create, read, update, and delete methods
		List<Employee> employeeList = new ArrayList<>();
		
		//create
		public Employee createEmployee(Employee employee) 
		{
			employeeList.add(employee);		
			return employee;
		}
		
		//read
		public List<Employee> findAllEmployees()
		{
			return (List<Employee>) employeeRepository.findAll();
		}
		
		//update
		public void updateEmployee(Integer id, Employee employee)
		{
			for (int i = 0; i < employeeList.size(); i++) {
				if(employeeList.get(i).getEmp_id().equals(id)) {
					employeeList.set(i, employee);
				}
			}
		}

		
		
		//delete
		public void deleteEmployee(Integer id)
		{
			for (int i = 0; i < employeeList.size(); i++) {
				if(employeeList.get(i).getEmp_id() == id)
				{
					employeeList.remove(i);
				}
			}
		}
		
}

