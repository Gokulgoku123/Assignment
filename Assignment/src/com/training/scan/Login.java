package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] usernames = {"Ram", "Raj", "Tom"}; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name to login: ");
        String inputName = sc.nextLine();

        boolean isUnique = false;
        for (String username : usernames) {
            if (username.equals(inputName)) {
                isUnique = true;
                break;
            }
        }

        if (isUnique) {
            System.out.println("You are logged in succesfully.");
        } else {
            System.out.println("Invalid Username.");
		}
	}

}
