package com.objects.basics;

public class Student {
	String name;
	String department;
	int id;
	public Student(String name, String department,int id) {
		super();
		this.name = name;
		this.department = department;
		this.id = id;
	}
	void printDetails()
	{
		System.out.println("The details of student is :");
		System.out.println("Name : "+name);
		System.out.println("Department : "+department);
		System.out.println("Id : "+id);
	}
	String getGrades(int...marks)
	{
		int sum =0;
		int avg =0;
		int n = marks.length;
		String grade = " ";
		for (int mark : marks) {
			sum += mark;
		}
		avg = sum/n;
		if(avg > 90 && avg<=100)
			grade = "A";
		else if(avg > 80 && avg <= 90)
			grade = "B";
		else if(avg > 70 && avg <= 80)
			grade = "C";
		else if(avg > 60 && avg <= 70)
			grade = "D";
		else if(avg > 50 && avg <= 59)
			grade = "E";
		return grade;
	}
}
