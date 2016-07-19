package com.tonggangzheng.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Tong on 7/18/16.
 */
public class AnagramComparaor implements Comparator<String> {

    private String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String s1, String s2){

        return sort(s1).compareTo(sort(s2));
    }
}


// Now just sort the arrays using this compareTo method instead of the usual one

// Arrays.sort(array, new AnagramComparator());