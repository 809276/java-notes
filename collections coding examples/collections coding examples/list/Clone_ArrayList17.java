package com.collections.list;

import java.util.ArrayList;

public class Clone_ArrayList17 {
	public static void main(String[] args)
	{
		ArrayList<String> list_col = new ArrayList<String>();
		list_col.add("Pink");
		list_col.add("Yellow");
		list_col.add("Black");
		list_col.add("White");
		list_col.add("Blue");
		list_col.add("Orange");
		System.out.println("Given Array List : " + list_col);
		ArrayList<String> clone_new = (ArrayList<String>)list_col.clone();
		System.out.println("Cloned Array List : " + clone_new);       
	}
}
