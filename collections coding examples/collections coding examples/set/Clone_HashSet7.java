package com.collections.set;

import java.util.HashSet;

//Write a Java program to clone a hash set to another hash set
public class Clone_HashSet7 {

	public static void main(String[] args)
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("C");
		h_set.add("JAVA");
		h_set.add("CPP");
		h_set.add("PYTHON");
		h_set.add("MYSQL");
		h_set.add("RUBY");
		System.out.println("Given HashSet : " + h_set);
		HashSet<String> clone_set = new HashSet<String>();
		clone_set = (HashSet)h_set.clone();
		System.out.println("Clone HashSet : " + clone_set);         
	}
}
