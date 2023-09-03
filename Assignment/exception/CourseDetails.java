package com.assignment.exception;

public class CourseDetails{
	void showCourses(String course){
		try {
			System.out.println("Welcome to Course");
			if(course.equals("java")) {
				System.out.println("Welcome to "+course+" course");
			}
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
			throw e;
		}
		finally {
			System.out.println("Connection closed");
		}
	}
}
