package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Remove_FifthElement3 {
	public static void main(String[] args)
	{
		List<String> list_Str = new ArrayList<String>();
		list_Str.add("Black");
		list_Str.add("White");    
		list_Str.add("Orange");
		list_Str.add("Purple");
		list_Str.add("Green");
		list_Str.add("Yellow");
		list_Str.add("Red");
		list_Str.add("Blue");
		list_Str.add("Pink");
		Collections.sort(list_Str);
		System.out.println("Before Removing : "+list_Str);
		list_Str.remove(5);
		Collections.sort(list_Str);
		System.out.println("\nAfter Removing : "+list_Str);
	}
}
