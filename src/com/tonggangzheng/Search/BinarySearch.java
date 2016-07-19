package com.tonggangzheng.Search;

/**
 * Created by Tong on 7/11/16.
 */
public class BinarySearch {
    private static int arr[] = {1};
    private static String withEmpty[] = {"at", "", "", "", "ball", "car","","dad"};

    private static int search(int a[], int left, int right, int x){
        while(left <= right){
            int middle = (left+right)/2;
            if(a[middle] == x){
                return middle;
            }else if( x > a[middle]){
                left = middle+1;
            }else{
                x = middle - 1;
            }
        }
        return -1;
    }

    public static int search(int a[], int x){
        return search(a, 0, a.length-1, x);
    }


    private static int searchRec(int a[], int left, int right, int x){
        if( left > right) return -1;

        int middle = (left+right)/2;
        if( x == a[middle]) return middle;
        if( x>a[middle]){
            return searchRec(a, middle+1, right, x);
        }else{
            return searchRec(a, left, middle-1, x);
        }

    }

    public static void test(){
        int index = search(arr, 10);
        System.out.println(index);
    }

    public static void testRec(){
        int index = searchRec(arr, 0, arr.length-1, 10);
        System.out.println(index);
    }


    private static int searchStr(String arr[], int left, int right, String x){
        while(left <= right){

            // Ensure there is something at the end
            while( left <= right && arr[right] == ""){
                right --;
            }

            if(left < right) return -1;

            int middle = (left + right) / 2;

            if(arr[middle].equals("")){
                middle++;
            }

            if (arr[middle].equals(x) ){
                return middle;
            }
            if( x.compareTo(arr[middle])<0  ){
                right = middle -1;
            }else{
                left = middle + 1;
            }
        }

        return -1;
    }
}

