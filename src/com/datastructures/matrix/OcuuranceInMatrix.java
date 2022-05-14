package com.datastructures.matrix;

public class OcuuranceInMatrix {
	public static void findElement(int[][] mat, int key)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }
 
        // `M × N` matrix
        int M = mat.length;
        int N = mat[0].length;
 
        // start from `(0, N-1)`, i.e., top-rightmost cell of the matrix
        int i = 0, j = N - 1;
 
        // run till matrix boundary is reached
        while (i <= M - 1 && j >= 0)
        {
            // if the current element is less than the key, increment row index
            if (mat[i][j] < key) {
                i++;
            }
 
            // if the current element is more than the key, decrement col index
            else if (mat[i][j] > key) {
                j--;
            }
 
            // if the current element is equal to the key
            else {
                System.out.println("Element " + key + " is found at position ("
                        + i + ", " + j + ")");
 
                i++; j--;
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[][] mat =
        {
            { -4, -3, -1, 3, 5 },
            { -3, -2, 2, 4, 6 },
            { -1, 1, 3, 5, 8 },
            { 3, 4, 7, 8, 9 }
        };
 
        int key = 3;
 
        findElement(mat, key);
    }

}
