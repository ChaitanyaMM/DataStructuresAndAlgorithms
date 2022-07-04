package com.datastructures.matrix;

import java.util.Arrays;
import java.util.Comparator;

public class MatrixOperations {

	public static void traverse(int[][] matrix) {

		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix.length; l++) {

				System.out.print(matrix[k][l] + " ");

			}
			System.out.println();// new line

		}

	}

	public static void addition(int[][] matrix1, int[][] matrix2) {

		int n1 = matrix1.length;
		// System.out.println(""+n1);
		int n2 = matrix2.length;
		int[][] c = new int[n1][n2];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {

				c[i][j] = matrix1[i][j] + matrix2[i][j];
			}

		}

		traverse(c);

	}

	public static void transpose(int[][] matrix) {

		int[][] transpose = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}

		traverse(transpose);

	}

	public static void rowWiseSorting(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				for (int k = 0; k < matrix[i].length - j - 1; k++) {

					if (matrix[i][k] > matrix[i][k + 1]) {

						int temp = matrix[i][k];
						matrix[i][k] = matrix[i][k + 1];
						matrix[i][k + 1] = temp;

					}

				}

			}
		}

		System.out.println();

		traverse(matrix);

	}

	public static void sortParticularColumn(int[][] mat, int columnTobeSorted) {

		Arrays.sort(mat, new Comparator<int[]>() {

			@Override
			public int compare(int[] e1, int[] e2) {
				if (e1[columnTobeSorted] > e2[columnTobeSorted]) {
					return 1;

				} else {
					return -1;

				}
			}
		});

		traverse(mat);

	};

	public static void inverse(int[][] mat) {
		// -1
		// [4 7 ] = ____1______ [6 -7 ] -> _1_ [6 -7 ] = [ 0.6 -0.7]
		// [2 6 ] = 4*6 -7*2 [-2 4 ] 10 [-2 4 ] [-0.2 .04 ]

		int n1 = mat.length;
		int temp;
		float deteministic = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);

		temp = mat[0][0];
		mat[0][0] = mat[1][1];
		mat[1][1] = temp;
		mat[0][1] = -mat[0][1];
		mat[1][0] = -mat[1][0];

		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j)
				System.out.print((mat[i][j] / deteministic) + " ");
			System.out.print("\n");

		}

	}

	public static void sortMatrix(int[][] matrix) {
		int n = matrix.length;
		// temporary matrix of size n^2
		int temp[] = new int[n * n];
		int k = 0;

		// copy the elements of matrix
		// one by one into temp[]
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				temp[k++] = matrix[i][j];

		// sort temp[]
		Arrays.sort(temp);

		// copy the elements of temp[]
		// one by one in mat[][]
		k = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matrix[i][j] = temp[k++];

		traverse(matrix);

	}

	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

		int[][] inversematrix = { { 4, 7 }, { 2, 6 } };

		int trasnpose[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] sorting = { { 9, 8, 7, 1 }, { 7, 3, 0, 2 }, { 9, 5, 3, 2 }, { 6, 3, 1, 2 } };

//		addition(matrix1, matrix2);
//
//		System.out.println();
//
//		inverse(inversematrix);
//
//		System.out.println();
//
//		transpose(trasnpose);
//
//		System.out.println();
//
//		rowWiseSorting(sorting);
//
//		System.out.println();
//
//		sortParticularColumn(sorting, 3);
//
//		System.out.println();

		sortMatrix(inversematrix);

	}

}
