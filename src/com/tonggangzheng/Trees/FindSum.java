package com.tonggangzheng.Trees;

import java.util.ArrayList;

/**
 * Created by Tong on 7/2/16.
 */

/*
* You are given a binary tree in which each node contains a value.
* Design an algorithm to print all paths which sum up to a certain value S
*
* */
public class FindSum {

    public static void findSum(Node head, int S, ArrayList<Integer> buffer, int level){
        if(head == null) return;  //base case

        buffer.add(head.data);
        int temp = S;

        for(int i=level; i>-1; i--){
            temp -= buffer.get(i);
            if( 0 == temp){
                printPath(buffer, i, level);
            }
        }

        ArrayList<Integer> left = (ArrayList<Integer>) buffer.clone();
        ArrayList<Integer> right = (ArrayList<Integer>)buffer.clone();
        findSum(head.left, S, left, level++);
        findSum(head.right, S, right, level++);
    }

    private static void printPath(ArrayList<Integer> buffer, int start, int end){

        System.out.print("In Level " + end + ", find path: ");

        for(int i = start; i < end; i++){
            System.out.print(buffer.get(i) + " ---> ");
        }
        System.out.println(buffer.get(end) );
    }
}
