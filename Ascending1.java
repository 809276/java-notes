package com.arrays;

import java.util.Arrays;

//Write a program to Sort Numeric Array In Ascending Order

public class Ascending1 {

	public static void main(String[] args) {
		int[] arr = { 23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };
		System.out.println("Original Array : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.print("Sorted Array : " + Arrays.toString(arr));
	}
}

