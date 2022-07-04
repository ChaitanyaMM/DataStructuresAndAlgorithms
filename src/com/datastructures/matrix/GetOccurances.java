package com.datastructures.matrix;

public class GetOccurances {

	public static void findElement(int[][] mat, int key) {
		// base case
		if (mat == null || mat.length == 0) {
			return;
		}

		// `M × N` matrix
		int M = mat.length;
		int N = mat[0].length;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {

				if (mat[i][j] == key) {
					System.out.println
					("Element " + key + " is found at position (" + i + ", " + j + ")");

				}

			}

		}

	}

	public static void main(String[] args) {
		int[][] mat = { { -4, -3, -1, 3, 5 }, 
				        { -3, -2, 2, 4, 6 },
				        { -1, 1, 3, 5, 8 }, 
				        { 3, 4, 7, 8, 9 } };

		int key = 3;

		findElement(mat, key);
	}

}
