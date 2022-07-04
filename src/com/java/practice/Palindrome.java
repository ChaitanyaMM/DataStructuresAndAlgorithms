package com.java.practice;

public class Palindrome {

	public static boolean intPalindrome(int num) {

		int r, sum = 0, temp;
		int n = num;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number ");
			return true;
		}

		else {
			System.out.println("not palindrome");
		}

		return false;

	}

	public static boolean stringPalindrome(String string) {

		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);

		}

		if (reverse.equals(string)) {
			System.out.println("yes string is palindrome");

			return true;
		} else {
			System.out.println("no string is palindrome");

		}

		return false;

	}

	public static void main(String[] args) {

		int n1 = 454;
		intPalindrome(n1);

		String s1 = "chy";
		stringPalindrome(s1);

	}

}
