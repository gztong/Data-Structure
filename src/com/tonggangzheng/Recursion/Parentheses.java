package com.tonggangzheng.Recursion;

/**
 * Created by Tong on 7/9/16.
 *
 * 8.5 Implement an algorithm to print all valid (e.g., properly opened and closed combinations
 * of n-pairs of parentheses.
 */
public class Parentheses {
    public static void printPar(int left, int right, char[] buffer, int count){
        if( left<right || left<0 ) return;  // invalid state
        if( left == 0 && right == 0){   //
            System.out.println(buffer);
        }else{
            if(left > 0){
                buffer[count] = '(';
                printPar(left-1, right, buffer, count+1);
            }
            if(right > 0){
                buffer[count] = ')';
                printPar(left, right-1, buffer, count+1);
            }
        }
    }

    public static void printPar(int count){
        char[] str = new char[count*2];
        printPar(count, count, str, 0);
    }
}
