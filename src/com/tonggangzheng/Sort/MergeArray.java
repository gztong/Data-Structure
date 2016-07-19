package com.tonggangzheng.Sort;

/**
 * Created by Tong on 7/18/16.
 * 9.1
 * You are given two sorted arrays, A and B, and A has a large enoguh buffer at the end to Hold B
 * Write a method to merge B int A in sorted order
 */
public class MergeArray {
    public static void merge(int A[], int B[], int m, int n){
        // using merge sort, from back

        int k = m+n-1; // index of last element in A
        int i = m-1; // index of last non-empty element in A
        int j = n-1; // index of last element in B

        while( i>=0 && j>=0 ){
            if( A[i] > B[j]){
                A[k] = A[i];
                i--;
            }else (A[i] < B[j]){
                A[k] = B[j];
            }
            k--;
        }
        while( j>=0 ){
            A[k] = B[j];
            j--;
            k--;
        }

    }

}
