package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Insert_Element2 {
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
		list_Str.add(0, "Mango");
		list_Str.add(5, "Strawberry");
		System.out.println(list_Str);
	}
}
