package com.employee.assignment.service;

import java.util.List;

import com.employee.assignment.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	List<Employee> getEmployeesByFirstName(String firstName);

	List<Employee> getEmployeesByWorkLocation(String workLocation);

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);

	void addNewEmployee(Employee employee);
}
