package com.datastructures.matrix;

import java.util.Arrays;

public class Matrix90AntiClockWise {

	public static void transpose(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < i; j++) {

				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;

			}

		}

	}

 

	public static void antiClockwiseBy90(int[][] arr) {

		 for (int i = 0; i < arr[0].length; i++)
	            for (int j = 0, k = arr[0].length - 1; j < k;
	                 j++, k--) {
	                int temp = arr[j][i];
	                arr[j][i] = arr[k][i];
	                arr[k][i] = temp;
	            }

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 },
				         { 5, 6, 7, 8 }, 
				         { 9, 10, 11, 12 }, 
				         { 13, 14,15, 16 } };

	//	int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}
		System.out.println();

		transpose(mat);

		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}

		System.out.println();

		antiClockwiseBy90(mat);
		
		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}
	}

}
