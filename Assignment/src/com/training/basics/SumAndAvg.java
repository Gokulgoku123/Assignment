package com.training.basics;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int n = arr.length;
		int sum = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println("The Sum of array is : "+sum);
		avg = sum/n;
		System.out.println("The Average of array is : "+avg);
	}
}
