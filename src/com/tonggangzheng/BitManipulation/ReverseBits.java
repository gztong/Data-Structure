package com.tonggangzheng.BitManipulation;

/**
 * Created by Tong on 7/23/16.
 */
public class ReverseBits {
    public static long reverse(long a) {
        long ret = 0;
        for(int i=0; i<31; i++){
            ret = setBit(31-i,ret, (int)(a&1) );
            a >>= 1;
        }
        return ret;

    }

    private static long setBit(int pos, long a, int val){
        long ret;
        if(val == 1){ // set
            ret = a | (1 << pos);
        }else{  // unset
            ret = a & ~(1 << pos);
        }

        return ret;
    }

    public static void test(){
        long a = 4;
        long ret = reverse(a);

        long correct = 1<<31;

       for(int i=0; i<32; i++){
          System.out.println( Long.toBinaryString((1<<i)));
           BitTool.printBits(1<<i);
       }


    }
}
