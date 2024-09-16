package com.collections.map;

import java.util.HashMap;

//Write a Java program to copy all of the mappings from the specified map to another map
public class CopyAll3 {
	public static void main(String args[])
	{
		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		hash_map1.put(1, "Cpp");
		hash_map1.put(2, "Python");
		hash_map1.put(3, "Java");
		System.out.println("HashMap 1 : " + hash_map1);
		hash_map2.put(4, "MySql");
		hash_map2.put(5, "C");
		hash_map2.put(6, "Php");
		hash_map2.put(7, "Ruby");
		System.out.println("HashMap 2 : " + hash_map2);
 
		hash_map2.putAll(hash_map1);
		System.out.println("\nNow values in HashMap 2 : " + hash_map2);
	}
}
