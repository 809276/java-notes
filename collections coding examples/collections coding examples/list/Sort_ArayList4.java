package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_ArayList4 {
	public static void main(String[] args)
	{
		List<String> list_Book = new ArrayList<String>();
		list_Book.add("Python");
		list_Book.add("C");    
		list_Book.add("Php");
		list_Book.add("Css");
		list_Book.add("MySQL");
		list_Book.add("C++");
		list_Book.add("Java");
		list_Book.add("HTML");
		list_Book.add("Bootstrap");
		list_Book.add("Flask");
		System.out.println("Before Sort : "+list_Book);
		Collections.sort(list_Book);
		System.out.println("After Sort : "+list_Book);    
	}
}
