package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Retrieve_Element12 {
	public static void main(String[] args)
	{
		List<String> list_str = new ArrayList<String>();
		list_str.add("Laptop");
		list_str.add("Keyboard");    
		list_str.add("Mouse");
		list_str.add("CPU");
		list_str.add("Printer");
		list_str.add("Derive");
		list_str.add("Monitor");
		System.out.println(list_str);
		String ele = list_str.get(0);
		System.out.println("First Element: "+ele);
		ele = list_str.get(4);
		System.out.println("Fifth Element: "+ele);
	}
}
