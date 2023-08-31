package com.objects.basics;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student("Raj", "CSE",101);
		stu.printDetails();
		System.out.println("The grade is "+stu.getGrades(90,80,70));
		System.out.println();
		
		Student stu1 = new Student("Ram", "ECE",106);
		stu1.printDetails();
		System.out.println("The grade is "+stu1.getGrades(90,90,95));
	}

}
