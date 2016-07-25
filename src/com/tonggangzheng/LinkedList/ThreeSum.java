package com.tonggangzheng.LinkedList;
import com.tonggangzheng.*;
import java.util.*;

import static com.tonggangzheng.Util.*;

/**
 * Created by Tong on 7/23/16.
 */
public class ThreeSum {
    public static int threeSumClosest(ArrayList<Integer> a, int b) {
        Collections.sort(a);

        int sum = 0;
        int minDiff = Integer.MAX_VALUE;
        int index = 0;
        int i1 = a.size(), j1 = a.size(), k1 = a.size();
        for(int i=0; i<i1; i++){
            for(int j=i+1; j<j1; j++){
                for(int k=j+1; k<a.size(); k++){
                    int diff = Math.abs( a.get(i)+a.get(j)+a.get(k) - b);
                    if(  diff < minDiff){
                        minDiff = diff;
                        i1 = j;
                        j1 = k;
                        k1 = k;
                        sum =  a.get(i)+a.get(j)+a.get(k);
                    }
                }
            }
        }


        return sum;
    }

    public static void test(){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);list.add(-2);list.add(5); list.add(3);

        int r = threeSumClosest(list, 0);

        System.out.println(r);
    }
}
