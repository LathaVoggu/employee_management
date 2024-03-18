package com.employee.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.assignment.dao.EmployeeRepository;
import com.employee.assignment.exceptions.EmployeeNotFoundException;
import com.employee.assignment.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> OptEmployee = employeeRepository.findById(id);
		Employee employee = OptEmployee
				.orElseThrow(() -> new EmployeeNotFoundException("No Employee with id " + id + " found"));
		return employee;
	}

	@Override
	public List<Employee> getEmployeesByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);

	}

	@Override
	public List<Employee> getEmployeesByWorkLocation(String workLocation) {
		return employeeRepository.findByWorkLocation(workLocation);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		Optional<Employee> OptEmployee = employeeRepository.findById(id);
		OptEmployee
				.orElseThrow(() -> new EmployeeNotFoundException("No Employee with id " + id + " found for deletion"));

		employeeRepository.deleteById(id);
	}

	@Override
	public void addNewEmployee(Employee employee) {

		employeeRepository.save(employee);
	}

}