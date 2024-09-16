package com.collections.map;

import java.util.HashMap;

//Write a Java program to remove all the mappings from a map
public class RemoveAll4 {
	public static void main(String args[])
	{
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Pink");
		hash_map.put(2, "Green");
		hash_map.put(3, "Red");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		hash_map.put(6, "Black");
		hash_map.put(7, "Orange");		
		System.out.println("The Original linked map : " + hash_map);
 
		hash_map.clear();// Removing all the elements
		System.out.println("The New map : " + hash_map);
	}
}
