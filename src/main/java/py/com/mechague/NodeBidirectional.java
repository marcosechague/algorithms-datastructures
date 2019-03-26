package py.com.mechague;

/**
 * @author Marcos Echague
 * @since 21/03/2019
 */

class NodeBidirectional {

    protected NodeBidirectional next;
    protected int data;
    protected NodeBidirectional previos;

    public NodeBidirectional() {
    }

    public NodeBidirectional(int data) {
        this.data = data;
    }
}
