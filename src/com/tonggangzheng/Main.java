package com.tonggangzheng;

import com.sun.scenario.effect.Merge;
import com.tonggangzheng.ArraysAndStrings.ReplaceSpaces;
import com.tonggangzheng.Search.BinarySearch;
import com.tonggangzheng.Sort.MergeSort;
import com.tonggangzheng.Sort.QuickSort;
import com.tonggangzheng.Trees.TreesTest;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        TreesTest test = new TreesTest();
//
//        test.testSubTree();
//
//
//        String s = ReplaceSpaces.replaceSpace("I'm not happy today.");
//
//        System.out.println(s);

 //       BinarySearch.testRec();

       int arr[] = {10, 3, 21, 1, 4};


        QuickSort.sort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
