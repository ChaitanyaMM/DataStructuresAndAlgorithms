package com.algorithms.sorting;

public class SelectionSort {

	void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			printArray(arr);	
			
		}
	}
	
	 static void stableSelectionSort(int[] a, int n)
	    {
	        // Iterate through array elements
	        for (int i = 0; i < n - 1; i++)
	        {
	 
	            // Loop invariant : Elements till
	            // a[i - 1] are already sorted.
	 
	            // Find minimum element from
	            // arr[i] to arr[n - 1].
	            int min = i;
	            for (int j = i + 1; j < n; j++)
	                if (a[min] > a[j])
	                    min = j;
	 
	            // Move minimum element at current i.
	            int key = a[min];
	            while (min > i)
	            {
	                a[min] = a[min - 1];
	                min--;
	            }
	             
	            a[i] = key;
	        }
	    }


	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		
		stableSelectionSort(arr,arr.length);
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
