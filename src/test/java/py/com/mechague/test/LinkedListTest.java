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

    private LinkedList linkedList;

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

    @Test
    public void size(){
        linkedList.addBack(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        Assert.assertEquals(3, linkedList.size());
    }

    @Test
    public void delete(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        //delete head
        linkedList.delete(1);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(2, linkedList.getFirst());

        //delete in middle
        linkedList.addFront(1);
        linkedList.delete(2);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(1, linkedList.getFirst());

        //delete in tail
        linkedList.addBack(4);
        linkedList.delete(4);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(3, linkedList.getLast());

    }
}
