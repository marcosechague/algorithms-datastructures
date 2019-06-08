package py.com.mechague.nodes;

/**
 * @author Marcos Echague
 * @since 21/03/2019
 */

public class BinaryNode {

    public BinaryNode nextLeft;
    public BinaryNode nextRight;
    public int key;
    public String value;

    public BinaryNode() {
        super();
    }

    public BinaryNode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BinaryNode{" + "key=" + key + ", value='" + value + '\'' + '}';
    }
}
