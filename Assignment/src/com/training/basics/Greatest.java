package com.training.basics;

import java.util.Scanner;

public class Greatest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
