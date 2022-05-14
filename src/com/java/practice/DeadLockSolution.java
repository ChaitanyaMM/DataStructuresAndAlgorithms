package com.java.practice;

public class DeadLockSolution {

	public static void main(String ar[]) {

		final String s1 = "hi";
		final String s2 = "hello";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (s1) {
					System.out.println("t1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (s2) {
						System.out.println("t1: locked resource 2");
					}
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (s1) {
					System.out.println("t2: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (s2) {
						System.out.println("t2: locked resource 2");
					}
				}
			}

		};

		t1.start();
		t2.start();

	}
}
