package com.training.basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0 ;
		int n=0;
		System.out.println("Enter the number to check prime : ");
		n = sc.nextInt();
		if(n<2)
		{
			System.out.println("Its not a prime number");
			System.exit(0);
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i ==0)
			{
				count += 1;
			}
		}
		if(count == 2)
		{
			System.out.println("Its a prime number");
		}
		else
		{
			System.out.println("Its not a prime number");
		}
	}
}
