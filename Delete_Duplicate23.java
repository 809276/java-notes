package com.arrays;
//Write a program to Delete Duplicate Elements from an Array
public class Delete_Duplicate23 {
	public static void main(String[] args)
	{
		int a[] = { 10, 10, 20, 20, 30 };
		int n = a.length;
		System.out.println("After Remove Duplicate Array Element..");
		n = removeduplicates(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
    }
	public static int removeduplicates(int a[], int n)
	{
		if (n == 0 || n == 1)
		{
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
 
		for (int i = 0; i < n - 1; i++)
		{
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
 
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++)
		{
			a[i] = temp[i];
		}
 
		return j;
	}
}
