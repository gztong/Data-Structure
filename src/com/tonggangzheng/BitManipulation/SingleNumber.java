package com.tonggangzheng.BitManipulation;

import java.util.*;
/**
 * Created by Tong on 7/23/16.
 */
public class SingleNumber {
    public static int singleNumber(final List<Integer> a) {
        int res = 0;

        for(int i=0; i<32; i++){
            int count = 0;
            for(int b : a){
                if( ( 1&(b>>i) )==1) count++;
            }
            System.out.println(count);
            // odd
            if(count%2 ==1 ) {
                res = res | (1<<i);
            }
        }

        return res;
    }

    public static void test(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        int single = singleNumber(list);

        System.out.println(single);

    }
}
