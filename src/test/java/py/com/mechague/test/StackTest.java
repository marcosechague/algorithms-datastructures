package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.Stack;

/**
 * @author Marcos Echague
 * @since 27/03/2019
 */

public class StackTest {

    private Stack stack ;

    @Before
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void push(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3,stack.peek());
    }

    @Test
    public void pop(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3,stack.pop());
        Assert.assertEquals(2,stack.peek());
        Assert.assertEquals(2,stack.pop());
    }
}
