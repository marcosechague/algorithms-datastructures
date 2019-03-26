package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.DoubleLinkedList;

/**
 * @author Marcos Echague
 * @since 25/03/2019
 */

public class DoubleLinkedListTest {

    private DoubleLinkedList linkedList;

    @Before
    public void setUp(){
        linkedList = new DoubleLinkedList();
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

        //deleteValue head
        linkedList.deleteValue(1);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(2, linkedList.getFirst());

        //deleteValue in middle
        linkedList.addFront(1);
        linkedList.deleteValue(2);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(1, linkedList.getFirst());

        //deleteValue in tail
        linkedList.addBack(4);
        System.out.println("Last : "+linkedList.getLast());
        linkedList.deleteValue(4);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(3, linkedList.getLast());

    }
}
