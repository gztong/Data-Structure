package com.tonggangzheng.Trees;

/**
 * Created by Tong on 7/2/16.
 */
public class SubTree {
    public static boolean containsTree(Tree t1, Tree t2){
        return containsTree(t1.root, t2.root);
    }

    private static boolean containsTree(Node r1, Node r2){
        // The empty tree is always a subtree
        if (r2 == null) return true;

        return subTree(r1, r2);
    }

    private static boolean subTree(Node r1, Node r2){
        if( r1 == null)  return false;

        if(r1.data == r2.data){
            if(matchTree(r1, r2)) return true;
        }

        return subTree(r1.left, r2) | subTree(r1.right, r2);
    }


    private static boolean matchTree(Node r1, Node r2){
        if(r2==null && r1==null) return true; // Nothing left in the subtree

        if(r2==null || r1==null) return false;

        if(r1.data != r2.data) return false;

        return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));
    }


}
