package com.training.basics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n = 0;
		int fact = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial :");
		n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			fact = fact+n*(n-1);
		}
		System.out.println("The factorial of a given number is : "+fact);
	}
}
