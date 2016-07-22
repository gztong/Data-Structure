package com.tonggangzheng.ArraysAndStrings;

import java.util.*;
/**
 * Created by Tong on 7/22/16.
 *
 * A string consists of ‘0’, ‘1’ and '?'. The question mark can be either '0' or '1'.
 * Find all possible combinations for a string.
 *
 * */

public class StringCombination {
    // s : 110?0?0?

    public static void test(){
        test("0??");
    }

    public static void test(String s){

        ArrayList<String> start  = new ArrayList<>();
        start.add(s);
        int length = s.length();
        int firstQ = 0;
        int numOfPmt = 1;

        for(int i = length-1; i>=0; i--){
            if( s.charAt(i) =='?'){
                firstQ = i;
                numOfPmt*=2;
            }
        }

        ArrayList<String> result = build(start, firstQ, length, s);
        // remove items with '?'
        for(int i =result.size()-1; i > (result.size()-1-numOfPmt); i-- ){
            System.out.println( result.get(i) );
        }

    }

    private static ArrayList<String> build(ArrayList<String> list, int i, int length, String origin){
        ArrayList<String> ret = new ArrayList<>(list);
        for(String s : list){
            String s1 = s.substring(0, i) + "1" + s.substring(i+1);
            String s2= s.substring(0, i) + "0" + s.substring(i+1);
            ret.add(s1);
            ret.add(s2);
        }

        for(int k = i+1 ; k < length; k++){
            if( origin.charAt(k) == '?' ){
                return build(ret, k, length, origin);
            }
        }

        return ret;
    }


}
