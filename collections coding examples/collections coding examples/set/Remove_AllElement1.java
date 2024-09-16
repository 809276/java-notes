package com.collections.set;

import java.util.HashSet;

//Write a Java program to remove all of the elements from a hash set

public class Remove_AllElement1 {
	public static void main(String[] args)
	{
		HashSet<String> col_set = new HashSet<String>();
		col_set.add("Red");
		col_set.add("Blue");
		col_set.add("Green");
		col_set.add("Pink");
		col_set.add("Black");
		col_set.add("Orange");
		col_set.add("White");
		System.out.println("Given HashSet : "+ col_set);		 
		col_set.clear();//remove all elments from the set
		System.out.println("Removes all the Elements in HashSet : "+col_set);
	}
}
