package com.training.scan;

import java.util.Scanner;

public class Longest {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str = sc.nextLine();
		
		String[] words = str.split("\\s+");
		String longest = "";
		
		for(String word : words)
		{
			if(word.length() > longest.length())
			{
				longest = word;
			}
		}
		System.out.println("The longest word in the sentence is: "+longest);
	}

}
