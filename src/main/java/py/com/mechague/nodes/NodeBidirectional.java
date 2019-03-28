package py.com.mechague.nodes;

/**
 * @author Marcos Echague
 * @since 21/03/2019
 */

public class NodeBidirectional {

    public NodeBidirectional next;
    public int data;
    public NodeBidirectional previos;

    public NodeBidirectional() {
    }

    public NodeBidirectional(int data) {
        this.data = data;
    }
}
