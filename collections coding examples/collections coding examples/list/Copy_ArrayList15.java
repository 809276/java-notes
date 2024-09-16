package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy_ArrayList15 {
	public static void main(String[] args)
	{
		List<String> arr_List1 = new ArrayList<String>();
		arr_List1.add("10");
		arr_List1.add("20");
		arr_List1.add("30");
		arr_List1.add("40");
		arr_List1.add("50");
		List<String> arr_List2 = new ArrayList<String>();
		arr_List2.add("A");
		arr_List2.add("B");
		arr_List2.add("C");
		arr_List2.add("D");
		arr_List2.add("E");
		System.out.println("List1 : " + arr_List1);
		System.out.println("List2 : " + arr_List2);
		Collections.copy(arr_List2, arr_List1);
		System.out.println("Copy List1 to List2");
		System.out.println("List1 : " + arr_List1);
		System.out.println("List2 : " + arr_List2);
	}
}
