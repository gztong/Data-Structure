package com.tonggangzheng.ArraysAndStrings;

/**
 * Created by Tong on 7/5/16.
 *
 * 1.6
 * Given an image represented by an N*N MATRIX, int[][]
 * Write a method to rotate the image by 90 degrees
 */


public class RotateMatrix {
    public static void rotate(int[][] matrix, int n){
        for(int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i]; //save top
                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;  // right <- saved top
            }
        }

    }
}
