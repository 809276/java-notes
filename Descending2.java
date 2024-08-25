package com.arrays;

import java.util.Arrays;
import java.util.Collections;

//Write a program to Sort Numeric Array In Descending Order
public class Descending2 {
	public static void main(String[] args) {
		Integer[] arr = { 23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };
		System.out.println("Original Array : " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		
	}
}
