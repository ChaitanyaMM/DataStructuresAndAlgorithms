package com.java.practice;

public class Test {

	static int arr[] = { 3, -4, -2, -3, -1, 7, -5 };

	
	public static void main(String[] args) {

		int sum = 0;
		int min = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			sum = arr[i] + arr[i + 1];
			if (sum < min) {
				min = sum;

			}
			sum=0;

		}

		System.out.println(min);

		int n = feb(10);

		System.out.println(n);

		int n1 = facto(10);
		System.out.println(n1);

	}

	static public int feb(int n) {

		if (n <= 1) {
			return n;
		}

		return feb(n - 1) + feb(n - 2);

	}

	static public int facto(int n) {
		if (n <= 1) {
			return n;
		}

		return feb(n - 1) * feb(n - 2);
	}

}
