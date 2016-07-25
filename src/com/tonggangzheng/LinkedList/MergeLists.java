package com.tonggangzheng.LinkedList;

/**
 * Created by Tong on 7/23/16.
 */
import com.tonggangzheng.Util;

import java.util.*;
public class MergeLists {
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i).intValue() > b.get(j).intValue()) {
                a.add(i, b.get(j));
                i++;
                j++;
            } else {
                i++;
            }
        }

        while( j<b.size()){
            a.add(b.get(j));
            j++;
        }
    }

    public static void test(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(-2);
        list.add(-1);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(-4);
        list2.add(-2);
        list2.add(18);

        merge(list, list2);

        Util.printList(list);
    }

}