package com.datastructures.queue;

class cqueue {
	int front;
	int rear;
	int data[];

	public cqueue(int f, int r, int[] data) {
		this.front = f;
		this.rear = r;
		this.data = data;
	}
}

public class CircularQueueOperations {

	public static boolean ifFull(cqueue cq) {
		if ((cq.rear + 1) % cq.data.length == cq.front) {
			return true;
		}
		return false;
	}

	public static boolean ifEmpty(cqueue cq) {
		if (cq.rear == cq.front) {
			return true;
		}
		return false;
	}

	public static void enque(cqueue cq, int x) {

		System.out.println("======================");
		System.out.println("********enque method ***********");

		if (ifFull(cq)) {
			System.out.println("Queue is full cant insert");
		} else {
			cq.rear = (cq.rear + 1) % cq.data.length;
			cq.data[cq.rear] = x;
		}
		System.out.println("======================");
	}

	public static void deque(cqueue cq) {
		System.out.println("======================");
		System.out.println("********deque method ***********");
		if (ifEmpty(cq)) {
			System.out.println("Queue is empty !");
		} else {
			cq.front++;
		}
		System.out.println("======================");
	}

	public static void traverse(cqueue cq) {
		System.out.println("======================");
		for (int i = (cq.front + 1); i < (cq.rear + 1); i++) {
			System.out.println(cq.data[i]);
		}
		System.out.println("======================");
	}

	public static void main(String[] args) {
		cqueue cq = new cqueue(0, 0, new int[10]);

		enque(cq, 1);
		enque(cq, 2);
		enque(cq, 3);
		enque(cq, 4);

		traverse(cq);
		
		deque(cq);
		
		traverse(cq);
		
		enque(cq, 1);
		
		traverse(cq);

	}

}
