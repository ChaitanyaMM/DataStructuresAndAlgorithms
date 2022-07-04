//package com.homework;
//
//public class Deletion {
//
//	public static int minCost(String s, int[] cost) {
//		int totalCost = 0;
//		char prev = s.charAt(0);
//		int maxCost = cost[0];
//		int curTotalCost = cost[0];
//		int length = s.length();
//		for (int i = 1; i < length; i++) {
//			char c = s.charAt(i);
//			int curCost = cost[i];
//			if (c == prev) {
//				maxCost = Math.max(maxCost, curCost);
//				curTotalCost += curCost;
//			} else {
//				totalCost += curTotalCost - maxCost;
//				prev = c;
//				maxCost = curCost;
//				curTotalCost = curCost;
//			}
//		}
//		totalCost += curTotalCost - maxCost;
//		return totalCost;
//	}
//	
//	
//	public static void main(String[] args) {
//		String s = "abccbd";
//		int c[] = {0,1,2,3,4,5};
//		
//		String s1 = "aabbcc";
//		int c1[] = {1,2,1,2,1,2};
//		
//		String s2 = "aaaa";
//		int c2[] = {3,4,5,6};
//		
//		String s3 = "ababa";
//		int c3[] = {10,5,10,5,10};
//				
//		
//		int result=minCost(s,c);
//		System.out.println(result);
//		int result1=minCost(s1,c1);
//		System.out.println(result1);
//		int result2=minCost(s2,c2);
//		System.out.println(result2);
//		int result3=minCost(s3,c3);
//		System.out.println(result3);
//		 
//		
//	}
//
//}
