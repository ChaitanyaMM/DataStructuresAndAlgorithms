package com.java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.*;
import java.lang.*;

public class MyCode {
	public static void main(String[] args) {
		Map<String, List<Integer>> employeeRatings = new HashMap<>();
		employeeRatings.put("A", Arrays.asList(2, 3, 1, 2)); // average 2.00
		employeeRatings.put("B", Arrays.asList(3, 2, 3, 1)); // average 2.25
		employeeRatings.put("C", Arrays.asList(4, 1, 2, 3));// average 2.50
		employeeRatings.put("D", Arrays.asList(2, 3, 1, 3));// average 2.25
		// Prepare a report of employee with their average rating sorted
		// like report output : {"C":2.5, "B":2.25, "D": 2.25, , "A":2.00}

		Map<String, Double> avgMap = new HashMap<>();

		// Set<Entry<String, List<Integer>>> values = employeeRatings.entrySet();

		for (Map.Entry<String, List<Integer>> values : employeeRatings.entrySet()) {

			List<Integer> v = values.getValue();

			int count = 0;
			for (Integer i : v) {
				count += i;
			}

			double avg =(double)count / v.size();
			String key = values.getKey();
			avgMap.put(key, avg);

			System.out.println(count);
			System.out.println(avg);

		}

		System.out.println("avgMap" + avgMap);

		// List<Entry<String, Double>> list = new LinkedList<Entry<String,
		// Double>>(avgMap.entrySet());

		List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(avgMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {

			@Override
			public int compare(Entry<String, Double> arg0, Entry<String, Double> arg1) {
				return arg1.getValue().compareTo(arg0.getValue());
			}

		});

		Map<String, Double> temp = new LinkedHashMap<String, Double>();

		for (Map.Entry<String, Double> dd : list) {
			temp.put(dd.getKey(), dd.getValue());

		}
		
		System.out.println(temp);

	}
}
