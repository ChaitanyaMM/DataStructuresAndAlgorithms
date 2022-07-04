package com.algorithms.sorting;

public class InsertionSort {

	static void insert(int a[], int n) /* function to sort an aay with insertion sort */
	{
		//int a[] = { 12, 31, 25, 8, 32, 17 };

		int i, j, temp;
		for (i = 1; i < n; i++) {
			temp = a[i];
			j = i - 1;

			while (j >= 0 && temp <= a[j])
			{
				a[j + 1] = a[j];
				j --;
			}
			a[j + 1] = temp;
		}
	}

	static void printArr(int a[], int n) /* function to print the array */
	{
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String args[]) {
		int a[] = { 12, 31, 25, 8, 32, 17 };
		int n = a.length;
		System.out.print("Before sorting array elements are ");

		printArr(a, n);
		insert(a, n);
		System.out.print("\n"+"After sorting array elements are ");

		printArr(a, n);

 
	}
}
