package com.collections.list;

import java.util.ArrayList;

public class JoinTwo_Array10 {
	public static void main(String[] args)
	{
		ArrayList<String> list_str1= new ArrayList<String>();
		list_str1.add("Laptop");
		list_str1.add("Keyboard");    
		list_str1.add("Mouse");
		list_str1.add("CPU");
		System.out.println("First Array list : " + list_str1);
		ArrayList<String> list_str2= new ArrayList<String>();
		list_str2.add("Printer");
		list_str2.add("Derive");
		list_str2.add("Monitor");
		System.out.println("Second Array List : " + list_str2);		
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(list_str1);
		a.addAll(list_str2);
		System.out.println("Join Two Array List : " + a);
	}
}
