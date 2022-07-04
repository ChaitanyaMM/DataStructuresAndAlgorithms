package com.datastructures.stack;

class StackNode {

	StackNode nextnode;
	int data;

	StackNode(int data) {
		this.data = data;
	}

	StackNode() {

	}

}

public class StackLinkedListOperations {
	static StackNode root;

	public void push(int data) {

		StackNode newstack = new StackNode(data);

		if (root == null) {
			root = newstack;

		} else {
			StackNode temp = root;
			root = newstack;
			newstack.nextnode = temp;

		}

		System.out.println(data + " pushed to stack");
		System.out.println("==============================");

	}

	public int pop() {

		int x = 0;
		if (root == null) {
			System.out.println("stack underflow");
		} else {
			x = root.data;
			root = root.nextnode;
		}
		System.out.println(" values popped  :-> " + x);
		System.out.println("==============================");
		return x;

	}

	public int peek() {

		int x = 0;
		if (root == null) {
			System.out.println("stack underflow !..");

		} else {
			x = root.data;

			System.out.println("Value peek:->" +x);
			System.out.println("==============================");

		}
		return x;
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else
			return false;
	}

	public static void print(StackLinkedListOperations s) {
		StackLinkedListOperations s2 = new StackLinkedListOperations();

		while(!s.isEmpty()) {
			
			//s2.push(s.peek()); 
			System.out.println("print values :-> "+s.peek() +" ");
			s.pop();
			
		}
	}

	public static void main(String[] args) {
		StackLinkedListOperations s = new StackLinkedListOperations();
		s.push(10);
		s.push(20);
		s.push(30);

		s.pop();

		//s.peek();

		print(s);

	}

}
