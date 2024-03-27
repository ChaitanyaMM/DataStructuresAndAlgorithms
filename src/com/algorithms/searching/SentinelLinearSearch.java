package com.algorithms.searching;

public class SentinelLinearSearch {

	public static int sentinelLinearSearch(int arr[], int key) {
		int n = arr.length;
		int lastElement = arr[arr.length - 1];

		arr[n - 1] = key;
		int i = 0;
		while (arr[i] != key)
			i++;
		arr[n - 1] = lastElement;

		if ((i < n - 1) || (arr[n - 1] == key))
			System.out.println(key + " is present at index " + i);
		else
			System.out.println("Element Not found");
		return i;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
		int n = arr.length;
		int key = 181;
		
		sentinelLinearSearch(arr,key);

	}

}
