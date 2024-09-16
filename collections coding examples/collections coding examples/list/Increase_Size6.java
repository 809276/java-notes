package com.collections.list;

import java.util.ArrayList;

public class Increase_Size6 {
	public static void main(String[] args)
	{
		ArrayList<String> list_Book= new ArrayList<String>(3);
		list_Book.add("C++");
		list_Book.add("Java");
		list_Book.add("HTML");
		System.out.println("Original Array List : " + list_Book);
		list_Book.ensureCapacity(7);
		list_Book.add("C");    
		list_Book.add("Php");
		list_Book.add("Css");
		list_Book.add("MySQL");
		System.out.println("New Increased Array List : " + list_Book);
	}
}
