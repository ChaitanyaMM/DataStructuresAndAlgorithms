package com.datastructures.matrix;

import java.util.Arrays;

public class Rotate180 {
	
    public static void rotateMatrix(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }
 
        // `N × N` matrix
        int N = mat.length;
 
        // rotate the matrix by 180 degrees
        for (int i = 0; i < N /2; i++)
        {
            for (int j = 0; j < N; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[N - i - 1][N - j - 1];
                mat[N - i - 1][N - j - 1] = temp;
            }
        }
 
        // handle the case when the matrix has odd dimensions
        if (N % 2 == 1)
        {
            for (int j = 0; j < N/2; j++)
            {
                int temp = mat[N/2][j];
                mat[N/2][j] = mat[N/2][N - j - 1];
                mat[N/2][N - j - 1] = temp;
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[][] mat =
        {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
 
        rotateMatrix(mat);
 
        // print the matrix
        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }
    }


}
