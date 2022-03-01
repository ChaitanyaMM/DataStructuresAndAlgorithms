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
		int n=array.length;
		System.out.println("array size is "+array.length);

		for (int j = 0; j < arr.length; j++) {
			array[j] = arr[j];
			for(int i=n-1;i>pos-1;i--) {
				array[i]=array[i-1];
			}
		}
		array[pos-1]=x;

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
	   int pos =getPosition(arr,arr.length,x);
	   int n=arr.length;

	   int[] array = new int[n-1];
	 
	   for(int i=0,j=0;i<n;i++) {
		   if(i==pos) {
			   continue;
		   }else {
			   array[j++]=arr[i];
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

	

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int[] notSorted = {13,16,65,9,1,17};

		traverse(array);
		append(array, 6);
		search(array, 2);
		max(array);
		min(array);
		insert(array, 7, 4);
	    delete(array, 3);
		ascending(notSorted);
		descending(notSorted);
 
	}

}
