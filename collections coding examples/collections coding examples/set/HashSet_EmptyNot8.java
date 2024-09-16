package com.collections.set;

import java.util.HashSet;

//Write a Java program to test a hash set is empty or not
public class HashSet_EmptyNot8 {

	public static void main(String[] args)
	{
		HashSet<String> h_set1 = new HashSet<String>();
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("C");
		h_set.add("JAVA");
		h_set.add("CPP");
		h_set.add("PYTHON");
		h_set.add("MYSQL");
		h_set.add("RUBY");
		System.out.println("Given HashSet : " + h_set);
		System.out.println("Check HashSet 1 is Empty or Not : "+h_set1.isEmpty());
		System.out.println("Check HashSet 2 is Empty or Not : "+h_set.isEmpty());
		System.out.println("Remove all the elements from a HashSet .. ");
		h_set.removeAll(h_set);
		System.out.println("After Removing all the Elements in HashSet : "+h_set);   
	}
}
