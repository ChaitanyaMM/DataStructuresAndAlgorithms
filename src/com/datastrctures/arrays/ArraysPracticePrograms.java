package com.datastrctures.arrays;

public class ArraysPracticePrograms {

	public static int singleMissingElementInNaturalNumbers1(int arr[]) {
		System.out.println("================================");

		System.out.println("****** missingElementInNNaturalNumbers method ******** ");

		int n = arr.length;

		int sum = ((n + 1) * (n + 2)) / 2;

		for (int i = 0; i < n; i++) {
			sum -= arr[i];
		}
		System.out.println("missing element is:" + sum);
		return sum;

	}

	public static int singleMissingElementInNaturalNumbers2(int arr[]) {
		System.out.println("================================");

		System.out.println("****** missingInSortednaturalNumbers method ******** ");

		int sum = 0;
		int n = arr[arr.length - 1]; // n is last element of the array
		int total = n * (n + 1) / 2;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		int result = total - sum;
		System.out.println("MISSING element " + result);

		return result;
	}

	public static void singleMissingElements(int arr[]) {

		System.out.println("================================");

		System.out.println("****** singleMissingElements method ******** ");
		int l = arr[0];
		int h = arr[arr.length - 1];
		int n = arr.length;
		int diff = l - 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] - i != diff) {
				System.out.println("missing element is :" + (i + diff));
				break;
			}

		}

	}

	public static void multipleMissingElements(int arr[]) {

		System.out.println("================================");

		System.out.println("****** multipleMissingElements method ******** ");

		int l = arr[0];
		int n = arr.length;
		int diff = l - 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] - i != diff) {
				while (diff < arr[i] - i) {
					System.out.println("missing element is : " + (i + diff));
					diff++;

				}

			}

		}

	}

	public static void minANDmax() {

	}

	public static void duplicatesInSortedArray() {

	}

	public static void duplicatesInUNSortedArray() {

	}

	public static void PairsInSortedArray() {

	}

	public static void PairsInUnSortedArray() {

	}

	public static void main(String[] args) {

		int[] natuarlorderedelements = { 1, 3, 2, 5, 7, 6, 8 };
		int[] sortedelements = { 1, 2, 3, 5, 6 };
		int[] notstartingnatuarlOrderNumbers = { 6, 7, 9, 10, 11, 12 };

		singleMissingElementInNaturalNumbers1(natuarlorderedelements);
		singleMissingElementInNaturalNumbers2(sortedelements);
		singleMissingElements(notstartingnatuarlOrderNumbers);

		int[] multipleMissing = { 6, 7, 9, 12 };
		multipleMissingElements(multipleMissing);

	}

}
