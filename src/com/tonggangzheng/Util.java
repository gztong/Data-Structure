package com.tonggangzheng;

import java.util.List;
import java.util.Objects;

/**
 * Created by Tong on 7/23/16.
 */
public class Util<E> {

    public static void printList(List list){
        for( Object a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


}
