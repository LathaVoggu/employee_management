package com.employee.assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.assignment.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByWorkLocation(String workLocation);

	List<Employee> findByFirstName(String firstName);

}
