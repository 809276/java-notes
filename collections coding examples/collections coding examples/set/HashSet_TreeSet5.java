package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Write a Java program to convert a hash set to a tree set
public class HashSet_TreeSet5 {
	public static void main(String[] args)
	{
		HashSet<String> hash_set = new HashSet<String>();
		hash_set.add("Black");
		hash_set.add("White");
		hash_set.add("Pink");
		hash_set.add("Red");
		hash_set.add("Green");
		hash_set.add("Yellow");
		System.out.println("Hash Set : " + hash_set);
 
		// Creat a TreeSet of HashSet elements
		Set<String> tree_set = new TreeSet<String>(hash_set);
 
		// Display TreeSet elements
		System.out.println("TreeSet : "+tree_set);
	}
}
