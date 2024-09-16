package com.emp.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.emp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	HashMap<Integer,Employee> employee= new HashMap<Integer,Employee>();//database
	
	int empid=56789;


	@Override
	public int addEmployee(Employee emp) {
		employee.put(++empid, emp);
		return empid;
	}

	@Override
	public Employee updateEmployee(int empid, Employee emp) {
		   Employee empobj= employee.put(empid, emp);
		return empobj;
	}

	@Override
	public Employee getEmployee(int empid) {
		
		return employee.get(empid);
	}

	@Override
	public void deleteEmployee(int empid) {
		employee.remove(empid);
		
	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployees() {
	        Set<Entry<Integer,Employee>> result=employee.entrySet();
		return result;
	}

}
