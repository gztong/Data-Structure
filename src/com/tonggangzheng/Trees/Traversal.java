package com.tonggangzheng.Trees;
import java.util.*;
/**
 * Created by Tong on 7/25/16.
 */
public class Traversal {
    static Node root  = Tree.getSampleTree();

    public static void traversalPostorder(Node root){
        new Tree(root).printTree(root);

        Stack<Node> s = new Stack<Node>();
        Node n = root;

        while(n!=null){
            s.push(n);
            n=n.right;
        }

        while(!s.isEmpty()) {
            n = s.pop();
            System.out.print(n.data + " ");
            n = n.left;

            while (n != null) {
                s.push(n);
                n = n.right;
            }
        }
    }

    public static void traversalPreoder(Node root){
        new Tree(root).printTree(root);

        Stack<Node> s = new Stack<Node>();
        Node n = root;

        s.push(n);

        while(!s.isEmpty()){
            n = s.pop();
            System.out.print( n.data + " ");

            if(n.right!=null){
                s.push(n.right);

            }
            if(n.left!=null){
                s.push(n.left);

            }
        }

    }

    public static void test(){
        traversalPreoder(root);
    }
}
