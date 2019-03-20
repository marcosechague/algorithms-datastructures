package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.LinkedList;

/**
 * @author Marcos Echague
 * @since 20/03/2019
 */

public class LinkedListTest {

    LinkedList linkedList;

    @Before
    public void setUp(){
        linkedList = new LinkedList();
    }

    @Test
    public void addFront(){
        linkedList.addFront(1);
        linkedList.addFront(2);
        Assert.assertEquals(2, linkedList.getFirst());
    }

    @Test
    public void addLast(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        Assert.assertEquals(2, linkedList.getLast());
    }
}