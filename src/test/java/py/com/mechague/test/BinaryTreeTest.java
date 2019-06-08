package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.BinaryTree;
import py.com.mechague.exceptions.NoDataFoundOnBinaryTreeException;
import py.com.mechague.nodes.BinaryNode;

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

    @Test(expected = NoDataFoundOnBinaryTreeException.class)
    public void addAndDeleteWhitoutChild(){
        //We inicializate it because with junit 5 we the @Before annotations doesn't work.
        binaryTree.add(1, "UNO");
        binaryTree.add(2, "DOS");
        binaryTree.add(3, "TRES");
        binaryTree.add(4, "CUATRO");
        binaryTree.add(5, "CINCO");
        //The 5 exists
        Assert.assertEquals("CINCO", binaryTree.find(5));
        //Delete the 5
        binaryTree.delete(5);
        //Check if exists
        binaryTree.find(5);
    }

    @Test(expected = NoDataFoundOnBinaryTreeException.class)
    public void addAndDeleteWhitOneChild(){
        System.out.println("Starting test for Delete a node with one child");
        binaryTree.add(10, "DIEZ");
        binaryTree.add(15, "QUINCE");
        binaryTree.add(14, "CATORCE");
        binaryTree.add(17, "DIECISIETE");
        binaryTree.add(19, "DIECINUEVE");
        binaryTree.add(5, "CINCO");
        binaryTree.add(1, "UNO");
        binaryTree.add(2, "DOS");
        binaryTree.add(4, "CUATRO");
        binaryTree.add(3, "TRES");
        //The 17 exists
        Assert.assertEquals("DIECISIETE", binaryTree.find(17));
        //Delete the 17, it have one Child (19)
        System.out.println("Deleting the key 17");
        binaryTree.delete(17);
        //Check if the 19 exists and didn't was deleted
        System.out.println("The 19 exists?");
        Assert.assertEquals("DIECINUEVE",binaryTree.find(19));
        System.out.println("Yes, exists!");
        //Check if exists
        binaryTree.find(17);
    }

    @Test(expected = NoDataFoundOnBinaryTreeException.class)
    public void addAndDeleteWhitTwoChilds(){
        System.out.println("Starting test for Delete a node with two child");
        binaryTree.add(10, "DIEZ");
        binaryTree.add(15, "QUINCE");
        binaryTree.add(14, "CATORCE");
        binaryTree.add(17, "DIECISIETE");
        binaryTree.add(19, "DIECINUEVE");
        binaryTree.add(16, "DIECISEIS");
        binaryTree.add(5, "CINCO");
        binaryTree.add(3, "TRES");
        //The 17 exists
        Assert.assertEquals("DIECISIETE", binaryTree.find(17));
        //Delete the 17, it have two Child (19 - 16)
        System.out.println("Deleting the key 17");
        binaryTree.delete(17);
        //Check if the 19 exists and didn't was deleted
        System.out.println("The 19 exists?");
        Assert.assertEquals("DIECINUEVE",binaryTree.find(19));
        System.out.println("Yes, exists!");
        System.out.println("The 16 existsd,masd,asdasjhdjk?");
        Assert.assertEquals("DIECISEIS",binaryTree.find(16));
        System.out.println("Yes, exists!");
        //Check if exists
        binaryTree.find(17);
    }

    /*public static void main(String... args){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(1, "UNO");
        binaryTree.add(2, "DOS");
        binaryTree.add(3, "TRES");
        binaryTree.add(4, "CUATRO");
        binaryTree.add(5, "CINCO");
        //The 5 exists
        Assert.assertEquals("CINCO", binaryTree.find(5));
        //Delete the 5
        binaryTree.delete(5);
        //Check if exists
        binaryTree.find(5);
    }*/
}
