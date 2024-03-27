package com.datastructures.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedyAlgorithms {

	static class Items {
		int val;
		int weight;

		Items(int val, int weight) {
			this.val = val;
			this.weight = weight;

		}
	}

	static void FractionalKnapsackproblem(Items[] arr, int capacity) {
		System.out.println("=======================");
		System.out.println("********FractionalKnapsackproblem method ***********");
		int totalValue = 0;
		for (Items item : arr) {
			if (capacity - item.weight >= 0) {
				capacity = capacity - item.weight;
				totalValue += item.val;
			} else {
				double fraction = ((double) capacity / (double) item.weight);
				totalValue += (item.val * fraction);
				capacity = (int) (capacity - (item.weight * fraction));
				break;
			}
		}
		System.out.println("totalValue :-> " + totalValue);
		System.out.println("=======================");
	}

	static void findMinimumNuberOfCoins(int[] coins, int requiredmoney) {
		System.out.println("=======================");
		System.out.println("********findMinimumNuberOfCoins method ***********");
		List<Integer> needfulCoinsList = new ArrayList<>();
		for (int i = coins.length - 1; i >= 0; i--) {
			while (requiredmoney >= coins[i]) {
				requiredmoney -= coins[i];
				needfulCoinsList.add(coins[i]);
			}
		}
		needfulCoinsList.forEach(System.out::println);
		System.out.println("=======================");
	}

	static class Job {
		char id;
		int deadline;
		int profit;

		Job(char id, int deadline, int profit) {
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	// this problem u should select max proft & max deadline timeslost(here every
	// job is)
	// at that momoent how many time slots u can select is the probelm
	static void jobSequenceprobelm(List<Job> job, int n) {
		System.out.println("=======================");
		System.out.println("********jobSequenceprobelm method ***********");
		Collections.sort(job, (a, b) -> b.profit - a.profit);
		// To keep track of free time slots
		boolean result[] = new boolean[n];
		// To store result (Sequence of jobs)
		char jobC[] = new char[n];

		for (int i = 0; i < job.size(); i++) {

			// Find a free slot for this job (Note that we
			// start from the last possible slot)
			int min = Math.min(n - 1, job.get(i).deadline - 1);
			for (int j = min; j >= 0; j--) {
				if (result[j] == false) {
					result[j] = true;
					jobC[j] = job.get(i).id;
					break;
				}
			}
		}

		for (char c : jobC) {
			System.out.println("job is " + c);
		}
		System.out.println("=======================");
	}

	// Applications
	// Loading of containers like trucks.
	// Placing data on multiple disks.
	// Job scheduling.
	// Packing advertisements in fixed length radio/TV station breaks.
	// Storing a large collection of music onto tapes/CD’s, etc.
	public static void BinPackingProblem_NextFit(int[] weights, int n, int capacity) {
		int neededExtraBins = 0; // this is to be known right
		int binsHavingNow = capacity;
		for (int i = 0; i < n; i++) {
			if (weights[i] > binsHavingNow) {
				neededExtraBins++;
				binsHavingNow = capacity - weights[i];
			} else {
				binsHavingNow -= weights[i];
			}
		}
		System.out.println("capacity:-> " + capacity);
		System.out.println("Number of bins required in Next Fit : " + neededExtraBins);

	}

	static int firstFit(int weight[], int n, int c) {
		// Initialize result (Count of bins)
		int res = 0;

		// Create an array to store remaining space in bins
		// there can be at most n bins
		int[] bin_rem = new int[n];

		// Place items one by one
		for (int i = 0; i < n; i++) {
			// Find the first bin that can accommodate
			// weight[i]
			int j;
			for (j = 0; j < res; j++) {
				if (bin_rem[j] >= weight[i]) {
					bin_rem[j] = bin_rem[j] - weight[i];
					break;
				}
			}

			// If no bin could accommodate weight[i]
			if (j == res) {
				bin_rem[res] = c - weight[i];
				res++;
			}
		}

		for (int a : bin_rem) {
			System.out.println("First FIT :-> " + a);
		}
		return res;
	}

	// function for calculating min operations
	static int minOperationsForMakingAllElementsEqaual(int arr[], int k) {
		// step 1. sort array for max
		// step 2. check all elements can make zero by dividing
		// Step 3. if all elements can make zero that possible
		// for adding k we can equal all elements in the given array

		Arrays.sort(arr);
		int max = arr[arr.length - 1];

		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			if (max - arr[i] % k != 0) {
				return -1;
			} else
				result += (max - arr[i]) / k;

		}
		System.out.println("minimum operation make all array equal is" + result);
		return result;
	}

	public static void travellingSalesManProblem() {
		// Step:1 find out minimim
		// Step:2 find out primsMST
		// Step:3 apply preorder for the step2 and add 1 atthe end

	}

	static int findMatchingLength(String str1, String str2) {
		for (int i = 1; i < str1.length(); i++) {
			if (str2.startsWith(str1.substring(i))) {
				return str2.length() - str1.length() + i;
			}
		}
		return -1;

	}

	public static void subString() {
		String ssss = "chaitanya";
		System.out.println("from the given to end of the lenght :-> " + ssss.substring(4));
		System.out.println("specific substring :-> " + ssss.substring(0, 4));
	}

	// shortest-superstring-problem
	static String str;

	// Utility function to calculate
	// minimum of two numbers
	static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	// Function to calculate maximum
	// overlap in two given strings
	static int findOverlappingPair(String str1, String str2) {

		// max will store maximum
		// overlap i.e maximum
		// length of the matching
		// prefix and suffix
		int max = Integer.MIN_VALUE;
		int len1 = str1.length();
		int len2 = str2.length();

		// check suffix of str1 matches
		// with prefix of str2
		for (int i = 1; i <= min(len1, len2); i++) {

			// compare last i characters
			// in str1 with first i
			// characters in str2
			if (str1.substring(len1 - i).compareTo(str2.substring(0, i)) == 0) {
				if (max < i) {

					// Update max and str
					max = i;
					str = str1 + str2.substring(i);
				}
			}
		}

		// check prefix of str1 matches
		// with suffix of str2
		for (int i = 1; i <= min(len1, len2); i++) {

			// compare first i characters
			// in str1 with last i
			// characters in str2
			if (str1.substring(0, i).compareTo(str2.substring(len2 - i)) == 0) {
				if (max < i) {

					// update max and str
					max = i;
					str = str2 + str1.substring(i);
				}
			}
		}

		return max;
	}

	// Function to calculate smallest
	// string that contains
	// each string in the given set as substring.
	static String shortestSuperstringProblem(String arr[], int len) {

		// run len-1 times to consider every pair
		while (len != 1) {

			// To store maximum overlap
			int max = Integer.MIN_VALUE;

			// To store array index of strings
			// involved in maximum overlap
			int l = 0, r = 0;

			// to store resultant string after
			// maximum overlap
			String resStr = "";

			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {

					// res will store maximum
					// length of the matching
					// prefix and suffix str is
					// passed by reference and
					// will store the resultant
					// string after maximum
					// overlap of arr[i] and arr[j],
					// if any.
					int res = findOverlappingPair(arr[i], arr[j]);

					// Check for maximum overlap
					if (max < res) {
						max = res;
						resStr = str;
						l = i;
						r = j;
					}
				}
			}

			// Ignore last element in next cycle
			len--;

			// If no overlap,
			// append arr[len] to arr[0]
			if (max == Integer.MIN_VALUE)
				arr[0] += arr[len];
			else {

				// Copy resultant string
				// to index l
				arr[l] = resStr;

				// Copy string at last index
				// to index r
				arr[r] = arr[len];
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		int capacity = 50;
		Items[] items = { new Items(60, 10), new Items(100, 20), new Items(120, 30) };
		FractionalKnapsackproblem(items, capacity);

		int[] coins = { 1, 10, 12, 40, 60, 70, 80, 90 };
		findMinimumNuberOfCoins(coins, 53);

		List<Job> jobsList = new ArrayList<>();
		jobsList.add(new Job('a', 2, 200));
		jobsList.add(new Job('b', 1, 10));
		jobsList.add(new Job('c', 1, 28));
		jobsList.add(new Job('d', 2, 300));
		jobsList.add(new Job('e', 3, 15));
		jobSequenceprobelm(jobsList, 4);

		int[] weights = { 2, 5, 4, 7, 1, 3, 8 };
		int[] weights2 = { 12, 5, 4, 7, 10, 3, 8 };
		BinPackingProblem_NextFit(weights, weights.length, 10);
		BinPackingProblem_NextFit(weights2, weights2.length, 10);
		firstFit(weights, weights.length, 10);

		int arr[] = { 21, 33, 9, 45, 63 };
		int k = 6;
		minOperationsForMakingAllElementsEqaual(arr, k);

		 String[] shortestSuperStringArr = { "catgc", "ctaagt", "gcta", "ttca",
		 "atgcatc" };
		subString();
		shortestSuperstringProblem(shortestSuperStringArr,shortestSuperStringArr.length);
		System.out.println( "shortestSupersis :-> "+ str);
	}

}
