package com.collections.map;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified value
public class TestValue_Contains8 {
	public static void main(String args[])
	{
		HashMap <Integer, String> hash_map = new HashMap <Integer, String> ();
		hash_map.put(1, "Red");
		hash_map.put(2, "Yellow");
		hash_map.put(3, "Black");
		hash_map.put(4, "Pink");
		hash_map.put(5, "Orange");
		hash_map.put(6, "Blue");
 
		System.out.println("HashMap : " + hash_map);
		System.out.println("1. Is value \'Orange\' Exists ?");
		if (hash_map.containsValue("Orange"))
		{
			System.out.println("Yes! ");
		}
		else
		{
			System.out.println("no!");
		}
 
		System.out.println("\n2. Is value \'White\' Exists ?");
		if (hash_map.containsValue("White"))
		{
			System.out.println("yes! - " );
		} 
		else
		{
			System.out.println("No!");
		}
	}
}
