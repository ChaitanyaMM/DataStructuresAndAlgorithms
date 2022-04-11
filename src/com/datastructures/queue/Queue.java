package com.datastructures.queue;

public class Queue {

	int[] data;
	int front, rear, size;

	public Queue(int size) {

		this.size=size;
		data = new int[size];
		this.front = this.rear = -1;
	}

}
