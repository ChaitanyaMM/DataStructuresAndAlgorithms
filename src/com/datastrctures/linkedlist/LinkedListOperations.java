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
	static Node first, last, temp;

	public static void traverse(Node head) {
		System.out.println("=========================================");
		System.out.println("*********** traverse Method ************");

		while (head != null) {
			System.out.println("data:-> " + head.data);
			head = head.next;
		}

	}

	public static void displayRecursively(Node head) {

		if (head != null) {
			System.out.println("data :" + head.data);
			displayRecursively(head.next);
		}

	}

	public static void delete(int pos) {
		Node node = first;

		int index = 0;
		while (node != null) {
			index++;
			node = node.next;

			if (pos - 1 == index) {
				Node temp = node;
				temp.next = temp.next.next;
				break;
			}

		}

		System.out.println("==== deleted successfully ====" + pos);

		traverse(first);

		System.out.println("=====================================");

	}

	public static void get(int key) {

		Node node = first;
		int index = 0;
		while (node != null) {

			index++;

			node = node.next;
			if (node.data == key) {
				System.out.println("found value at index " + index);
				break;
			}

		}

		System.out.println("============================");

	}

	public static void reverse() {
		System.out.println("Reverse method");
		Node reverseNode = null;
		Node node = first;
		while (node != null) {

			System.out.println("data :-> " + node.data);

			Node temp = new Node();
			temp.data = node.data;
			temp.next = reverseNode;
			reverseNode = temp;

			node = node.next;

		}
		traverse(reverseNode);
		System.out.println("=====================");

	}

	public static void reverseFromAPoint(int pos) {
		System.out.println("reverseFromAPoint");
		Node node = first;
		Node head = new Node();
		Node reverseNode = null, first = null;
		int count = 0;
		while (node != null) {

			reverseNode = new Node();
			reverseNode.data = node.data;
			reverseNode.next = null;

//			Node temp = new Node();
//			temp.data = node.data;
//			temp.next = reverseNode;
//			reverseNode = temp;

			node = node.next;
			count++;

		}

		traverse(reverseNode);
		System.out.println("=====================");

	}

	public static void insertAtBeginning(int x) {
		Node temp1 = new Node();
		temp1.data = x;
		temp1.next = first;
		first = temp1;

		System.out.println("=======beginning insert============");
		traverse(first);

	}

	public static void insertAtEnd(int x) {
		Node temp1 = new Node();
		temp1.data = x;
		temp1.next = null;
		last.next = temp1;

		System.out.println("=======end insert============");
		traverse(first);

	}

	public static void insertAtSpecPosition(int pos, int x) {

		System.out.println("*********** insertAtSpecPosition Method ************");
		int count = 0;
		Node node = first;
		while (node != null) {
			node = node.next;
			count++;
			if (count == pos) {
				Node previous = node;
				Node next = node.next;

				Node temp = new Node();
				temp.data = x;
				previous.next = temp;
				temp.next = next;
				break;
			}

		}

		traverse(first);
		System.out.println("=========================================");
	}

	public static void create(int arr[]) {
		System.out.println("=========================================");
		System.out.println("*********** insert Method ************");

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
		insertAtBeginning(6);
		insertAtEnd(7);
		insertAtSpecPosition(2, 25);
		get(25);
		delete(2);
		reverse();
		reverseFromAPoint(3);

	}

}
