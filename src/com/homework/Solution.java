package com.homework;

public class Solution {
    public  int solution(String S, int[] C) {
		int totalCost = 0;
		char prev = S.charAt(0);
		int maxCost = C[0];
		int curTotalCost = C[0];
		int length = S.length();
		for (int i = 1; i < length; i++) {
			char c = S.charAt(i);
			int curCost = C[i];
			if (c == prev) {
				maxCost = Math.max(maxCost, curCost);
				curTotalCost += curCost;
			} else {
				totalCost += curTotalCost - maxCost;
				prev = c;
				maxCost = curCost;
				curTotalCost = curCost;
			}
		}
		totalCost += curTotalCost - maxCost;
		return totalCost;
	}
	
	
	public static void main(String[] args) {
		String s = "abccbd";
		int c[] = {0,1,2,3,4,5};
		
		String s1 = "aabbcc";
		int c1[] = {1,2,1,2,1,2};
		
		String s2 = "aaaa";
		int c2[] = {3,4,5,6};
		
		String s3 = "ababa";
		int c3[] = {10,5,10,5,10};
				
		Solution solution = new Solution();
		
		int result=solution.solution(s,c);
		System.out.println(result);
		int result1=solution.solution(s1,c1);
		System.out.println(result1);
		int result2=solution.solution(s2,c2);
		System.out.println(result2);
		int result3=solution.solution(s3,c3);
		System.out.println(result3);
		 
		
	}

}
