package com.tonggangzheng.Trees;

/**
 * Created by Tong on 7/19/16.
 */
public class MinimumDepth {
    public static int mimDepth(Node root){
        int depth = 1;

        if(root == null) return 0;

        if( root.left!= null && root.right!=null)
            depth = Math.min(mimDepth(root.left), mimDepth(root.right)) + 1;

        depth = Math.max(mimDepth(root.left), mimDepth(root.right)) + 1;
        return depth;
    }


}
