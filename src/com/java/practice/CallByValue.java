package com.java.practice;

public class CallByValue {

	int data = 50;

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
		System.out.println(data+"");
	}
	void change2(CallByValue cb) {
		cb.data = data + 100;// changes will be in the local variable only
		System.out.println(data+"");
	}

	public static void main(String args[]) {
		CallByValue op = new CallByValue();

		System.out.println("before change " + op.data);
		op.change(500);
		op.change2(op);
		System.out.println("after change " + op.data);

	}
}
