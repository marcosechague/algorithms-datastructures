package py.com.mechague.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import py.com.mechague.HashTable;

/**
 * @author Marcos Echague
 * @since 03/04/2019
 */

public class HashTableTest {

    private HashTable hashTable;

    @Before
    public void setup(){
        hashTable = new HashTable();
    }

    @Test
    public void setAndGet(){
        hashTable.put("color", "Red");
        hashTable.put("meal", "Pizza");
        hashTable.put("drink","Beer");

        Assert.assertEquals("Red",hashTable.getValue("color"));
        Assert.assertEquals("Pizza",hashTable.getValue("meal"));
        Assert.assertEquals("Beer",hashTable.getValue("drink"));
    }

    @Test
    public void collision(){
        hashTable.put("name", "John");
        hashTable.put("street", "Piraveve 2448");

        Assert.assertEquals("John",hashTable.getValue("name"));
        Assert.assertEquals("Piraveve 2448",hashTable.getValue("street"));
    }

}


