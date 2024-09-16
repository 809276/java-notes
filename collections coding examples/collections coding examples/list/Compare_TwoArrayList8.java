package com.collections.list;

import java.util.ArrayList;

public class Compare_TwoArrayList8 {
	public static void main(String[] args)
	{
		ArrayList<String> list_str1= new ArrayList<String>();
		list_str1.add("Computer");
		list_str1.add("Keyboard");    
		list_str1.add("Mouse");
		list_str1.add("CPU");
		list_str1.add("Printer");
		list_str1.add("Derive");
		ArrayList<String> list_str2 = new ArrayList<String>();
		list_str2.add("Printer");
		list_str2.add("Mouse");
		list_str2.add("Keyboard");		
		System.out.println("String 1 :" + list_str1);
		System.out.println("String 2 :" + list_str2);
		ArrayList<String> list_str3 = new ArrayList<String>();
		for (String e : list_str1)
		list_str3.add(list_str2.contains(e) ? "True" : "Flase");
		System.out.println("Compare String 1 & 2 :"+list_str3);
	}
}
