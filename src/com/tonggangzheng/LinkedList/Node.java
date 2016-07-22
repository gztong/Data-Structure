package com.tonggangzheng.LinkedList;

/**
 * Created by Tong on 7/19/16.
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }


    public String toString(){
        StringBuffer s = new StringBuffer();

        s.append(value);
        Node current = next;
        while(current != null){
            s.append(" -> ").append(current.value);
            current= current.next;
        }

        return s.toString();
    }
}
