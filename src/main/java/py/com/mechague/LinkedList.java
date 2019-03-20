package py.com.mechague;

import py.com.mechague.exceptions.LinkedListEmptyException;

/**
 * @author Marcos Echague
 * @since 20/03/2019
 */

public class LinkedList {

    Node head;

    public void addFront(int data) { //Killer feature O(1) Constant time

        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addBack(int data){ //O (n)
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null) { //O(n)
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public int getFirst(){
        if(head==null){
            throw new LinkedListEmptyException();
        }
        return head.data;
    }

    public int getLast(){
        if(head==null){
            throw new LinkedListEmptyException();
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }

        return lastNode.data;
    }

    private class Node {
        Node next;
        int data;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

}
