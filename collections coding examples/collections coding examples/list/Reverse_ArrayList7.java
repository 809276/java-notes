package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_ArrayList7 {
	public static void main(String[] args)
	{
		List<String> list_col = new ArrayList<String>();
		list_col.add("Black");
		list_col.add("Orange");
		list_col.add("Pink");
		list_col.add("Blue");
		list_col.add("White");
		list_col.add("Yellow");	
		list_col.add("Purple");
		System.out.println("Before Reversing :" + list_col);  
		Collections.reverse(list_col);
		System.out.println("After Reversing :" + list_col); 
	}
}
