package com.emp.ui;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;
import com.emp.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service= new EmployeeServiceImpl();
		
		while(true) {
		System.out.println("****Employee Management Application****");
		System.out.println("1.Add Employee");
		System.out.println("2.update Employee");
		System.out.println("3.get Employee");
		System.out.println("4.delete Employee");
		System.out.println("5.Get ALL Employee");
		
		Scanner sc= new Scanner(System.in);
		
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			 System.out.println("**Add Employee***");
			 System.out.println("Enter EMployee name");
			 String empName=sc.next();
			 System.out.println("Enter EMployee Salary");
			 int empSal=sc.nextInt();
			 System.out.println("Enter EMployee Address");
			 String empAdd=sc.next();
			 System.out.println("Enter EMployee Email id");
			 String EmpMail=sc.next();
			 
			 Employee emp= new Employee(empName, empSal, empAdd, EmpMail);
			 int empid=service.addEmployee(emp);
			 System.out.println("Employee inserted suucfully :"+empid);
			 break;
		case 2:
			 System.out.println("**Update Employee***");
			 System.out.println("Enter Employee Id");
			 int eid=sc.nextInt();
			 System.out.println("Enter EMployee name");
			 String eName=sc.next();
			 System.out.println("Enter EMployee Salary");
			 int eSal=sc.nextInt();
			 System.out.println("Enter EMployee Address");
			 String eAdd=sc.next();
			 System.out.println("Enter EMployee Email id");
			 String EMail=sc.next();
			 
			 Employee emp1= new Employee(eName, eSal, eAdd, EMail);
			 
			 Employee empo=service.updateEmployee(eid, emp1);
			 System.out.println("employee updated :"+eid);
			 
			 break;
		case 3:
			 System.out.println("**Get Employee***");
			  System.out.println("Enter Employee id");
			  int eid1=sc.nextInt();
			  Employee eobj=service.getEmployee(eid1);
			  System.out.println(eobj);
			 break;
		case 4:
			 System.out.println("**Delete Employee***");
			 System.out.println("Enter Employee id");
			  int eid2=sc.nextInt();
			  service.deleteEmployee(eid2);
			  System.out.println("employee deleted :"+eid2);
			 break;
			 
		case 5:
			 System.out.println("**Get All Employee***");
			Set<Entry<Integer,Employee>> itr= service.getAllEmployees();
			Iterator<Entry<Integer,Employee>> res=itr.iterator();
			while(res.hasNext())
			{
				Entry<Integer,Employee> finalResult=res.next();
				System.out.println(finalResult.getKey()+" "+finalResult.getValue());
			}
			 break;
		default:
			System.out.println("Wrong Input please enter valid input");
		}
		}
	}
	
}
