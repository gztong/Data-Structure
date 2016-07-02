package com.tonggangzheng.Trees;

import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * Created by Tong on 7/2/16.
 */
public class TreesTest {

    private Tree tree = buildTree();


    public static Tree buildTree(){
        Tree tree = new Tree(5);

        for(int i=2; i<4; i++){
            tree.insert(i);
        }

        for(int i=6; i<9; i++){
            tree.insert(i);
        }

        tree.printTree(tree.root);

        return tree;
    }

    public void testFindSum(){

        System.out.println( "Start test findSum ");
        ArrayList<Integer> buffer = new ArrayList<Integer>();

        FindSum.findSum(tree.root, 7, buffer, 0);

    }



}
