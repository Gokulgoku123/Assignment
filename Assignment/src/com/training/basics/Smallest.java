package com.training.basics;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int temp =0;
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The smallest element in array "+arr[0]);
	}
}