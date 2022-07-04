package com.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapOperations {

	public static void main(String[] args) {

		Map<String, List<Integer>> employeeRatings = new HashMap<>();
		employeeRatings.put("A", Arrays.asList(2, 3, 1, 2)); // average 2.00
		employeeRatings.put("B", Arrays.asList(3, 2, 3, 1)); // average 2.25
		employeeRatings.put("C", Arrays.asList(4, 1, 2, 3));// average 2.50
		employeeRatings.put("D", Arrays.asList(2, 3, 1, 3));// average 2.25

		Map<String, Double> map = new TreeMap<>();
		Map<String, Double> avgMap = new HashMap<>();

		Set<Entry<String, List<Integer>>> aa = employeeRatings.entrySet();
		Iterator<Map.Entry<String, List<Integer>>> itr = employeeRatings.entrySet().iterator();

		while (itr.hasNext()) {

			Map.Entry<String, List<Integer>> entry = itr.next();

			String key = entry.getKey();

			List<Integer> value = entry.getValue();
			int sum = value.stream().mapToInt(Integer::intValue).sum();
			double avg = (double) sum / value.size();

			avgMap.put(key, avg);

		}

		System.out.println(avgMap);

		List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(avgMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {

			@Override
			public int compare(Entry<String, Double> arg0, Entry<String, Double> arg1) {
				return arg1.getValue().compareTo(arg0.getValue());
			}

		});
		System.out.println(list);

		Map<String, Double> sortedMap = list.stream().collect
				(Collectors.toUnmodifiableMap(Entry<String, Double> :: getKey, Entry<String, Double> :: getValue));
		System.out.println(sortedMap);

	}

}
