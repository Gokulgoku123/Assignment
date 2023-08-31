package com.objects.basics;

public class Book {
	String title;
	String author;
	int price;
	String category;
	public Book(String title, String author, int price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails()
	{
		System.out.println("The details of book are:");
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
		System.out.println("Category : "+category);
	}
	void checkBooktype()
	{
		if(price >= 500)
		{
			System.out.println("Its a premium book");
		}
		else
		{
			System.out.println("Its a standard book");
		}
	}
	
}
