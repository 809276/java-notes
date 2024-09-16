package com.collections.map;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified key
public class Map_Contains7 {
	public static void main(String args[])
	{
		HashMap <String, Integer> hash_map = new HashMap <String, Integer> ();
		hash_map.put("Red", 1);
		hash_map.put("Pink", 2);
		hash_map.put("Black", 3);
		hash_map.put("White", 4);
		hash_map.put("Blue", 5);
 
		System.out.println("HashMap : " + hash_map);
		System.out.println("1. Is key 'Pink' Exists ?");
		if (hash_map.containsKey("Pink"))
		{			
			System.out.println("yes! - " + hash_map.get("Pink")); //key exists	
		}
		else
		{			
			System.out.println("No!");//key does not exists
		}
 
		System.out.println("\n2. Is key 'Green' Exists ?");
		if (hash_map.containsKey("orange"))
		{
			System.out.println("yes! - " + hash_map.get("Green"));
		} 
		else
		{
			System.out.println("no!");
		}
	}
}
