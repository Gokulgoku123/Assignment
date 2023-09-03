package com.training.quest2;

public class ScientificCalc extends BasicCalc implements Scientific {


	@Override
	public void square(int x) {
		System.out.println("Square root "+Math.pow(x, 2));
	}

	@Override
	public void cube(int x) {
		System.out.println("Square root "+Math.pow(x, 3));
	}
	
}
