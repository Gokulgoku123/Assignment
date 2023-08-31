package com.training.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int res[] = new int[arr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			res[i] = (int)Math.sqrt(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Square root of "+arr[i] + " is "+res[i]);
		}
	}

}
