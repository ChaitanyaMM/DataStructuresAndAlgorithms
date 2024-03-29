package com.datastructures.stack;

public class StackCharOperations {

	static class Stack {

		int max = 1000;
		int top;
		char data[];

		Stack() {
			top = -1;
			data = new char[max];
		}

	}

	public static char push(Stack stack, char ch) {

		stack.data[++stack.top] = ch;

		return ch;
	}

	public static char pop(Stack stack) {

		char ch = stack.data[stack.top--];
		return ch;

	}

	public static void main(String[] args) {

		Stack stack = new Stack();

		isMatched(stack);

	}

	private static boolean isMatched(Stack stack) {
		String parenthesis = "(((a+b) * (c+a))";

		for (char c : parenthesis.toCharArray()) {

			if (c == '(') {
				char ch = StackCharOperations.push(stack, c);
				System.out.println("pushed " + ch);
				System.out.println("the top is" + stack.top);
				System.out.println("============================");

			} else if (c == ')') {

				if (stack.top != -1) {
					System.out.println("the top is" + stack.top);
					char ch = StackCharOperations.pop(stack);
					System.out.println("poppped " + ch);
					System.out.println("============================");

				} else {
					System.out.println("stack is underflow");
					System.out.println("============================");
					boolean paranthesisMatching = stack.top == -1 ? false : true;
					System.out.println(".......... paranthesisMatching ....." + paranthesisMatching);
					return paranthesisMatching;

				}

			}

		}
		System.out.println("the top is" + stack.top);
		boolean paranthesisMatching = stack.top == -1 ? true : false;
		System.out.println(".......... paranthesisMatching ....." + paranthesisMatching);
		return paranthesisMatching;
	}

}
