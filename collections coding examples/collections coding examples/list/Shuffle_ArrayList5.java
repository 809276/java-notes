package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_ArrayList5 {
	public static void main(String[] args)
	{
		List<String> list_col = new ArrayList<String>();
		list_col.add("Black");
		list_col.add("Blue");    
		list_col.add("Green");
		list_col.add("Orange");
		list_col.add("Pink");
		list_col.add("Purple");
		list_col.add("White");
		list_col.add("Yellow");		
		System.out.println("Before Shuffling :" + list_col);  
		Collections.shuffle(list_col);
		System.out.println("After Shuffling :" + list_col); 
	}
}
