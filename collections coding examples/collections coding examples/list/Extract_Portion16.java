package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Extract_Portion16 {
	public static void main(String[] args)
	{
		List<String> list_col = new ArrayList<String>();
		list_col.add("Red");
		list_col.add("Green");
		list_col.add("Orange");
		list_col.add("White");
		list_col.add("Black");
		System.out.println("Given list: " + list_col);
		List<String> sub_list = list_col.subList(0, 3);
		System.out.println("List of First Three Elements: " + sub_list);
	}
}
