package com.homework;

public class MergeSortPractice {

	public static void merge(int[] arr, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];

		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];

		}

		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && j < n2) {

			if (L[i] <= R[j]) {
				arr[k] = L[i];
				k++;
				i++;

			} else {
				arr[k] = R[j];
				k++;
				j++;
			}

		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;

		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;

		}

	}

	public static void sort(int[] arr, int l, int h) {

		if (l < h) {
			int m = l + (h - l) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, h);

			merge(arr, l, m, h);

		}

	}

	public static void display(int[] arr) {

		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr[a] + "");

		}
		System.out.println();

	}

	public static void main(String[] args) {

		int[] arr = { 21, 3, 43, 56, 7, 2 };
		sort(arr, 0, arr.length - 1);

		display(arr);

	}

}
