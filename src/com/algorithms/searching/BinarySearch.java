package com.algorithms.searching;

public class BinarySearch {

	int binarySearchRecursive(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearchRecursive(arr, l, mid - 1, x);

			return binarySearchRecursive(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}
	
	
	int binarySearchiterative(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
    }

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearchRecursive(arr, 0, n - 1, x);
		int resultIterative = ob.binarySearchiterative(arr, x);
		System.out.println("resultIterative : {} "+resultIterative);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
