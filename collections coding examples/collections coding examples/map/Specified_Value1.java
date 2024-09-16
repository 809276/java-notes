package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Write a Java program to associate the specified value with the specified key in a HashMap

public class Specified_Value1 {
	public static void main(String args[])
	{  
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();  
		hash_map.put(1, "Pink");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		for(Map.Entry x:hash_map.entrySet())
		{  
			System.out.println(x.getKey()+" "+x.getValue());  
		}  
		
		System.out.println("****by using iterator****");
		
		Set<Entry<Integer,String>> result=hash_map.entrySet();
		Iterator<Entry<Integer,String>> itr=result.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> finalResult=itr.next();
			System.out.println(finalResult.getKey()+" "+finalResult.getValue());
		}
	}  
}
