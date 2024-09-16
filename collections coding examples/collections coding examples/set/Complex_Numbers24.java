package com.collections.set;

import java.util.HashSet;

//Write a Java program to Create a set of Complex numbers using HashSet collections
public class Complex_Numbers24 {
	public static void main(String[] args)
	{
		HashSet<Complex> comp = new HashSet<Complex>();
		comp.add(new Complex(10, 20));
		comp.add(new Complex(20, 30));
		comp.add(new Complex(30, 40));
		comp.add(new Complex(40, 50));
		comp.add(new Complex(50, 60));
 
		System.out.println("Hash Set of Complex Numbers.. ");
		for (Complex c: comp) 
		{
			c.printComplex();
		}
	}
}
class Complex 
{
	int re;
	int img;    
 
	Complex(int r, int i) 
	{
		this.re = r;
		this.img = i;
	}
 
	void printComplex()
	{
		System.out.println("Complex Number: " + re + " + " + img + "i");
	}
}
