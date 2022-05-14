package com.java.practice;

public class MIssingNumber {

	public static int findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}
//	    public static void main(String[] args)
//	    {
//	        int[] a = { 1, 2, 4, 5, 6 };
//	        System.out.println(findDisappearedNumbers(a));
//	    }

	static void printMissingElements(int arr[], int N) {
		
				int diff = arr[0] - 0;
		
				for (int i = 0; i < N; i++) {
		
		
					if (arr[i] - i != diff) {
		
						while (diff < arr[i] - i) {
							System.out.print((i + diff) + " ");
							diff++;
						}
					}
				}
			}
		
		//Driver Code
			public static void main(String[] args) {
		
		// Given array arr[]
				int arr[] = { 6, 7, 10, 11, 13 };
		
				int N = arr.length;
		
		// Function call
				printMissingElements(arr, N);
			}
}
