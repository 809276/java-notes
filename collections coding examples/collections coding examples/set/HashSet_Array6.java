package com.collections.set;

import java.util.HashSet;

//Write a Java program to convert a hash set to an array
public class HashSet_Array6 {
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
 
		String[] arr = new String[hash_set.size()];
		hash_set.toArray(arr);
 
		System.out.println("Array Elements : ");
		for(String ele : arr)
		{
			System.out.println(ele);
		}
	}
}
