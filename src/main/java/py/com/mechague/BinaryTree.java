package py.com.mechague;

import py.com.mechague.exceptions.BinaryTreeEmptyException;
import py.com.mechague.exceptions.NoDataFoundOnBinaryTreeEmptyException;
import py.com.mechague.nodes.BinaryNode;

/**
 * @author Marcos Echague
 * @since 03/04/2019
 */

public class BinaryTree {

    private BinaryNode root;

    public void add(int key, String value){

        if(root==null){
            BinaryNode newNode = new BinaryNode(key, value);
            root = newNode;
            return;
        }
        add(root, key, value);
    }

    private void add(BinaryNode node , int key, String value){

            //We not add when the key already exists
            if(node.key==key) return ;

            if(node.key<key){
                if (node.nextRigth == null) {
                    node.nextRigth = new BinaryNode(key, value);
                } else {
                    add(node.nextRigth, key, value);
                }
            }else{
                if (node.nextLeft == null) {
                    node.nextLeft = new BinaryNode(key, value);
                } else {
                    add(node.nextLeft, key, value);
                }
            }

    }

    public String find(int key) {
        if (root == null) {
            throw new BinaryTreeEmptyException();
        }
        String value = find(root, key);
        return value;
    }

    private String find(BinaryNode node, int key){

        if(node==null){
            throw new NoDataFoundOnBinaryTreeEmptyException("The key "+key+" is not on the Binary tree");
        }
        String result;
        if(key == node.key){
            return node.value;
        }
        if(key>node.key){
           result = find(node.nextRigth, key);
        }else{
           result = find(node.nextLeft, key);
        }
        return result;
    }

}
