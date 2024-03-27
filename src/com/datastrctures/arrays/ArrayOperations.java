package com.datastrctures.arrays;

public class ArrayOperations {

	class Array {

		int size;
		int length;
		int arr[];

		Array(int size, int length, int arr[]) {
			this.size = size;
			this.length = length;
			this.arr = arr;

		}

	}

	public static void traverse(int arr[]) {
		System.out.println("================================");

		System.out.println("****** traversal method ******** ");

		System.out.println("size of array :-> " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i :-> " + arr[i]);
		}
	}

	public static void insert(int arr[], int x, int pos) {
		System.out.println("================================");

		System.out.println("****** insert method ******** ");
		int[] array = new int[arr.length + 1];
		int n = array.length;
		System.out.println("array size is " + array.length);

		for (int j = 0; j < arr.length; j++) {
			array[j] = arr[j];
			for (int i = n - 1; i > pos - 1; i--) {
				array[i] = array[i - 1];
			}
		}
		array[pos - 1] = x;

		traverse(array);
	}

	public static int getPosition(int arr[], int n, int key) {

		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		return -1;
	}

	public static void delete(int arr[], int x) {
		System.out.println("================================");
		System.out.println("****** delete method ******** ");
		int pos = getPosition(arr, arr.length, x);
		int n = arr.length;

		int[] array = new int[n - 1];

		for (int i = 0, j = 0; i < n; i++) {
			if (i == pos) {
				continue;
			} else {
				array[j++] = arr[i];
			}
		}
		traverse(array);
	}

	public static int search(int arr[], int x) {
		System.out.println("================================");

		System.out.println("****** search method ******** ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println("given values is found at index :->" + i);
				return i;
			}
		}
		System.out.println("not found the given element->" + x);

		return -1;
	}

	public static int[] append(int arr[], int x) {
		System.out.println("================================");

		System.out.println("****** append method ******** ");

		int[] array = new int[arr.length + 1];
		System.out.println("size of array current :-> " + array.length + " and previous size is " + arr.length);
		if (array.length > arr.length) {
			for (int i = 0; i < array.length; i++) {
				array[arr.length] = x;
				for (int j = 0; j < arr.length; j++) {
					array[j] = arr[j];
				}
			}
		}
		System.out.println("****** append done printing elements ******** ");

		traverse(array);
		return array;

	}

	public static void max(int arr[]) {
		System.out.println("================================");

		System.out.println("****** max method ******** ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("maximum element in the given array is " + max);
	}

	public static void min(int arr[]) {
		System.out.println("================================");

		System.out.println("****** min method ******** ");
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("minimum element in the given array is " + min);
	}

	public static void ascending(int arr[]) {

		System.out.println("================================");

		System.out.println("****** ascending method ******** ");

		int i, j, temp = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		traverse(arr);
	}

	public static void descending(int arr[]) {
		System.out.println("================================");

		System.out.println("****** descending method ******** ");

		int i, j, temp = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		traverse(arr);
	}

	public static void insertXinSortedArray(int[] arrGiven, int x) {
		System.out.println("================================");

		System.out.println("****** insertXinSortedArray method ******** ");

		int[] arr = new int[arrGiven.length + 1]; // just taking next size of given to insert
		for (int i = 0; i < arrGiven.length; i++) {
			arr[i] = arrGiven[i];
		}

		int i = arrGiven.length - 1;
		while (arrGiven[i] > x) {
			arr[i + 1] = arrGiven[i];
			i--;
		}
		arr[i + 1] = x;

		traverse(arr);
	}

	public static void arrangeNegativeNumbersAndPostiveNumbers(int[] arr) {

		System.out.println("================================");

		System.out.println("****** arrangeNegativeNumbersAndPostiveNumbers method ******** ");

		int i = 0, j = arr.length - 1, temp = 0;

		while (i < j) {
			while (arr[i] < 0) {
				i++;
			}
			while (arr[j] >= 0) {
				j--;
			}
			if (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		traverse(arr);
	}

	public static void mergeArrays() {

		System.out.println("================================");

		System.out.println("****** mergeArrays method ******** ");
		int A[] = { 2, 6, 8, 1 };
		int B[] = { 3, 4, 5, 7 };
		int m = A.length;
		int n = B.length;
		int i = 0, j = 0, k = 0;

		int C[] = new int[(m + n)];

		while (i < m && j < n) {

			if (A[i] < B[j]) {
				C[k++] = A[i++];

			} else {
				C[k++] = B[j++];
			}

		}

		// for any left over elements to be copied
		for (; i < m; i++) {
			C[k++] = A[i];
		}
		for (; j < n; j++) {
			C[k++] = B[j];
		}

		traverse(C);

	}

	/*
	 * if arrays are sorted we can use merge procedure 1.compare a &b if as is small
	 * copy to c and incremtn a 2. if b is small copy b and increment b. 3. if both
	 * are eqqual cppy both and increment both 4. at the end copy all the remaining
	 * elements to the c
	 */
	public static void mergeProcedureForUNIONOnSortedArrays() {
		System.out.println("================================");

		System.out.println("****** mergeProcedure method ******** ");

		int A[] = { 2, 5, 7, 8, 9 };
		int B[] = { 2, 6, 7, 9, 11 };
		int m = A.length;
		int n = B.length;
		int C[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (A[i] < B[j]) {
				C[k++] = A[i++];

			} else if (B[j] < A[i]) {
				C[k++] = B[j++];

			} else {
				C[k++] = A[i++];
				j++;
			}

		}
		for (; i < m; i++) {
			C[k++] = A[i];
		}
		for (; j < n; j++) {
			C[k++] = B[j];
		}

		traverse(C);

	}

	public static void mergeProcedureForINTERSECTIONOnSortedArrays() {
		System.out.println("================================");

		System.out.println("****** mergeProcedureForINTERSECTIONOnSortedArrays method ******** ");

		int A[] = { 2, 5, 7, 8, 9 };
		int B[] = { 2, 6, 7, 9, 11 };
		int m = A.length;
		int n = B.length;
		int C[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (A[i] < B[j]) {
				i++;
			} else if (B[j] < A[i]) {
				j++;
			} else {
				C[k++] = A[i++];
			}

		}

		traverse(C);

	}

	public static boolean checkElementExits(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}

		}
		return false;

	}

	public static void UNION() {

		System.out.println("================================");

		System.out.println("****** UNION method ******** ");

		int A[] = { 2, 5, 7, 8, 9 };
		int B[] = { 2, 6, 7, 9, 11 };
		int m = A.length;
		int n = B.length;
		int C[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		for (i = 0; i < m; i++) {
			C[i] = A[i];
			k++;
		}

		while (j < n) {
			boolean value = checkElementExits(C, B[j]);
			if (!value) {
				C[k] = B[j];
				k++;
			}
			j++;

		}
		traverse(C);

	}

	public static void INTERSECTION() {

		System.out.println("================================");

		System.out.println("****** INTERSECTION method ******** ");

		int A[] = { 2, 5, 7, 8, 9 };
		int B[] = { 2, 6, 7, 9, 11 };

		int m = A.length;
		int n = B.length;
		int C[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (j < n) {
			boolean value = checkElementExits(A, B[j]);
			if (value) {
				C[k] = B[j];
				k++;
			}
			j++;

		}
		traverse(C);

	}

	// nonly sorted arrays works
	public static void MergeProcedureForDIFFERENCESETOperation() {
		System.out.println("================================");

		System.out.println("****** MergeProcedureForDIFFERENCESETOperation method ******** ");

		int A[] = { 2, 5, 7, 8, 9 };
		int B[] = { 2, 6, 7, 9, 11 };

//		int A[] = { 3, 4, 5, 6, 10 };
//		int B[] = { 2, 4, 5, 7, 12 };

		int m = A.length;
		int n = B.length;
		int C[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (A[i] == B[j]) {
				i++;
				j++;
			} else if (A[i] < B[j]) {
				C[k++] = A[i++];
			} else {
				j++;
			}

		}

		traverse(C);

	}

	public static void Difference() {
		System.out.println("================================");

		System.out.println("****** Difference method ******** ");

		int A[] = { 2, 5, 7, 8, 9 };
		int B[] = { 2, 6, 7, 9, 11 };

//		int A[] = { 3, 5, 10, 4, 6 };
//		int B[] = { 12, 4, 7, 2, 5 };

		int m = A.length;
		int n = B.length;
		int C[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m) {
			boolean value = checkElementExits(B, A[i]);
			if (!value) {
				C[k] = A[i];
				k++;
			}
			i++;

		}
		traverse(C);

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int[] notSorted = { 13, 16, 65, 9, 1, 17 };
		int[] sorted = { 2, 4, 6, 10, 12 };
		int[] mixedNumbers = { -6, 3, -8, -7, 9, 3, 5, -1, 2 };

		traverse(array);
		append(array, 6);
		search(array, 2);
		max(array);
		min(array);
		insert(array, 7, 4);
		delete(array, 3);
		ascending(notSorted);
		descending(notSorted);
		insertXinSortedArray(sorted, 8);
		arrangeNegativeNumbersAndPostiveNumbers(mixedNumbers);
		mergeArrays();

		// set opearations
//		 1.union
//		 2.intersection.
//		 3.difference.
//		 4.setmembership
		UNION();
		// this process is called merging works only for sorted arrays
		mergeProcedureForUNIONOnSortedArrays();
		INTERSECTION();
		mergeProcedureForINTERSECTIONOnSortedArrays();
		Difference();
		MergeProcedureForDIFFERENCESETOperation();

	}

}
