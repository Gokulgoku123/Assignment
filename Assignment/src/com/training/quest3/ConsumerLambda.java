package com.training.quest3;

import java.util.function.Consumer;

public class ConsumerLambda {
	public static void main(String[] args) {
		Consumer<Integer> con = (x) -> {
			int y=10;
			System.out.println("Addition "+(x+y));
		};
		con.accept(20);
	}
}
