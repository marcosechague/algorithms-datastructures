package py.com.mechague;

import py.com.mechague.exceptions.BinaryTreeEmptyException;
import py.com.mechague.exceptions.BinaryTreeNodeEmptyException;
import py.com.mechague.exceptions.NoDataFoundOnBinaryTreeException;
import py.com.mechague.nodes.BinaryNode;

/**
 * @author Marcos Echague
 * @since 03/04/2019
 * The Binary Tree are Ordered and Recursive
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
                if (node.nextRight == null) {
                    node.nextRight = new BinaryNode(key, value);
                } else {
                    add(node.nextRight, key, value);
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

    public void delete(int key){
        delete(root, key);
    }

    private BinaryNode delete (BinaryNode node, int key){
        if(node ==null){
            throw new NoDataFoundOnBinaryTreeException(key);
        }else if(key<node.key) {
           node.nextLeft = delete(node.nextLeft, key);
        }else if(key>node.key) {
           node.nextRight =  delete(node.nextRight, key);
        }else {
            //Case 1 - No child, the most easy case, the node is null now
            if (node.nextLeft == null && node.nextRight == null) {
                node = null;
                //Case 2.1 - One child, in the left site, then the node now is the next on the left
            } else if (node.nextRight == null) {
                node = node.nextLeft;
                //Case 2.2 - One child, in the left site, then the node now is the next on the left
            } else if (node.nextLeft == null) {
                node = node.nextRight;
                //Case 3 - Two child, the most difficult case
            } else {
                //First we get the most lowest on the right side
                BinaryNode minNode = findMin(node);

                //Replace the node for the right min node
                node.key = minNode.key;
                node.value = minNode.value;

                //And delete the min node
                delete(node.nextRight, minNode.key);
            }
        }
        return node;
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(BinaryNode node){
        if(node!=null){
            inOrderTraversal(node.nextLeft);
            System.out.println(node.key);
            inOrderTraversal(node.nextRight);
        }
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(BinaryNode node){
        if(node!=null){
            System.out.println(node.key);
            preOrderTraversal(node.nextLeft);
            preOrderTraversal(node.nextRight);
        }
    }

    public void posOrderTraversal(){
        posOrderTraversal(root);
    }

    private void posOrderTraversal(BinaryNode node){
        if(node!=null){
            preOrderTraversal(node.nextLeft);
            preOrderTraversal(node.nextRight);
            System.out.println(node.key);
        }
    }

    private BinaryNode findMin(BinaryNode node) {
        if(node==null) {
            throw new BinaryTreeNodeEmptyException();
        }

        BinaryNode minNode ;
        if(node.nextLeft==null){
            minNode=node;
        }else{
            minNode = findMin(node.nextLeft);
        }
        return minNode;
    }

    private String find(BinaryNode node, int key){

        if(node==null){
            throw new NoDataFoundOnBinaryTreeException(key);
        }
        String result;
        if(key == node.key){
            return node.value;
        }
        if(key>node.key){
           result = find(node.nextRight, key);
        }else{
           result = find(node.nextLeft, key);
        }
        return result;
    }

}
