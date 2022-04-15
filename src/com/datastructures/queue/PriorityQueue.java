package com.datastructures.queue;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
public class PriorityQueue {

	public static void main(String[] args) {

		Queue<String> testStringsPQ = new PriorityBlockingQueue<>();
		testStringsPQ.add("abcd");
		testStringsPQ.add("1234");
		testStringsPQ.add("23bc");
		testStringsPQ.add("zzxx");
		testStringsPQ.add("abxy");

		System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
		while (!testStringsPQ.isEmpty()) {
			System.out.println(testStringsPQ.poll());
		}
	}

}
