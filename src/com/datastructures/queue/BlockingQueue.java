package com.datastructures.queue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	
	
	private List<Object> queue = new LinkedList<>();
	  private int  limit = 10;

	  public BlockingQueue(int limit){
	    this.limit = limit;
	  }


	  public synchronized void enqueue(Object item)
	  throws InterruptedException  {
	    while(this.queue.size() == this.limit) {
	    	System.out.println("Queue overFlow !..");
	      wait();
	    }
	    this.queue.add(item);
	    if(this.queue.size() == 1) {
	      notifyAll();
	    }
	  }


	  public synchronized Object dequeue()
	  throws InterruptedException{
	    while(this.queue.size() == 0){
	    	System.out.println("Queue underflow !..");

	      wait();
	    }
	    if(this.queue.size() == this.limit){
	      notifyAll();
	    }

	    return this.queue.remove(0);
	  }


	  
	  public void display() {
		  for(int i=0;i<queue.size();i++) {
			  
			  System.out.println( "values :-> " +queue.get(i));
		  }
		  
	  }


public static void main(String []args) throws InterruptedException
{
	BlockingQueue bq=  new BlockingQueue(10);
	
	
	
	bq.enqueue(1);
	bq.enqueue(2);
	bq.enqueue(3);
	bq.enqueue(4);
	bq.enqueue(5);
	bq.enqueue(6);
	bq.enqueue(7);
	bq.enqueue(8);
	bq.enqueue(9);
	bq.enqueue(10);
	
	bq.dequeue();
	
	bq.enqueue(11);

	
	System.out.println("====== equeue ========= !");

	bq.display();
	
	bq.dequeue();
	
	
	System.out.println("====== Dequeue ======= !");
	bq.display();
	
}

}
