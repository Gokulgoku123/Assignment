package com.objects.basics;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book("Java", "James Gosling", 650, "Technical");
		book1.getDetails();
		book1.checkBooktype();
		System.out.println();
		Book book2 = new Book("C", "Balaguruswamy", 300, "Magazine");
		book2.getDetails();
		book2.checkBooktype();
	}
}
