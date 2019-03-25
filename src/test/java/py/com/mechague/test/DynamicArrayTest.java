package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.DynamicArray;

/**
 * @author Marcos Echague
 * @since 19/03/2019
 */

public class DynamicArrayTest {

    private DynamicArray array;

    @Before
    public void setUp() {
        array = new DynamicArray(2);
    }

    @Test
    public void getAndSet() {
        array.set(0,"a");
        Assert.assertEquals("a", array.get(0));
    }

    @Test
    public void addAndInsert() {
        array.add("a");
        array.add("b");
        array.add("d");

        array.insert(2,"c");

        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("b", array.get(1));
        Assert.assertEquals("c", array.get(2));
        Assert.assertEquals("d", array.get(3));

    }

    @Test
    public void delete() {
        array.add("a");
        array.add("b");
        array.add("c");
        Assert.assertEquals(3, array.size());

        array.delete(1);
        Assert.assertEquals("c", array.get(1));
        Assert.assertEquals(2, array.size());
    }

    @Test
    public void contains(){
        array.add("a");
        array.add("b");
        array.add("c");
        Assert.assertEquals(false, array.contains("d"));
        Assert.assertEquals(true, array.contains("a"));

    }
}
