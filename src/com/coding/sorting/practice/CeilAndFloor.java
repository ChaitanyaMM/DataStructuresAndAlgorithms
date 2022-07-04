package com.coding.sorting.practice;

public class CeilAndFloor {

	static int linearceilSearch(int arr[], int low, int high, int x) {
		int i;

		if (x <= arr[low])
			return low;

		/* Otherwise, linearly search for ceil value */
		for (i = low; i < high; i++) {
			if (arr[i] == x)
				return i;

			/*
			 * if x lies between arr[i] and arr[i+1] including arr[i+1], then return
			 * arr[i+1]
			 */
			if (arr[i] < x && arr[i + 1] >= x)
				return i + 1;
		}
		return -1;
	}

	static int binaryceilSearch(int arr[], int low, int high, int x) {
		if (high == 0) {
			return -1;
		}

		while (low <= high) {
			int mid = low + (high - low) / 2;// calculate mid

			if (x == arr[mid]) {
				return mid;
			}
			if (x < arr[mid]) {
				high = mid - 1;
			}

			else {
				low = mid + 1;
			}
		}
		return low;
	}

	static int linearfloorSearch(int arr[], int n, int x) {
		if (x >= arr[n - 1])
			return n - 1;

		if (x < arr[0])
			return -1;

		for (int i = 1; i < n; i++)
			if (arr[i] > x)
				return (i - 1);

		return -1;
	}

	static int binaryfloorSearch(int arr[], int low, int high, int x) {
		// If low and high cross each other
		if (low > high)
			return -1;

		// If last element is smaller than x
		if (x >= arr[high])
			return high;

		// Find the middle point
		int mid = (low + high) / 2;

		// If middle point is floor.
		if (arr[mid] == x)
			return mid;

		// If x lies between mid-1 and mid
		if (mid > 0 && arr[mid - 1] <= x && x < arr[mid])
			return mid - 1;

		// If x is smaller than mid, floor
		// must be in left half.
		if (x < arr[mid])
			return binaryfloorSearch(arr, low, mid - 1, x);

		// If mid-1 is not floor and x is
		// greater than arr[mid],
		return binaryfloorSearch(arr, mid + 1, high, x);
	}

	public static void floorAndCeil(int arr[], int x) {
		int n = arr.length;

		// Indexes of floor and ceiling
		int fInd = -1, cInd = -1;

		// Distances of current floor and ceiling
		int fDist = Integer.MAX_VALUE, cDist = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			// If current element is closer than
			// previous ceiling.
			if (arr[i] >= x && cDist > (arr[i] - x)) {
				cInd = i;
				cDist = arr[i] - x;
			}

			// If current element is closer than
			// previous floor.
			if (arr[i] <= x && fDist > (x - arr[i])) {
				fInd = i;
				fDist = x - arr[i];
			}
		}

		if (fDist == Integer.MAX_VALUE)
			System.out.println("Floor doesn't exist ");
		else
			System.out.println("Floor is " + arr[fInd]);

		if (cDist == Integer.MAX_VALUE)
			System.out.println("Ceil doesn't exist ");
		else
			System.out.println("Ceil is  " + arr[cInd]);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 8 };
		int v = 5;

		int[] nums2 = { 4, 2, 8, 11 };

		int x = linearceilSearch(nums, 0, nums.length - 1, v);
		System.out.println(nums[x]);

		int y = linearfloorSearch(nums, nums.length - 1, v);
		System.out.println(nums[y]);

		int x1 = binaryceilSearch(nums, 0, nums.length - 1, v);
		System.out.println(nums[x1]);

		int y1 = binaryfloorSearch(nums, 0, nums.length - 1, v);
		System.out.println(nums[y1]);

		floorAndCeil(nums2, 3);

	}

}
