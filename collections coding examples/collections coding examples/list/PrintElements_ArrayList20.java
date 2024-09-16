package com.collections.list;

import java.util.ArrayList;

public class PrintElements_ArrayList20 {
	public static void main(String[] args)
	{
		ArrayList<String> list_str= new ArrayList<String>();
		list_str.add("Printer");
		list_str.add("Derive");
		list_str.add("Monitor");
		list_str.add("Laptop");
		list_str.add("Keyboard");    
		list_str.add("Mouse");
		list_str.add("CPU");
		System.out.println("Given Array List : " + list_str);
		System.out.println("\nPrint using index of an Element .. ");
		int len = list_str.size();
		for (int i = 0; i < len; i++)
		{
			System.out.println(list_str.get(i));
		}
	}
}
