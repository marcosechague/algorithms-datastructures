package py.com.mechague;

import py.com.mechague.exceptions.DoubleLinkedListEmptyException;
import py.com.mechague.nodes.NodeBidirectional;

/**
 * @author Marcos Echague
 * @since 25/03/2019
 */
//For this Linked list, we use int data
public class DoubleLinkedList {

    private NodeBidirectional head;
    private NodeBidirectional tail;

    public void addFront(int data) { //Killer feature O(1) Constant time

        NodeBidirectional newNode = new NodeBidirectional(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        newNode.next.previos  = head;
    }


    public void addBack(int data){ //O(1) Constant time also
        NodeBidirectional newNode = new NodeBidirectional(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previos = tail;
        tail = newNode;
    }

    public int getFirst(){ //O(1)
        if(head==null){
            throw new DoubleLinkedListEmptyException();
        }
        return head.data;
    }

    public int getLast(){ // O(1)
        if(head==null){
            throw new DoubleLinkedListEmptyException();
        }
        return tail.data;
    }

    public void deleteValue(int data){ // O(n)

        if (head==null) return;

        if(head.data == data){
            head=head.next;
            head.previos = null;
            return;
        }

        NodeBidirectional currentNode = head;
        while(currentNode.next!=null){
            if(currentNode.next.data == data){
                if ( tail == currentNode.next) {
                    tail = currentNode;
                }
                currentNode.next = currentNode.next.next;

                if(currentNode.next!=null){
                    currentNode.next.previos = currentNode;
                }
                return;
            }

            currentNode = currentNode.next;
        }
    }

    //we also can start from the tail
    public int size(){ //O(n)

        if(head==null) return 0;

        int size = 1;
        NodeBidirectional currentNode = head;

        while(currentNode.next!=null){ //O (n)
            size++;
            currentNode = currentNode.next;
        }

        return size;
    }

    public void clear(){
        head = null;
        tail = null;
    }

}
