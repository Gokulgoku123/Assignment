package com.training.scan;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String str = sc.nextLine();
		
		int[] arr = new int[26];
		
		for(char c : str.toLowerCase().toCharArray())
		{
			if(c>='a' && c<='z')
			{
				arr[c-'a']++;
			}
		}
		char max = 'a';
		int count = 0;
		
		for(int i=0;i<26;i++)
		{
			if(arr[i] > count )
			{
				count = arr[i];
				max = (char)('a' + i);
			}
		}
		
		System.out.println("The maximum occuring letter in word is :"+max);
	}

}
