package com.collections.list;

import java.util.ArrayList;

public class Test_ArrayList18 {
	public static void main(String[] args)
	{
		ArrayList<String> list_col= new ArrayList<String>();
		list_col.add("Pink");
		list_col.add("Yellow");
		list_col.add("Black");
		list_col.add("White");
		list_col.add("Blue");
		list_col.add("Orange");
		System.out.println("Given Array List : " + list_col);
		System.out.println("Checking the above Array List is Empty or Not : "+list_col.isEmpty());
		list_col.removeAll(list_col);
		System.out.println("After Remove all Elements in Array List : "+list_col);   
		System.out.println("Checking the above Array List is Empty or Not  : "+list_col.isEmpty());
	}
}
