package com.algorithms.sorting;

public class ShellSort {

	static void swap(int arr[], int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	/* function to sort arr using shellSort */
	static int shellsort2(int arr[]) {
		int n = arr.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap /= 2) {
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i += 1) {
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				arr[j] = temp;
			}
		}
		return 0;
	}

	static void shellsortMethod(int arr[]) {
		int n = arr.length - 1;

		int gap = (n / 2);

		do {

			for (int i = 0; i <= gap; i++) {

				for (int j = i + gap; j <= n; j += 1) {

					if (arr[i] > arr[j]) {
						swap(arr, i, j);

						int leftgapcheck = i - gap;
						int rightgapcheck = (n - i) / 2;

						if (leftgapcheck > 0 && arr[leftgapcheck] > arr[i]) {
							swap(arr, leftgapcheck, i);

						}

						else if (((j - i) == rightgapcheck)) {
							if ((arr[(i - gap)] > arr[i] && arr[i] < arr[j]))
								swap(arr, i - gap, i);
							traversal(arr);

						}
						break;
					}

				}
				n = gap;
				gap = (gap / 2);
			}
		} while (gap == 1);

	}

	static void traversal(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" array " + arr[i]);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 9, 5, 16, 8, 13, 6, 12, 10, 4, 2, 3 };
		// traversal(arr);
		shellsortMethod(arr);
//		traversal(arr);
//		shellsort2(arr);
//		traversal(arr);
	}

}
