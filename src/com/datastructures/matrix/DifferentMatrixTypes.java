package com.datastructures.matrix;

public class DifferentMatrixTypes {

	// 1.Diagonal Matrix
	public static void diagonalMatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** diagonalMatrix method ******** ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					System.out.println("diagonal Elements :-> " + arr[i][j]);
				}
			}
		}
		System.out.println("================================");
	}

	public static void reversePrintdiagonalMatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** reversePrintdiagonalMatrix method ******** ");
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1; j >= 0; j--) {
				if (i == j) {
					System.out.println("diagonal Elements :-> " + arr[i][j]);
				}
			}
		}
		System.out.println("================================");
	}

	public static void printAnotherDiagonalMatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** printAnotherDiagonalMatrix method ******** ");
		int x = arr.length - 1, y = x;
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr.length - 1; j >= 0; j--) {
				if (y == j) { // if ((i+j) =arr.length-1)
					System.out.println("another diagonal matrix :-> " + arr[i][j]);
				}
			}
			x--;
			y = x;
		}
		System.out.println("================================");
	}

	public static void printAnotherDiagonalMatrix2(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** printAnotherDiagonalMatrix2 method ******** ");
		int x = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("diagonal elements :-> " + arr[i][x--]);
		}
		System.out.println("================================");
	}

	// type2. Lower triangular matrix
	// sqaure matrix is rows and columsn length is equal

	public static void lowerTriangularmatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** lowerTriangularmatrix method ******** ");
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (row != col) {
					System.out.println("not a square matrix ");
				} else if (i < j) {
					arr[i][j] = 0;
				}
				System.out.println("lower triangular elemtns are : " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("================================");

	}

	public static void upperTriangularmatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** upperTriangularmatrix method ******** ");
		int row = arr.length;
		int col = arr[0].length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = col; j >= 0; j--) {
				if (j < i) {
					arr[i][j] = 0;
				}
			}

		}
		System.out.println("================================");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("upper triangular elemtns are : " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// type:3 Symmetric matrix
	public static void symmetricMatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** symmetricMatrix method ******** ");
		int row = arr.length - 1;
		int column = arr[0].length;
		boolean result = false;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (arr[i][j] == arr[j][i]) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
		}
		if (result) {
			System.out.println(" its  symmetric");
		} else {
			System.out.println("no its not symmetric");
		}
		System.out.println("================================");
	}

	// type:4 tryDiagonal matrix
	public static void triDiagonalMatrix(int[][] arr) {

		// for()

	}

	// type:5 triBand matrix
	public static void triBandMatrix(int[][] arr) {

		// for()

	}

	// type:6 tri-Diagonal matrix
	public static void topelizMatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** topelizMatrix method ******** ");
		boolean flag = false;
		int n = arr.length;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (i == j) {
					result = arr[i][j];
					if (arr[i][j] != result) {
					} else {
						flag = true;
					}
				}
			}
		}
		if (flag) {
			System.out.println("its topeliz matrix");

		} else {
			System.out.println("its not a topeliz matrix");
		}

		System.out.println("================================");

	}

	// type:7 sparx matrix

	public static void sparseMatrix(int[][] arr) {
		System.out.println("================================");
		System.out.println("****** sparseMatrix method ******** ");
		int m = arr.length;
		int n = arr[0].length;
		int counter = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					counter++;
				}

			}
		}

		if (counter > (m * n) / 2) {
			System.out.println("yes its a sparse matrix");
		} else {
			System.out.println("not its a sparse matrix");

		}
		System.out.println("================================");

	}

	public static void main(String[] args) {

		int[][] diagonlaMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		diagonalMatrix(diagonlaMatrix);
		reversePrintdiagonalMatrix(diagonlaMatrix);
		printAnotherDiagonalMatrix(diagonlaMatrix);
		printAnotherDiagonalMatrix2(diagonlaMatrix);

		int[][] ltMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		lowerTriangularmatrix(ltMatrix);

		int[][] utMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		upperTriangularmatrix(utMatrix);

		int[][] symmetrixMatrix = { { 2, 2, 2, 2, 2, }, { 2, 3, 3, 3, 3 }, { 2, 3, 4, 4, 4 }, { 2, 3, 4, 5, 5 },
				{ 2, 3, 4, 5, 6 } };
		symmetricMatrix(symmetrixMatrix);

		int topeliz[][] = { { 6, 7, 8, 9 }, { 4, 6, 7, 8 }, { 1, 4, 6, 7 }, { 0, 1, 4, 6 }, { 2, 0, 1, 4 } };
		topelizMatrix(topeliz);

		int sparseMatrix[][] = { { 1, 0, 3 }, { 0, 0, 4 }, { 6, 0, 0 } };
		sparseMatrix(sparseMatrix);
	}

}
