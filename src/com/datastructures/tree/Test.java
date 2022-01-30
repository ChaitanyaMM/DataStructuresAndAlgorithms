package com.datastructures.tree;

public class Test {

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		
		Test test = new Test();
		System.out.println("value :-> " +test.max(-1, -2));
	}

}
