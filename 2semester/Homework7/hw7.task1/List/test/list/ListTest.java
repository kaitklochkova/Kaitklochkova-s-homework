/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import list.List.ListIterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class ListTest {
    
    public ListTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
        List <Integer> list = new List<Integer>();
        list.addToHead(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of add method, of class List.
     */
    @Test
    public void testAddToHead() {
        List <Integer> list = new List<Integer>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        List.ListIterator iterator = list.getIterator();
        iterator.next();
        assertEquals(2, iterator.getValue());
    }

    /**
     * Test of getIterator method, of class List.
     */
    @Test
    public void testAddToTailToEmptyList() {
        List <Integer> list = new List<Integer>();
        list.addToTail(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of getIterator method, of class List.
     */
    @Test
    public void testAddToTail() {
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
    public void testGetIteratorOfEmptyList() {
        List <Integer> list = new List<Integer>();
        assertFalse(list.getIterator().isGood());
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListOfEmptyList() {
        List <Integer> list = new List<Integer>();
        assertFalse(list.isElementInList(4));
    }

    /**
     * Test of GetIterator method, of class List.
     */
    @Test
    public void testisElementInListFirstEl() {
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
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
        List <Integer> list = new List<Integer>();
        assertEquals(0, list.getCount());
    }
}
