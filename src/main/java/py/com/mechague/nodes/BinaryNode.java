package py.com.mechague.nodes;

/**
 * @author Marcos Echague
 * @since 21/03/2019
 */

public class BinaryNode {

    public BinaryNode nextLeft;
    public BinaryNode nextRigth;
    public int key;
    public String value;

    public BinaryNode() {
    }

    public BinaryNode(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
