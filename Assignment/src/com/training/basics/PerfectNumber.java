package com.training.basics;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int sum =0;
		System.out.println("Enter the value : ");
		n = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				sum += i;
			}
		}
		if(sum == n)
		{
			System.out.println("Its is a perfect number");
		}
		else
		{
			System.out.println("Its not a perfect number");
		}
	}

}
