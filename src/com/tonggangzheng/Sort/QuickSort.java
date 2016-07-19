package com.tonggangzheng.Sort;

/**
 * Created by Tong on 7/13/16.
 */
public class QuickSort {

    private static int partition(int[] arr, int left, int right){
        int i = left, j = right;
        int pivot = arr[(left+right)/2];
        int temp;

        while( i<=j ){
            while( arr[i] < pivot ){
                i++;
            }
            while( arr[j] > pivot ){
                j--;
            }

            // swap
            if(i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }

        return i;
    }

    private static void sort(int[] arr, int left, int right){

        int index = partition(arr, left, right);
        if( left < index-1 ){
            partition(arr, left, index-1);
        }
        if( right > index+1 ){
            partition(arr, index+1, right);
        }
    }

    public static void sort(int[] arr){
        sort(arr, 0, arr.length-1);
    }

}
