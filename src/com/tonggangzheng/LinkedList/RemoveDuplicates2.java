package com.tonggangzheng.LinkedList;


/**
 * Created by Tong on 7/23/16.
 */

import com.tonggangzheng.Util;

import java.util.*;
public class RemoveDuplicates2 {
    public static int removeDuplicates(ArrayList<Integer> A) {
        int index = 2;
        int n = A.size();

        if (A == null || A.size() == 0)
            return 0;

        if (A.get(0).intValue() != A.get(1).intValue()) {
            A.set(index, A.get(n-1));
            index++;
        }

        for (int i = 2; i < n-1; i++) {
            if ( (A.get(i).intValue() != A.get(i - 1).intValue())  )  {
                if (A.get(i).intValue() == A.get(i +1).intValue()) {
                    A.set(index, A.get(i));
                    A.set(index+1, A.get(i));
                    index+=2;
                }else{
                    A.set(index, A.get(i));
                    index++;
                }
            }
        }


        if (A.get(n-1).intValue() != A.get(n-2).intValue()) {
            A.set(index, A.get(n-1));
            index++;
        }


        int i=index;
        while( i < n){
            A.remove(A.size()-1);
            i++;
        }

        return index;
    }

    public static void test(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5000);
        a.add(6000);

        a.add(6000);
        a.add(6000);
        a.add(6000);


        int n = removeDuplicates(a);

        Util.printList(a);
    }
}
