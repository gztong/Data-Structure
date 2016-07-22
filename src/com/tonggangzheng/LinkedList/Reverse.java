package com.tonggangzheng.LinkedList;

/**
 * Created by Tong on 7/19/16.
 */
public class Reverse {

    public static Node reverse(Node root, int m, int n){
        if( m<1 || n < m) return null;

        int i = 1;
        Node start = root;
        while( i < m-1){
            start = start.next;
            i++;
        }
        Node before = start;
        start = start.next; i++;

        Node temp = start;
        while( i < n ){
            temp = temp.next;
            i++;
        }
        Node end = temp.next;
        temp.next = null;
        Node newHead = reverse(start);

        before.next = newHead;
        start.next = end;

        return root;
    }

    public static Node reverse(Node root){
        Node current = root;
        Node reversePart = null;

        while(current != null){
            Node next = current.next;
            current.next = reversePart;
            reversePart = current;
            current = next;
        }

        return reversePart;
    }

    public static void test(){
        Node list = new Node(1);
        Node current = list;
        for(int i=2; i<= 5; i++){
            current.next = new Node(i);
            current = current.next;
        }

        System.out.println(list.toString());

       Node newList =  reverse(list, 2, 6);
        System.out.println(newList);

    }


}
