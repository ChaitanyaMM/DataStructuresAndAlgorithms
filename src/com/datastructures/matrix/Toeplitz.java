package com.datastructures.matrix;

public class Toeplitz {
	
	public static boolean isToeplitz(int[][] matrix)
    {
        // base case
        if (matrix == null) {
            return true;
        }
 
        for (int i = 0; i < matrix.length - 1; i++)
        {
            for (int j = 0; j < matrix[0].length - 1; j++)
            {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
        int[][] matrix =
        {
            { 3, 7, 0, 9, 8 },
            { 5, 3, 7, 0, 9 },
            { 6, 5, 3, 7, 0 },
            { 4, 6, 5, 3, 7 }
        };
 
        if (isToeplitz(matrix)) {
            System.out.print("Toeplitz matrix");
        }
        else {
            System.out.print("Not a Toeplitz matrix");
        }
    }

}
