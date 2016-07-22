package com.tonggangzheng.LinkedList;

import java.util.*;

/**
 * Created by Tong on 7/21/16.
 */
public class MaxSubSet {
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {

        ArrayList<ArrayList<Integer>> as= new ArrayList<ArrayList<Integer>>();
        // Separate
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(Integer i : a){
            if(i.doubleValue()>=0){
                temp.add(i);
            }else{
                if(temp.size()>0){
                    as.add(temp);
                }
                temp = new ArrayList<>();
                continue;
            }
        }
        if(temp.size()>0){
            as.add(temp);
        }

        if(as.size() == 0) return new ArrayList<Integer>();

        double max = 0;
        int index = 0;
        int i =0;
        for(ArrayList<Integer> arr : as){
            double sum = sum(arr);
            System.out.println("sum = " + sum + "  index = " + index);

            if( sum > max){
                max = sum;
                index = i;
            }

            i++;
        }

        return as.get(index);
    }

    private static double sum(ArrayList<Integer> a){
        double sum = 0;
        for(Integer i : a){
            sum = sum + i.doubleValue();
        }

        return sum;
    }

    public static void test(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        int a1[] = { 756898537, -1973594324, -2038664370, -184803526, 1424268980 };

        for(int i : a1){
            a.add(new Integer(i));
        }

        ArrayList<Integer> rslt = maxset(a);

        for(Integer inte : rslt){
            System.out.println(inte.intValue());
        }
    }
}
