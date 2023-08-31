package com.assignment.oops;

public class Employee {
	String name;
	String designation;
	
	double calcBonus(double basicAllowance)
	{
		return basicAllowance;
	}
	double calcBonus(double basicAllowance,double carAllowance)
	{
		return (basicAllowance+carAllowance);
	}
	double calcBonus(double basicAllowance,double carAllowance,double houseAllowance)
	{
		return (basicAllowance+carAllowance+houseAllowance);
	}
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
}
