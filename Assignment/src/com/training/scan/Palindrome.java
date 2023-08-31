package com.training.scan;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int original = num;
		int rev = 0;
		while(num > 0)
		{
			int digit = num %10;
			rev = rev *10 + digit;
			num = num/10;
		}
		if(original == rev)
		{
			System.out.println("Its is a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}
}
