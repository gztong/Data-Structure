package com.tonggangzheng.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tong on 7/22/16.
 */
public class MutiplyStrings {

    public static String mutiply(String a, String b){
        char as[] = a.toCharArray();
        char bs[] = b.toCharArray();
        int cs[] = new int[bs.length+1];
        int sum[] = new int[as.length+bs.length];
        Arrays.fill(cs, 0);
        Arrays.fill(sum,  0);


        for(int i=0; i<as.length; i++){

            cs[0] = (as[0]-'0') * (bs[0]-'0') % 10;
            cs[1] = (as[0]-'0') * (bs[0]-'0') / 10;
            for(int j=bs.length-1; j>=0; j--){

                // as[i] * bs[j] % 10
                int temp = (as[i]-'0') * (bs[j]-'0' + cs[j]) % 10;
                //
                cs[j+1] =  (as[i]-'0') * (bs[j]-'0' + cs[j]) / 10;

                cs[j] = temp;
            }

            sum(cs, sum.clone() ,sum);
            shift(sum);
        }

        StringBuilder result = new StringBuilder();
        for(int i : sum){
            result.append(i);
        }

        return result.toString();
     }

    private static int[] shift(int sum[]){
        for(int i=1; i<sum.length; i++){
            sum[i] = sum[i-1];
        }
        sum[0] = 0;

        return sum;
    }


    private static int[] sum(int[] a, int[] b, int[] sum){
        int min = a.length < b.length ? a.length: b.length;

        sum[0] = (a[0] + b[0]) % 10;
        sum[1] = (a[0] + b[0]) / 10;
        for(int i=1; i<min; i++){
            int temp = (a[i] + b[i] + sum[i]) %10;
            sum[i+1] = (a[i] + b[i] + sum[i]) / 10;
            sum[i] = temp;
        }

        return sum;
    }

    public static void test(){
        char a[] = {'1','2','3'};
        char b[] = {'9','2','3'};


        String s = mutiply("123", "10");

        System.out.println(s);
//        for(int i : r){
//            System.out.print(i);
//        }
    }


}
