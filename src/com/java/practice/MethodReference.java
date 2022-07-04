package com.java.practice;

import java.util.Arrays;
import java.util.List;

interface Sample {
	void test();

}

public class MethodReference {
	public static void testSomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void testSomething1() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {//uses function as a  parameter to invoke a method

		Sample sample = MethodReference::testSomething1;
		sample.test();

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Method reference
		list.forEach(MethodReference::print);
		// Lambda expression
		list.forEach(number -> MethodReference.print(number));
		// normal
		for (int number : list) {
			MethodReference.print(number);
		}
	}

	public static void print(final int number) {
		System.out.println("I am printing: " + number);
	}

}
