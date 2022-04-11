package com.datastructures.stack;

public class StackArrayOperations {

	static class Stack {

		int max = 1000;
		int top;
		int data[];

		Stack() {

			top = -1;
			data = new int[max];
		}

	}

	public static void push(Stack stack, int x) {

		if (stack.top >= stack.max - 1) {
			System.out.println("stack is overflow");
		} else {

			stack.data[++stack.top] = x;
			System.out.println("Pushed to stack ");

		}

		System.out.println("======================================");

	}

	public static int pop(Stack stack) {
		int x = 0;
		if (stack.top < 0) {
			System.out.println("stack is underflow");
		} else {
			x = stack.data[stack.top--];
		}
		System.out.println("======================================" + x);

		return x;

	}

	public static int peek(Stack stack) {
		int x = 0;
		if (stack.top < 0) {
			System.out.println("stack underflow");

		} else {
			x = stack.data[stack.top];
		}

		System.out.println("======================================" + x);

		return x;

	}

	public static boolean isEmpty(Stack stack) {
		System.out.println("======================================");

		return stack.top < 0;

	}

	public static void printValues(Stack stack) {

		for (int i = stack.top; i > -1; i--) {
			System.out.println("values :-> " + stack.data[i]);
		}
	}

	public static void main(String[] args) {

		StackArrayOperations so = new StackArrayOperations();
		Stack stack = new Stack();
		StackArrayOperations.push(stack, 10);
		StackArrayOperations.push(stack, 20);
		StackArrayOperations.push(stack, 30);

		printValues(stack);

		StackArrayOperations.pop(stack);

		printValues(stack);

		StackArrayOperations.peek(stack);

		printValues(stack);

		boolean flg = StackArrayOperations.isEmpty(stack);
		System.out.println("flag :-> " + flg);

	}

}
