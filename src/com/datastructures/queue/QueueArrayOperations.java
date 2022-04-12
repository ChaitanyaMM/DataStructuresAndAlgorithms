package com.datastructures.queue;

public class QueueArrayOperations {

	public void enque(Queue queue, int x) {
		if (isFull(queue)) {
			System.out.println("Queue is Full !....");
		} else {

			queue.rear++;
			queue.data[queue.rear] = x;
			//queue.size = queue.size + 1;

		}
		System.out.println("enque :->" + x);
		System.out.println("======================");
	}

	public void deque(Queue queue) {
		int y = -1;
		if (isEmpty(queue)) {
			System.out.println("Queue is empty");
		} else {
			queue.front++;
			y = queue.data[queue.front];
		}

		System.out.println("dequeue value :->" + y);
		System.out.println("======================");

	}

	public boolean isEmpty(Queue queue) {
		return (queue.front ==queue.rear);

	}

	public int front(Queue queue) {
		if (isEmpty(queue)) {
			System.out.println("Queue is empty");
		}
        int x =queue.data[queue.front];
		System.out.println("front Value :-> " +x);

		System.out.println("======================");

		return x;
		

	}

	public int rear(Queue queue) {
		if (isEmpty(queue)) {
			System.out.println("Queue is empty");
		}
        int x =queue.data[queue.rear];
		System.out.println("rear Value :-> " +x);

		System.out.println("======================");
		return x;
	}

	public boolean isFull(Queue queue) {
		return (queue.rear == queue.size-1);

	}
	
	public void display(Queue q) {
		
		for(int i =q.front+1;i<q.rear+1;i++) {
			
			System.out.println("values :-> " +q.data[i]);
		}
		
	}

	public static void main(String[] args) {
		QueueArrayOperations qo = new QueueArrayOperations();
		Queue queue = new Queue(15);

		qo.enque(queue, 1);
		qo.enque(queue, 2);
		qo.enque(queue, 3);
		qo.enque(queue, 4);
		qo.enque(queue, 5);
		qo.enque(queue, 6);
		
		qo.display(queue);
		
		qo.deque(queue);
		
		qo.display(queue);
		
		qo.front(queue);
		qo.rear(queue);



	}

}
