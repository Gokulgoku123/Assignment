package com.training.basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int arm = 0;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		int temp = n;
		while(n>0)
		{
			int rem = n%10;
			arm = arm + (rem*rem*rem);
			n = n/10;
		}
		if(temp == arm)
		{
			System.out.println("Its a armstrong number");
		}
		else
		{
			System.out.println("Its not a armstrong number");
		}
	}

}
