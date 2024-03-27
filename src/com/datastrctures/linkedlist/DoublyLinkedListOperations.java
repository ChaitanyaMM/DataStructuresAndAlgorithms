package com.datastrctures.linkedlist;

class DLLNode {

	int data;
	DLLNode next;
	DLLNode previous;

	DLLNode() {

	}

	DLLNode(int data, DLLNode next, DLLNode previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;

	}

}

public class DoublyLinkedListOperations {

	static DLLNode first, last, temp;

	public static void traverse(DLLNode node) {

		System.out.println("=========================================");
		System.out.println("*********** DLL traverse Method ************");

		while (node != null) {
			System.out.println("data:-> " + node.data);
			node = node.next;
		}
	}
	
	
	
	public static void insertSpecificPosition(int data,int pos) {
		
		temp = new DLLNode();
		temp.data=data;
		
		int count =0;
		DLLNode node =first;
		
		while(node!=null) {
			count ++;
			if(count ==pos) {
				
				
				
				node.next=temp;
				node.next.previous=temp;
				
			}
		}
		
		
	}

	public static void create(int arr[]) {

		System.out.println("=========================================");
		System.out.println("*********** DLL create Method ************");

		first = new DLLNode();
		first.data = arr[0];
		first.next = null;
		first.previous = null;
		last = first;

		for (int i = 1; i < arr.length; i++) {
			temp = new DLLNode();
			temp.data = arr[i];
			temp.next = null;
			last.next = temp;
			temp.previous = first;
			last = temp;

		}

		traverse(first);

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		create(arr);

	}

}
