package com.assignment.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>(Arrays.asList(
				new Employee("Rahul", 101, "Banglore"),
				new Employee("Raju",102,"Mysore"),
				new Employee("Praveen",103,"Banglore"),
				new Employee("Tom",104,"Hubli"),
				new Employee("Rakesh",105,"Banglore")
				));
		System.out.println("Employee Details");
		for (Employee emp : employee) {
			System.out.println(emp);
		}
		
		
		ArrayList<Employee> employee1 = new ArrayList<>();
		for (Employee emp1: employee) {
			if(emp1.city.equals("Banglore")) {
				employee1.add(emp1);
			}
		}
		System.out.println();
		
		System.out.println("Employee details based on location");
		for (Employee emp2 : employee1) {
			System.out.println(emp2);
		}
		
	}

}
