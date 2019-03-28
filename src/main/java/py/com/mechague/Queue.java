package py.com.mechague;

import py.com.mechague.exceptions.QueueEmptyException;
import py.com.mechague.nodes.Node;

/**
 * @author Marcos Echague
 * @since 27/03/2019
 */

//FIFO (First in first out)
//int data for now
public class Queue {

    private Node head;
    private Node tail;

    public void add(int data){ //O(1)
        Node node = new Node(data);
        if(head==null){
            head=node;
            tail=node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    public int peek(){ //O(1)
        if(head==null){
            throw new QueueEmptyException();
        }
        return head.data;
    }

    public int remove(){ //O(1)
        if(head==null){
            throw new QueueEmptyException();
        }
        int returnData = head.data;
        head = head.next;
        return returnData;
    }

    public boolean isEmpty(){
        return head==null;
    }

}
