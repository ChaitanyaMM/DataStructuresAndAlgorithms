package com.datastructures.queue;

class DeQueue {

	int front;
	int rear;
	int data[];

	DeQueue(int front, int rear, int data[]) {
		this.front = front;
		this.rear = rear;
		this.data = data;

	}

}

public class DeQueueOperations {

	public static boolean frontInsert(DeQueue dq) {
		if (dq.front == -1) {
			return false;
		}
		return true;
	}
	
	public static void getFrontAndRearPlaces(DeQueue dq ) {
		System.out.println("front is at :-> "+dq.front + " AND "+ "rear is at :-> "+ dq.rear);
	}

	public static boolean empty(DeQueue dq) {
		if (dq.front == -1 && dq.rear == -1) {
			return true;
		}
		return false;
	}

	public static void enqueue(DeQueue dq, int x, boolean f, boolean r) {
		System.out.println("=====================");
		System.out.println("********enqueue method************");
		if (f) {
			dq.front = dq.front+1;
			dq.data[dq.front] = x;
			dq.rear = dq.front;
		} else if (r) {
			dq.rear = dq.rear + 1;
			dq.data[dq.rear] = x;
		}
		System.out.println("=====================");
	}
	public static void dqueue(DeQueue dq, boolean f, boolean r) {
		System.out.println("=====================");
		System.out.println("********dqueue method************");
		if (f) { // assuming insert happend from front only
			if(dq.front==dq.rear) {
			dq.front = dq.front-1;
			dq.rear=dq.front;
			}
		} else if (r) {
			dq.rear = dq.rear-1;
		}
		System.out.println("=====================");
	}

	public static void traverse(DeQueue dq) {
		for (int i=0;i<=dq.rear;i++){
			System.out.println("elemtsn are : -> "+dq.data[i]);
		}

	}

	public static void main(String[] args) {
		DeQueue dq = new DeQueue(-1, -1, new int[10]);
		//front insert
//		enqueue(dq,1,true,false);
//		enqueue(dq,2,true,false);
//		enqueue(dq,3,true,false);
//
//		traverse(dq);
//
//		dqueue(dq,true,false);
//		traverse(dq);
		
		
		//backInsert
		enqueue(dq,1,false,true);
		enqueue(dq,2,false,true);
		enqueue(dq,3,false,true);

		traverse(dq);

		dqueue(dq,false,true);
		traverse(dq);
		getFrontAndRearPlaces(dq);
	}

}
