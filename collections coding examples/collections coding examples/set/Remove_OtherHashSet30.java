package com.collections.set;

import java.util.HashSet;

//Write a Java program to Remove HashSet elements contained in other HashSet
public class Remove_OtherHashSet30 {
	public static void main(String[] args)
	{
		HashSet <Integer> n1 = new HashSet<Integer>();
		n1.add(10);
		n1.add(20);
		n1.add(30);
		n1.add(40);
		n1.add(50);
		n1.add(60);
 
		HashSet < Integer > n2 = new HashSet<Integer>();
		n2.add(10);
		n2.add(20);
		n2.add(30);
		n2.add(40);
 
		HashSet < Integer > n3 = new HashSet<Integer>();
		n3.add(100);
		n3.add(200);
		n3.add(300);
		n3.add(400);
 
		if (n1.removeAll(n2))
		{			
			System.out.println("Removed Items of HashSet2 contained in HashSet1.");
		}
		else
		{
			System.out.println("Unable to Remove Items from HashSet1.");
		}
 
		if (n1.removeAll(n3))
		{
			System.out.println("Removed Items of HashSet3 contained in HashSet1.");
		}
		else
		{
			System.out.println("Unable to Remove Items from HashSet1.");
		}
 
		System.out.println("HashSet 1 : " + n1);
		System.out.println("HashSet 2 : " + n2);
		System.out.println("HashSet 3 : " + n3);
	}
}
