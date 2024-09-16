package com.collections.list;
//Write a Java program to create a new array list, add some elements and print out the collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_Elements1 {

	public static void main(String[] args)
	{
		List<String> list_Str = new ArrayList<String>();
		list_Str.add("Apple");
		list_Str.add("Banana");    
		list_Str.add("Cherry");
		list_Str.add("Pineapple");
		list_Str.add("Guava");
		list_Str.add("Papaya");
		list_Str.add("Plum");
		System.out.println(list_Str);
		
		Collections.sort(list_Str);
		System.out.println(list_Str);
	}
}
