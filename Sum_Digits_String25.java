package com.strings;
//
public class Sum_Digits_String25 {
	public int sum_digits(String str) 
	{
		int l = str.length();
		int sum = 0;
		for (int i = 0; i < l; i++) 
		{
			if (Character.isDigit(str.charAt(i))) 
			{
				String tmp = str.substring(i,i+1);
				sum += Integer.parseInt(tmp);
			}
		}
		return sum;
	}
	public static void main (String[] args)
	{
		Sum_Digits_String25 m = new Sum_Digits_String25();
		String str =  "a1b23c3d4e5hf";
		System.out.println("Given String : "+str);
		System.out.println("Sum of Digits in String : "+m.sum_digits(str));
	}
}
