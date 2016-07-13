package com.tonggangzheng.Sort;

/**
 * Created by Tong on 7/12/16.
 */
public class MergeSort {

    private static int[] temp;
    public static void sort(int a[]){
        temp = new int[a.length];

        for(int i=0; i<a.length; i++){
            temp[i] = a[i];
        }

        doMergeSort(a, 0, a.length-1);
    }

    private static void doMergeSort(int a[], int low, int high){
        if(low < high){
            int middle = low + (high - low) /2;
            doMergeSort(a, low, middle);
            doMergeSort(a, middle+1, high);
            mergeParts(a, low, middle, high);
        }
    }

    private static void mergeParts(int a[], int low, int middle, int high){

        for(int i=low; i <=high; i++){
            temp[i] = a[i];
        }

        int i = low;
        int j = middle+1;
        int k = low;

        while( i<= middle && j<=high ){
            if( temp[i] <= temp[j] ){
                a[k] = temp[i];
                i++;
            }else{
                a[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i<=middle){
            a[k] = temp[i];
            i++;
            k++;
        }
//        while(j<=high){
//            a[k] = temp[j];
//            j++;
//            k++;
//        }
    }

    public static void test(){
        int arr[] = {4,1,2,3,0,9};
        sort(arr);

        for(int i : arr)
        System.out.print(i);
    }
}
