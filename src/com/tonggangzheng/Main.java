package com.tonggangzheng;

import com.sun.scenario.effect.Merge;
import com.tonggangzheng.ArraysAndStrings.MutiplyStrings;
import com.tonggangzheng.ArraysAndStrings.ReplaceSpaces;
import com.tonggangzheng.ArraysAndStrings.StringCombination;
import com.tonggangzheng.BitManipulation.ReverseBits;
import com.tonggangzheng.BitManipulation.SingleNumber;
import com.tonggangzheng.LinkedList.*;
import com.tonggangzheng.Search.BinarySearch;
import com.tonggangzheng.Sort.MergeSort;
import com.tonggangzheng.Sort.QuickSort;
import com.tonggangzheng.Trees.MinimumDepth;
import com.tonggangzheng.Trees.Traversal;
import com.tonggangzheng.Trees.Tree;
import com.tonggangzheng.Trees.TreesTest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        Traversal.test();

    }

    private boolean equal( ArrayList<Integer> a, ArrayList<Integer> b){
        int index = 0;

        while(index < a.size()){
            if(a.get(index).intValue() != b.get(index).intValue()) return false;
            index++;
        }

        return true;
    }

}
