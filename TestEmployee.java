package com.inheritance;
// parent
class EEmployee{
	String name;
	int age;
	String address;
public EEmployee(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
public void displayinfo() {
	 System.out.println("emlployee name:"+name);
	 System.out.println("emlployee age:"+age);
	 System.out.println("emlployee address:"+address);
 }	
}

// first child
class Permanentemployees extends EEmployee{
	double salary;
	public Permanentemployees(String name, int age, String address,double salary) {
		// TODO Auto-generated constructor stub
		super(name,age,address);
		this.salary=salary;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("salay is :"+salary);
	}
	
}

// parent second child
class Contractemployee extends EEmployee{
	int hourbasis;

	public Contractemployee(String name, int age, String address,int hourbasis) {
		super(name,age,address);
		this.hourbasis = hourbasis;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("hourly salary:"+hourbasis);
	}
}


public class TestEmployee {
public static void main(String[] args) {
	Permanentemployees pm=new Permanentemployees("ram", 12, "hud", 123.33);
	Contractemployee ce=new Contractemployee("rani", 32, "gtl", 1222);
	pm.displayinfo();
	
	System.out.println();
	ce.displayinfo();
	
	
}
}
