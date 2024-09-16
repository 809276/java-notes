package com.emp.service;

import java.util.Map.Entry;
import java.util.Set;

import com.emp.model.Employee;

public interface EmployeeService {

	int addEmployee(Employee emp);

	Employee updateEmployee(int empid, Employee emp);

	Employee getEmployee(int empid);

	void deleteEmployee(int empid);

	Set<Entry<Integer, Employee>> getAllEmployees();
}
