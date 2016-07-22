package com.tonggangzheng.Trees;

/**
 * Created by Tong on 7/2/16.
 */
public class Node {

    public int data;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int value){
        data = value;
    }

    public void insert(int value){
        insert(this, value);
    }

    private void insert(Node root, int value){

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

    public String toString(){
        StringBuilder s = new StringBuilder();
        String s1 ="", s2 = "";
        if (right != null) {
            s1 =  printTree(right, true, "");
        }

        System.out.println(data);

        if (left != null) {
            s2 = printTree(left, false, "");
        }

        return s1 + data + s2;
    }

    // use string and not stringbuffer on purpose as we need to change the indent at each recursion
    private String printTree(Node root, boolean isRight, String indent) {
        StringBuilder s = new StringBuilder();

        if (root.right != null) {
            return printTree(root.right, true, indent + (isRight ? "        " : " |      "));
        }
        s.append(indent);
        System.out.print(indent);
        if (isRight) {
            s.append(" /");
            System.out.print(" /");
        } else {
            s.append(" \\");
            System.out.print(" \\");
        }
        s.append("-----");
        s.append(root.data+"\n");

        System.out.print("----- ");
        System.out.println(root.data);

        if (root.left != null) {
            return printTree(root.left, false, indent + (isRight ? " |      " : "        "));
        }
        return s.toString();
    }
}
