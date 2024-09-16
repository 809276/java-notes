package com.collections.map;

import java.util.HashMap;

//Write a Java program to get the value of a specified key in a map
public class GetValue10 {
	public static void main(String args[])
	{  
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();  
		hash_map.put(1, "Blue");
		hash_map.put(2, "Green");
		hash_map.put(3, "Pink");
		hash_map.put(4, "White");
		hash_map.put(5, "Red");
		hash_map.put(6, "Black");
		hash_map.put(7, "Orange");
		String val=(String)hash_map.get(4);
		System.out.println("Value for key 4 is: " + val);
	}
}
