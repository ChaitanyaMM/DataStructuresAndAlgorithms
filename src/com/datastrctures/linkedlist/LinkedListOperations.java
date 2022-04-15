package com.datastrctures.linkedlist;

class Node {

	int data;
	Node next;

	Node() {

	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class LinkedListOperations {

	public static void traverse(Node head) {
		System.out.println("=========================================");
		System.out.println("*********** traverse Method ************");

		while (head != null) {
			System.out.println("data:-> " + head.data);
			head = head.next;
		}

	}

	public static void delete(int arr[], int x) {

	}

	public static void rotate(int arr[]) {

	}

	public static void reverse(int arr[]) {

	}

	public static void reverseFromAPoint(int arr[], int x) {

	}

	public static void insertAtSpecPosition(int arr[],int pos, int x) {
		
		System.out.println("=========================================");
		System.out.println("*********** insert Method ************");
		//create();
		

	}
	
	public static void create(int arr[]) {
		System.out.println("=========================================");
		System.out.println("*********** insert Method ************");

		Node first, last, temp;

		first = new Node();
		first.data = arr[0];
		first.next = null;
		last = first;

		for (int i = 1; i < arr.length; i++) {
			temp = new Node();
			temp.data = arr[i];
			temp.next = null;
			last.next = temp;
			last = temp;

		}

		traverse(first);

	}

	

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		create(array);
		insertAtSpecPosition(array,3,6);

	}

}
