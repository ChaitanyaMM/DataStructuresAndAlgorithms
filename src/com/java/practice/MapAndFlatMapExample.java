package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 45, 67, 19, 87, 2, 9);

		List<List<Integer>> allproducts = new ArrayList<List<Integer>>();
		allproducts.add(list);

		// creating a new stream of the elements an prints the same using the foreach
		// loop
		list.stream().map(number -> number * 2).forEach(System.out::println);

		List<Integer> flatMapList = allproducts.stream().flatMap(fm -> fm.stream()).collect(Collectors.toList());
		System.out.println(flatMapList);
	}

}
