package com.tonggangzheng.Trees;

import java.io.*;

/**
 * Created by Tong on 7/2/16.
 */
public class Tree {

    public Node root;

    public Tree(int value){
        this.root = new Node(value);
    }

    public Tree(Node root){
        this.root = root;
    }

    public void insert(int value) {
        insert(root, value);
    }

    public void insert(Node root, int value){

        if(value < root.data){
            if(root.left == null){
                root.left = new Node(value);
              //  System.out.println("Insert " + value + "to Node " + root.data );
            }else{
                insert(root.left, value);
            }
        }else{
            if(root.right == null){
                root.right = new Node(value);
             //   System.out.println("Insert " + value + "to Node " + root.data );
            }else{
                insert(root.right, value);
            }
        }
    }


    public void printTree(Node root) {
        if (root.right != null) {
            printTree(root.right, true, "");
        }

        System.out.println(root.data);

        if (root.left != null) {
            printTree(root.left, false, "");
        }
    }

    // use string and not stringbuffer on purpose as we need to change the indent at each recursion
    private void printTree(Node root, boolean isRight, String indent) {
        if (root.right != null) {
            printTree(root.right, true, indent + (isRight ? "        " : " |      "));
        }
        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("----- ");
        System.out.println(root.data);
        
        if (root.left != null) {
            printTree(root.left, false, indent + (isRight ? " |      " : "        "));
        }
    }

    public static Node getSampleTree(){
        Node root = new Node(5);

        root.insert(1);
        root.insert(9);
        root.insert(3);
        root.insert(7);
        root.insert(2);


        return root;
    }
}
