package com.emp.service;

import java.util.Map.Entry;
import java.util.Set;

import com.emp.dao.EmployeeDao;
import com.emp.dao.EmployeeDaoImpl;
import com.emp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao= new EmployeeDaoImpl();//daoa layerd 
	
	@Override
	public int addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
	}

	@Override
	public Employee updateEmployee(int empid, Employee emp) {
		
		return dao.updateEmployee(empid, emp);
	}

	@Override
	public Employee getEmployee(int empid) {
		
		return dao.getEmployee(empid);
	}

	@Override
	public void deleteEmployee(int empid) {
		dao.deleteEmployee(empid);
		
	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

}
