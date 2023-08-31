package com.training.scan;

import java.util.Scanner;

public class GreaterNum {

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
		if ((x > y) && (x > z)) {
			System.out.println("x is greater");
		} else if ((y > z)) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}
	}

}
