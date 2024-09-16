package com.collections.map;

import java.util.HashMap;

//Write a Java program to get a shallow copy of a HashMap instance
public class Shallow_Copy6 {
	public static void main(String args[])
	{  
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();  
		hash_map.put(1, "Pink");
		hash_map.put(2, "Green");
		hash_map.put(3, "Red");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		hash_map.put(6, "Black");
		hash_map.put(7, "Orange");		
		System.out.println("HashMap : " + hash_map);
 
		HashMap<Integer,String> new_hashmap = new HashMap<Integer,String>();	
		new_hashmap = (HashMap)hash_map.clone(); 
	
		System.out.println("Cloned HashMap : " + new_hashmap);        
	}
}
