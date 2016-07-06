package com.tonggangzheng.ArraysAndStrings;

/**
 * Created by Tong on 7/5/16.
 *
 * 1.8
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s2
 * using only one call to isSubstring (i.e., "waterbottle" is a rotation of "erbottlewat")
 */
public class RotatedString {

    /*
    * 1. Check if s2.length() == s2.length(), if not, return false
    * 2. Else, concatenate s1 with itself and see whether s2 is substring of the result
    * */

    public static boolean isRotatedString(String s1, String s2){

        if (s1.length() != s2.length() || s1.length() == 0 ) return false;

        String s1s1 = s1 + s1;

        if( isSubString(s1s1, s2)) return true;

        return false;
    }

    public static boolean isSubString(String s1, String s2){

        // return true is s2 is s1's substring

        return s1.contains(s2);
    }
}
