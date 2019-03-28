package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.Queue;

/**
 * @author Marcos Echague
 * @since 27/03/2019
 */

public class QueueTest {

    private Queue queue;

    @Before
    public void setup(){
        queue = new Queue();
    }

    @Test
    public void add(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        Assert.assertEquals(1, queue.peek());
    }

    @Test
    public void remove(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        Assert.assertEquals(1, queue.remove());
        Assert.assertEquals(2, queue.peek());
        Assert.assertEquals(2, queue.remove());
    }
}
