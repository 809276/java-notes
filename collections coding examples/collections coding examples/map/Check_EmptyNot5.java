package com.collections.map;

import java.util.HashMap;

//Write a Java program to check whether a map contains key-value mappings (empty) or not
public class Check_EmptyNot5 {
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
 
		boolean res = hash_map.isEmpty();
 
		System.out.println("Is Hashmap Empty : " + res);
		hash_map.clear();
 
		res = hash_map.isEmpty();// check if map is empty
 
		System.out.println("Is Hashmap Empty : " + res);
	}
}
