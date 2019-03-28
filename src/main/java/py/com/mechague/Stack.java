package py.com.mechague;

import py.com.mechague.exceptions.StackEmptyException;
import py.com.mechague.nodes.Node;

/**
 * @author Marcos Echague
 * @since 27/03/2019
 */

//LIFO (Last in first out)
//int data for now
public class Stack {

    private Node head ;

    public void push(int data){ //O(1)
        Node node = new Node(data);
        if(head==null){
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public int peek(){ //O(1)
        if (head==null){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public int pop(){ //O(1)
        if (head==null){
            throw new StackEmptyException();
        }
        int returnData = head.data;
        head = head.next;
        return  returnData;
    }

    public boolean isEmpty(){ //O(1)
        return head == null;
    }
}
