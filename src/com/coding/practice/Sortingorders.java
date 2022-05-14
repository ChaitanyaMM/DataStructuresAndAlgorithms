package com.coding.practice;

public class Sortingorders {

	public static void traverse(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void traverse(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void traverse(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void ascending(int[] tobeSorted) {

		for (int i = 0; i < tobeSorted.length; i++) {

			for (int j = i + 1; j < tobeSorted.length; j++) {

				int temp = 0;

				if (tobeSorted[i] > tobeSorted[j]) {
					temp = tobeSorted[i];
					tobeSorted[i] = tobeSorted[j];
					tobeSorted[j] = temp;
				}

			}
		}

	}

	public static void descending(int[] tobeSorted) {

		for (int i = 0; i < tobeSorted.length; i++) {

			for (int j = i + 1; j < tobeSorted.length; j++) {

				int temp = 0;

				if (tobeSorted[i] < tobeSorted[j]) {
					temp = tobeSorted[i];
					tobeSorted[i] = tobeSorted[j];
					tobeSorted[j] = temp;
				}

			}
		}

	}

	public static void Stringsascending(String[] tobeSorted) {

		for (int i = 0; i < tobeSorted.length; i++) {

			for (int j = i + 1; j < tobeSorted.length; j++) {

				String temp = "";

				if (tobeSorted[i].compareTo(tobeSorted[j]) > 0) {
					temp = tobeSorted[i];
					tobeSorted[i] = tobeSorted[j];
					tobeSorted[j] = temp;
				}

			}
		}

	}
	
	 static void reverse(char[] a)
	    {
	        int i, n = a.length;
	        
	        int iter = n/2;
	        char t;
	        for (i = 0; i < n / 2; i++)
	        {
	            t = a[i];
	            a[i] = a[n - i - 1];
	            a[n - i - 1] = t;
	        }
	    }

	public static void ascending(char[] tobeSorted) {

		for (int i = 0; i < tobeSorted.length; i++) {

			for (int j = i + 1; j < tobeSorted.length; j++) {

				char temp = 0;

				if (tobeSorted[i] > tobeSorted[j]) {
					temp = tobeSorted[i];
					tobeSorted[i] = tobeSorted[j];
					tobeSorted[j] = temp;
				}

			}
		}

	}

	public static void descending(char[] tobeSorted) {

		for (int i = 0; i < tobeSorted.length; i++) {

			for (int j = i + 1; j < tobeSorted.length; j++) {

				char temp = 0;

				if (tobeSorted[i] < tobeSorted[j]) {
					temp = tobeSorted[i];
					tobeSorted[i] = tobeSorted[j];
					tobeSorted[j] = temp;
				}

			}
		}

	}

	public static void Stringdescending(String[] tobeSorted) {

		for (int i = 0; i < tobeSorted.length; i++) {

			for (int j = i + 1; j < tobeSorted.length; j++) {

				String temp = "";

				if (tobeSorted[i].compareTo(tobeSorted[j]) < 0) {
					temp = tobeSorted[i];
					tobeSorted[i] = tobeSorted[j];
					tobeSorted[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {

		int[] tobeSorted = { 23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205 };

		String[] stringTobeSorted = { "chy", "priya", "deepu", "mia", "xyz" };

		char[] charTobeSorted = "cya".toCharArray();
		
		char[] charo = {'c','y','a'};

		System.out.println("\n" + "unsorted array");
		traverse(tobeSorted);

		System.out.println("\n" + "ascending sorted array");
		ascending(tobeSorted);
		traverse(tobeSorted);

		System.out.println("\n" + "descending sorted array");
		descending(tobeSorted);
		traverse(tobeSorted);

		System.out.println("\n" + "Strings ascending sorted array");
		Stringsascending(stringTobeSorted);
		traverse(stringTobeSorted);

		System.out.println("\n" + "Strings descending sorted array");
		Stringdescending(stringTobeSorted);
		traverse(stringTobeSorted);

		System.out.println("\n" + "char ascending sorted array");
		ascending(charo);
		traverse(charo);

		System.out.println("\n" + "char descending sorted array");
		descending(charo);
		traverse(charo);
		
		System.out.println("\n" + "char reverseorder");
        reverse(charo);
		traverse(charo);


	}

}
