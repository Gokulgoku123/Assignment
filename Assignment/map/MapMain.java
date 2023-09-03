package com.assignment.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
	
		Map<String, List<String>> states = new HashMap<>();
		states.put("Karnataka", Arrays.asList("Banglore","Mysore","Chickmagaluru"));
		states.put("Mumbai", Arrays.asList("Pune","Nagpur","Anderi"));
		states.put("Andhra Pradesh", Arrays.asList("vellore","Guntur","Hyderabad"));
		for (Map.Entry<String, List<String>> entry : states.entrySet()) {
            String state = entry.getKey();
            List<String> cities = entry.getValue();

            System.out.println("State: " + state);
            System.out.println("Cities: " + cities);
        }
	}
}
