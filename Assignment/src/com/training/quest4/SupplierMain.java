package com.training.quest4;

import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			String str = "rocky";
			String upper = str.toUpperCase();
			System.out.println(upper);
			return upper;
			
		};
		sup.get();
	}

}
