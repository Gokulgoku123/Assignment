package com.assignment.exception;

public class Main {

	public static void main(String[] args) {
		CourseDetails course = new CourseDetails();
		try {
		course.showCourses("java");
		}
		catch(Exception e){
			System.out.println("Course Details not found");
			e.printStackTrace();
		}
	}

}
