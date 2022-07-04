package com.homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringOperations {

	public static void main(String[] args) {

		String[] arr = { "hi", "hello", "hwo", "are", "you" };

		List<String> list = Arrays.asList(arr);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + "");

		}

	}

}
