package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.BinaryTree;

/**
 * @author Marcos Echague
 * @since 12/04/2019
 */

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void setup() {
        binaryTree = new BinaryTree();
    }

    @Test
    public void addAndFind(){
        //for the root
        binaryTree.add(1, "UNO");
        Assert.assertEquals("UNO", binaryTree.find(1));
        binaryTree.add(2, "DOS");
        Assert.assertEquals("DOS", binaryTree.find(2));
        binaryTree.add(3, "TRES");
        Assert.assertEquals("TRES", binaryTree.find(3));
        binaryTree.add(4, "CUATRO");
        Assert.assertEquals("CUATRO", binaryTree.find(4));
        binaryTree.add(5, "CINCO");
        Assert.assertEquals("CINCO", binaryTree.find(5));
    }
}
