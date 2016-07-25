package com.tonggangzheng.BitManipulation;

/**
 * Created by Tong on 7/23/16.
 */
public class BitTool {

    public static void printBits(long a){
        for(int i=31; i>=0; i--){
            int bit = (int) (a>>i & 1);
            System.out.print( bit );
        }
        System.out.println();
    }
}
