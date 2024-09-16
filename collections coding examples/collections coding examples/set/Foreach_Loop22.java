package com.collections.set;

import java.util.HashSet;

//Write a Java program to Print a HashSet collection using the foreach loop
public class Foreach_Loop22 {
	public static void main(String[] args) 
	{
		HashSet dif_type = new HashSet();
		dif_type.add(8);
		dif_type.add("Tutor Joes");
		dif_type.add(95.58);
		dif_type.add('T');
		dif_type.add(false);
		dif_type.add(45.789784);
 
		System.out.println("Print a HashSet collection using the foreach loop ..");
		for (Object it : dif_type)
		{			
			System.out.println( it);
		}
	}
}
