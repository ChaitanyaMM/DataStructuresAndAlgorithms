package com.thread.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

	private static final int MAX_QUEUE_CAPACITY = 5;

	public static void demoSingleProducerAndSingleConsumer() {
		DataQueue dataQueue = new DataQueue(MAX_QUEUE_CAPACITY);

		Producer producer = new Producer(dataQueue);
		Thread producerThread = new Thread(producer);

		Consumer consumer = new Consumer(dataQueue);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();

		List<Thread> threads = new ArrayList<>();
		threads.add(producerThread);
		threads.add(consumerThread);

		// let threads run for two seconds
		Util.sleep(2000);

		// Stop threads
		producer.stop();
		consumer.stop();

		Util.waitForAllThreadsToComplete(threads);
	}

	public static void demoMultipleProducersAndMultipleConsumers() {
		DataQueue dataQueue = new DataQueue(MAX_QUEUE_CAPACITY);
		int producerCount = 3;
		int consumerCount = 3;
		List<Thread> threads = new ArrayList<>();
		Producer producer = new Producer(dataQueue);
		for (int i = 0; i < producerCount; i++) {
			Thread producerThread = new Thread(producer);
			producerThread.start();
			threads.add(producerThread);
		}
		Consumer consumer = new Consumer(dataQueue);
		for (int i = 0; i < consumerCount; i++) {
			Thread consumerThread = new Thread(consumer);
			consumerThread.start();
			threads.add(consumerThread);
		}

		// let threads run for two seconds
		Util.sleep(2000);

		// Stop threads
		producer.stop();
		consumer.stop();

		Util.waitForAllThreadsToComplete(threads);
	}

	public static void main(String[] args) {
		demoSingleProducerAndSingleConsumer();
		demoMultipleProducersAndMultipleConsumers();
	}

}
