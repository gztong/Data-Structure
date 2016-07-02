package com.tonggangzheng.Trees;

import javafx.scene.media.SubtitleTrack;

import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * Created by Tong on 7/2/16.
 */
public class TreesTest {

    private Tree tree = buildTree(32);

    private Tree tree2 =  buildTree(18);


    public static Tree buildTree(int count){
        Tree tree = new Tree(count/2);

        for(int i=2; i<count; i++){
            tree.insert(i);
        }

        for(int i=7; i<count; i+=2){
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

    public void testSubTree(){
        System.out.println( "Start test testSubTree ");

        boolean result = SubTree.containsTree(tree2, tree);

        System.out.println(result);

    }


}
