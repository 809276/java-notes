package com.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Write a Java program to convert a hash set to a List/ArrayList
public class HashSet_ArrayList4 {
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Red");
		set.add("Green");
		set.add("Yellow");
		System.out.println("HashSet : " + set);
 
		//Convert HashSet to ArrayList
		List<String> res = new ArrayList<String>(set);
 
		System.out.println("ArrayList : "+ res);
	}
}
