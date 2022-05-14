package com.java.practice;

public class Deadlock {

	public static void main(String[] args) throws InterruptedException {

		final String s1 = "hi";
		final String s2 = "hello";

		Thread t1 = new Thread() {

 		        public void run() {  
		            synchronized (s1) {  
		             System.out.println("t1: locked resource 1");  
		    
		             try { Thread.sleep(100);} catch (Exception e) {}  
		    
		             synchronized (s2) {  
		              System.out.println("t1: locked resource 2");  
		             }  
		           }  
		        }  
		      }; 

		 

		Thread t2 = new Thread() {

			 public void run() {  
		            synchronized (s2) {  
		             System.out.println("t2: locked resource 2");  
		    
		             try { Thread.sleep(100);} catch (Exception e) {}  
		    
		             synchronized (s1) {  
		              System.out.println("t2: locked resource 1");  
		             }  
		           }  
		        }  

		};

		t1.start();
		//t1.join();
		t2.start();

	}

}
