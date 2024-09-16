package com.collections.set;

import java.util.HashSet;

//Write a Java program to Removes first Occurrence of the element specified in the argument list from the hashset
public class RemoveFirst_Occurrence13 {
	public static void main(String args[])
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("C");
		h_set.add("JAVA");
		h_set.add("CPP");
		h_set.add("PYTHON");
		h_set.add("MYSQL");
		h_set.add("RUBY");
		System.out.println("Given HashSet : " + h_set);
 
		//remove "MYSQL","CPP"
		h_set.remove("MYSQL");
		h_set.remove("CPP");
 
		System.out.println("After Removing in HashSet : " +h_set);
	}
}
