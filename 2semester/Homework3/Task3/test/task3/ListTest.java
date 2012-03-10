/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class ListTest {
    
    public ListTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of getIterator method, of class List.
     */
    @Test
    public void testAddToHeadToEmptyList() {
        List list = new List();
        list.addToHead(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAddToHead() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        List.ListIterator iterator = list.getIterator();
        iterator.next();
        assertEquals(2, iterator.getValue());
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAdd() {
        List list = new List();
        list.add(3);
        list.add(2);
        list.add(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAddWithIterator() {
        List list = new List();
        list.add(3);
        list.add(2);
        list.add(1);
        List.ListIterator iterator = list.getIterator();
        iterator.next();
        assertEquals(2, iterator.getValue());
    }

    /**
     * Test of getIterator method, of class List.
     */
    @Test
    public void testAddToTailToEmptyList() {
        List list = new List();
        list.addToTail(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of getIterator method, of class List.
     */
    @Test
    public void testAddToTail() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToTail(i);
        }
        List.ListIterator iterator = list.getIterator();
        assertEquals(0, iterator.getValue());
    }

    /**
     * Test of getIterator method, of class List.
     */
    @Test
    public void testAddToTailAndCheckSecondEl() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToTail(i);
        }
        List.ListIterator iterator = list.getIterator();
        iterator.next();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of clear method, of class List.
     */
    @Test
    public void testClear() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.clear();
        List.ListIterator iterator = list.getIterator();
        assertFalse(iterator.isGood());
    }

    /**
     * Test of delEl method, of class List.
     */
    @Test
    public void testDelLastEl() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.delEl(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(3, iterator.getValue());
        iterator.next();
        assertEquals(2, iterator.getValue());
    }

    /**
     * Test of delEl method, of class List.
     */
    @Test
    public void testDelFirstAndLastEl() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.delEl(1);
        list.delEl(3);
        List.ListIterator iterator = list.getIterator();
        assertEquals(2, iterator.getValue());
    }

    /**
     * Test of delEl method, of class List.
     */
    @Test
    public void testDelTwoFirstEl() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.addToHead(3);
        list.delEl(3);
        List.ListIterator iterator = list.getIterator();
        assertEquals(2, iterator.getValue());
        iterator.next();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of delEl method, of class List.
     */
    @Test
    public void testDelTwoMidleEl() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(2);
        list.addToHead(3);
        list.delEl(2);
        List.ListIterator iterator = list.getIterator();
        assertEquals(3, iterator.getValue());
        iterator.next();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testGetIterator() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        assertEquals(2, list.getIterator().getValue());
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testGetIteratorOfEmptyList() {
        List list = new List();
        assertFalse(list.getIterator().isGood());
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListOfEmptyList() {
        List list = new List();
        assertFalse(list.isElementInList(4));
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListFirstEl() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertTrue(list.isElementInList(4));
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListMiddleEl() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertTrue(list.isElementInList(2));
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListLastEl() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertTrue(list.isElementInList(0));
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListNotListed() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertFalse(list.isElementInList(5));
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testGetCount() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertEquals(5, list.getCount());
    }
    
    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testGetCountEmptyList() {
        List list = new List();
        assertEquals(0, list.getCount());
    }
}
