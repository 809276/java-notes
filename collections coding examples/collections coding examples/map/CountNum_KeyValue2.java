package com.collections.map;

import java.util.HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map
public class CountNum_KeyValue2 {
	public static void main(String args[])
	{  
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();  
		hash_map.put(1, "Cherry");
		hash_map.put(2, "Banana");
		hash_map.put(3, "Apple");
		hash_map.put(4, "Mango");
		hash_map.put(5, "Guava");
		System.out.println("Count Number of Key-Value in HashMap : "+hash_map.size());
	}
}
