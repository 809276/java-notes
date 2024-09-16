package com.collections.set;

import java.util.HashSet;

//Write a Java program to Create a HashSet with different types of items
public class Different_TypesItems21 {
	public static void main(String[] args) 
	{
		HashSet dif_type = new HashSet();
		dif_type.add(8);
		dif_type.add("Tutor Joes");
		dif_type.add(95.58);
		dif_type.add('T');
		dif_type.add(false);
		dif_type.add(45.789784);
 
		System.out.println("Create a HashSet with different types of items..");
		System.out.println(dif_type);
	}
}
