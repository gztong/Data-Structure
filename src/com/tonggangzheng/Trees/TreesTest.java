package com.tonggangzheng.Trees;

import java.io.IOException;

/**
 * Created by Tong on 7/2/16.
 */
public class TreesTest {

    public static Tree buildTree() throws IOException{
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



}
