package com.datastructures.queue;

public class QueueLinkedListOperations {
	
	QueueNode front,rear;
	
	QueueLinkedListOperations(){
		this.front =this.rear =null;
	}

	public void enque(int data) {
		QueueNode temp = new QueueNode(data);
		if(this.rear == null) {
			this.front=this.rear=temp;
		}else {
			this.rear.nextNode = temp;
			this.rear=temp;
		}
		
		System.out.println("enque value :-> " + data);
		System.out.println(" ===================== " );


	}

	public void deque() {
		int x=-1;
		if(this.front ==null) {
			System.out.println("Queue is empty");
		}else {
			 x= this.front.data;
			this.front=this.front.nextNode;
			
		}
		
		if(this.front ==null) {
			this.rear = null;
		}
		System.out.println("deque value :-> " +x);
		System.out.println(" ===================== " );


	}

	public int front(QueueLinkedListOperations q) {
		int x =q.front.data;
		System.out.println("front Value :-> " + x);
		return x;
	}

	public int rear(QueueLinkedListOperations q) {
		int x =q.rear.data;
		System.out.println("rear Value :-> " + x);
		return x;

	}

	public void display() {
		QueueNode q ;
		q=front;
		
		while(q !=null) {
			int x =q.data;
			System.out.println( "values :->"+ x);
			q=q.nextNode;
		}

	}

	public static void main(String[] args) {
		QueueLinkedListOperations qo = new QueueLinkedListOperations();
		qo.enque(10);
		qo.enque(20);
		qo.enque(30);
		qo.enque(40);
		qo.enque(50);
		
		//qo.display();
		
		qo.deque();
		
		qo.front(qo);
		qo.rear(qo);
		
		qo.display();
	}

}
