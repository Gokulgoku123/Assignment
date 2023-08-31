package com.assignment.oops;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of 1st employee");
		String name1 = sc.nextLine();
		System.out.println("Enter the designation of 1st employee");
		String designation1 = sc.nextLine();
		
		System.out.println("Enter the name of 2nd employee");
		String name2 = sc.nextLine();
		System.out.println("Enter the designation of 2nd employee");
		String designation2 = sc.nextLine();
		
		System.out.println("Enter the name of 3rd employee");
		String name3 = sc.nextLine();
		System.out.println("Enter the designation of 3rd employee");
		String designation3 = sc.nextLine();
		
		Employee employee1 = new Employee(name1,designation1);
		if(designation1.equals("Programmer"))
			System.out.println("The bonus of programmer is "+employee1.calcBonus(25000));
		System.out.println();
		Employee employee2 = new Employee(name2,designation2);
		if(designation2.equals("Manager"))
		System.out.println("The bonus of manager is "+employee2.calcBonus(25000, 5000));
		System.out.println();
		
		Employee employee3 = new Employee(name3,designation3);
		if(designation3.equals("Director"))
			System.out.println("The bonus of director is "+employee3.calcBonus(25000, 5000, 15000));
	}

}
