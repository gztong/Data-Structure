package com.tonggangzheng.LinkedList;

import java.util.ArrayList;

/**
 * Created by Tong on 7/21/16.
 */
public class AddOne {
    public static ArrayList<Integer> addOne(ArrayList<Integer> a){

        int size = a.size();

        int carry = 0;
        int old = a.get(size-1).intValue();
        int newValue  = (old+carry+1);

        a.set(size-1, new Integer(newValue%10));
        carry =  newValue/10;

        for(int i=size-2; i>=0; i--){
            old = a.get(i).intValue();
            newValue = (old+carry);
           a.set(i, new Integer(newValue%10));
           carry = newValue/10;
        }

        if(carry>0){
            a.add(0, carry);
        }else{
            // remove proceeding 0s
            int test;
            int i=0;
            while(i<size-1){
                 test =  a.get(i).intValue();
                System.out.println("!!!!" + test);
                if( a.get(i).intValue()==0 ){
                    a.remove(0);
                }else{
                    break;
                }
            }

        }

        return a;
    }

    public static void test(){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<6; i++){
            a.add(new Integer(0));
        }
        for(int i=0; i<10; i++){
            a.add(new Integer(9));
        }

        a = addOne(a);
        print(a);


    }

    private static void print( ArrayList<Integer> a){
        for(Integer i : a){
            System.out.print(i.intValue());
        }
    }
}
