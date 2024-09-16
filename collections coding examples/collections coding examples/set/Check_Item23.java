package com.collections.set;

import java.util.HashSet;

//Write a Java program to Check whether a HashSet contains a specified item or not
public class Check_Item23 {
	public static void main(String[] args)
	{
		HashSet<String> fr = new HashSet<String>();
		fr.add("Mulberry");
		fr.add("Banana");
		fr.add("Mango");
		fr.add("Watermelon");
		fr.add("Guava");
		fr.add("Pineapple ");
 
		if (fr.contains("Watermelon"))
		{			
			System.out.println("Watermelon Found in the HashSet.");
		}
		else
		{			
			System.out.println("Watermelon Not Found in the HashSet.");
		}
		if (fr.contains("Apple"))
		{
			System.out.println("Apple Found in the HashSet.");	
		}
		else
		{
			System.out.println("Apple Not Found in the HashSet.");
		}
	}
}
