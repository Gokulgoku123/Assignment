package com.training.scan;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		System.out.println("Enter the value for x :");
		x = sc.nextInt();
		System.out.println("Enter the value for y :");
		y = sc.nextInt();
		System.out.println("Enter the value for z :");
		z = sc.nextInt();
		String a = (x > y) && (x > z) ? "x is greater" : (y > z) ? "y is greater" : "z is greater";
		System.out.println(a);
	}

}
