package com.collections.set;

import java.util.HashSet;

//Write a Java program to Create a HashSet with string items
public class Create_Hashset20 {
	public static void main(String[] args)
	{
		HashSet<String> fr = new HashSet<String>();
		fr.add("Mulberry");
		fr.add("Banana");
		fr.add("Mango");
		fr.add("Watermelon");
		fr.add("Apple");
		fr.add("Guava");
		fr.add("Pineapple ");
 
		System.out.println("Create a HashSet with string items : ");
		System.out.println(fr);
	}	
}
