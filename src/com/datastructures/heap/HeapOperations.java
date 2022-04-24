package com.datastructures.heap;

public class HeapOperations {
	

	static void inserData(int arr[], int value) {
//		Arr[(i-1)/2]	Returns the parent node
//		Arr[(2*i)+1]	Returns the left child node
//		Arr[(2*i)+2]	Returns the right child node
		
	    int i = value;
	    int temp = arr[value];
	    while (i > 0 && temp > arr[i % 2 == 0 ? (i/2)-1 : i/2]){
	    	arr[i] = arr[i % 2 == 0 ? (i/2)-1 : i/2];
	        i = i % 2 == 0 ? (i/2)-1 : i/2;
	    }
	    arr[i] = temp;
	    
	    
	}
	 
    static void printHeap(int arr[]) {
    	
    	for(int i=0; i< arr.length ;i++) {
    		System.out.println(" values :-> " +arr[i]);
    	}
    	
    }
	

    static void createHeap(int ara[], int n) {
		for(int i=0;i<n;i++) {
			inserData(ara,i);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 30,20,15,5,10,12,6};
		System.out.println("size :-> "+arr.length);
		createHeap(arr,arr.length);
 
	    printHeap(arr);

	}

}
