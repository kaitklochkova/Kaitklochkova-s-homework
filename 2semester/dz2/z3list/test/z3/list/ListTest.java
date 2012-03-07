/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z3.list;

import org.junit.*;
import static org.junit.Assert.*;
import z3.list.List.ListIterator;

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
    public void testAddToEmptyList() {
        List list = new List();
        list.addToHead(1);
        List.ListIterator iterator = list.getIterator();
        assertEquals(1, iterator.getValue());
    }

    /**
     * Test of add method, of class List.
     */
    
    @Test
    public void testAdd() {
        List list = new List();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        List.ListIterator iterator = list.getIterator();
        iterator.next();
        assertEquals(2, iterator.getValue());
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
}
