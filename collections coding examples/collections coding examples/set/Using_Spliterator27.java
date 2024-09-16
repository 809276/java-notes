package com.collections.set;

import java.util.HashSet;
import java.util.Spliterator;

//Write a Java program to Print HashSet elements using spliterator() method
public class Using_Spliterator27 {
	public static void main(String[] args)
	{
		HashSet <Integer> nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		nums.add(70);
		nums.add(80);
		nums.add(90);
		nums.add(100);
 
		Spliterator <Integer> splt = nums.spliterator();
		System.out.print("HashSet Elements : ");
		splt.forEachRemaining((n) -> System.out.print(n+" "));
	}
}
