package com.java.practice;

public class StringPool {
	
	 public static void main(String[] args)
	 {
	         String s1 = "Rachel";
	         String s2 = "Rachel";
	         String s3 = new String("Rachel");
	         String s4 = new String("Rachel").intern(); 
	         System.out.println(s1 == s2); // true
	         System.out.println(s1 == s3); // false
	         System.out.println(s1 == s4); // true 
	         System.out.println(s1.equals(s4)); // true 

}
}