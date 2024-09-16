package com.emp.dao;

import java.util.Set;
import java.util.Map.Entry;

import com.emp.model.Employee;

public interface EmployeeDao {

	int addEmployee(Employee emp);

	Employee updateEmployee(int empid, Employee emp);

	Employee getEmployee(int empid);

	void deleteEmployee(int empid);

	Set<Entry<Integer, Employee>> getAllEmployees();
}
