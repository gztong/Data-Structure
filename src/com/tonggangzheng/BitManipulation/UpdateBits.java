package com.tonggangzheng.BitManipulation;

/**
 * Created by Tong on 7/2/16.
 */

/*
* 5.1
* You are given two 32-bit numbers N and M, and two bit positions, i and j.
* Write a method to set all bits between i and j in N equal to M
*
* */
public class UpdateBits {
    public static int setBits(int N, int M, int i, int j){
        if( i >= j | i<0 | j<0 | i> Integer.toBinaryString(M).length()){
            System.out.println("Invalid input.");
            return N;
        }
        int max = ~0; // all 1s
        int left = max<<j;
        int right = 1<<i - 1;
        int mask = left | right;

        return (N & mask) | (M<<i) ;
    }


    public static void printBits(int N){
//        int b = 1;
//        while(N!=0){
//            System.out.print(N&b);
//            N = N>>1;
//        }
        System.out.println( Integer.toString(N, 2));

    }
}
