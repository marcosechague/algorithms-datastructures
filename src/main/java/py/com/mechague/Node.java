package py.com.mechague;

/**
 * @author Marcos Echague
 * @since 21/03/2019
 */

class Node {
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
