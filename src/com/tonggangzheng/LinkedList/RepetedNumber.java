package com.tonggangzheng.LinkedList;

import java.util.*;
/**
 * Created by Tong on 7/21/16.
 */
public class RepetedNumber {
    public static int repeatedNumber(final List<Integer> a) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : a){
            if( map.get(i)==null ){
                map.put(i, 1);
            }else{
                int temp = map.get(i).intValue() + 1;
                map.put(i, temp);
            }
        }

        for( int i: map.keySet() ){
            if(map.get(i).intValue() >=3 ){
                return i;
            }
        }

        return -1;

    }

    public static void test(){
        List<Integer> a = new ArrayList<Integer>();
        a.add(4);
        a.add(2);

        int  r= repeatedNumber(a);
        System.out.println(r);
    }
}
