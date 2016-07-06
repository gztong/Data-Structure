package com.tonggangzheng.ArraysAndStrings;

/**
 * Created by Tong on 7/5/16.
 *
 *1.7
 * Write an algorithm such that is an element in an M*N matrix is 0,
 * its entire row and column is set to 0
 */
public class SetZeros {

    public static void setZeros(int[][] matrix){
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];

        // Iterrate through the matrix to keep track of the zeros locations
        for(int i=0; i<row.length; i++){
            for(int j=0; j<column.length; j++){
                if( matrix[i][j]==0 ){
                    row[i] = 0;
                    column[j] = 0;
                }
            }
        }

        // Set the matrix to 0 in the second round
        for(int i=0; i<row.length; i++){
            for(int j=0; j<column.length;j++){
                if(row[i]==0 || column[j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
