package com.datastructures.matrix;

public class Toeplitz {

	public static boolean isToeplitz(int[][] matrix) {
		// base case
		if (matrix == null) {
			return true;
		}

		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix[i].length - 1; j++) {
				System.out.println("a :  " + matrix[i][j] + "");
				System.out.println("b :  " + matrix[i + 1][j + 1] + "");

				System.out.println();

				if (matrix[i][j] != matrix[i + 1][j + 1]) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		// The idea is simple – traverse the matrix once, and for each element (i, j),
		// check if it is the same as its immediate diagonal element (i+1, j+1) or not.
		// If any element differs from its immediate diagonal element, the matrix cannot
		// be Toeplitz.
		int[][] matrix = { { 3, 7, 0, 9, 8 }, { 5, 3, 7, 0, 9 }, { 6, 5, 3, 7, 0 }, { 4, 6, 5, 3, 7 } };

		if (isToeplitz(matrix)) {
			System.out.print("Toeplitz matrix");
		} else {
			System.out.print("Not a Toeplitz matrix");
		}
	}

}
