/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.NoSuchElementException;
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
     * Test of addToHead method, of class List.
     */
    @Test
    public void testAddToHeadToIntList() {
        List <Integer> list = new List<Integer>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        int result = list.getValueOfHead();
        assertEquals(3, result);
    }
    
     /**
     * Test of addToHead method, of class List.
     */
    @Test
    public void testAddToHeadToStrList() {
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        String result = list.getValueOfHead();
        assertEquals("World", result);
    }
    
    /**
     * Test of delEl method, of class List.
     */
    @Test
    public void testDelIntEl() throws NotInList{
        List <Integer> list = new List<Integer>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.delEl(2);
        list.delEl(3);
        int result = list.getValueOfHead();
        assertEquals(1, result);
    }
  
    /**
     * Test of delEl method, of class List.
     */
    @Test
    public void testDelStrEl() throws NotInList{
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        list.delEl("World");
        list.delEl("Hello");
        String result = list.getValueOfHead();
        assertEquals("Yes!", result);
    }
       
    /**
     * Test of delFromBegin method, of class List.
     */
    @Test
    public void testDelFromBeginIntEl() throws NotInList{
        List <Integer> list = new List<Integer>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.delFromBegin();
        int result = list.getValueOfHead();
        assertEquals(2, result);
    }
    
    /**
     * Test of delFromBegin method, of class List.
     */
    @Test
    public void testDelFromBeginStrEl() throws NotInList{
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        list.delFromBegin();
        String result = list.getValueOfHead();
        assertEquals("World", result);
    }
  
    /**
     * Test of isElementInList method, of class List.
     */
    @Test
    public void testisElementInListOfEmptyList() {
        List <Integer> list = new List<Integer>();
        assertFalse(list.isElementInList(4));
    }

    /**
     * Test of isElementInList method, of class List.
     */
    @Test
    public void testisElementInIntList() {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertTrue(list.isElementInList(2));
    }

    /**
     * Test of isElementInList method, of class List.
     */
    @Test
    public void testisElementInStrList() {
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        assertTrue(list.isElementInList("World"));
    }
    
    /**
     * Test of isElementInList method, of class List.
     */
    @Test
    public void testisElementInIntListNotListed() {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertFalse(list.isElementInList(5));
    }
    
    /**
     * Test of isElementInList method, of class List.
     */
    @Test
    public void testisElementInStrListNotListed() {
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        assertFalse(list.isElementInList("Yes"));
    }

    /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetCountIntList() {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertEquals(5, list.getCount());
    }
    
        /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetCountStrList() {
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        assertEquals(3, list.getCount());
    }
    
    /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetCountEmptyList() {
        List <Integer> list = new List<Integer>();
        assertEquals(0, list.getCount());
    }
    
    /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetCountIntListAfterDel() throws NotInList {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        list.delEl(2);
        assertEquals(4, list.getCount());
    }
    
    /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetCountStrListAfterDel() throws NotInList {
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        list.delEl("World");
        assertEquals(2, list.getCount());
    }
    
    /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetValueOfHeadIntList() {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        int result = list.getValueOfHead();
        assertEquals(4, result);
    }
    
        /**
     * Test of GetCount method, of class List.
     */
    @Test
    public void testGetValueOfHeadStrList() {
        List <String> list = new List<String>();
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("Yes!");
        String result = list.getValueOfHead();
        assertEquals("Yes!", result);
    }
  
    /**
     * Test of delEl method, of class List, when it throws exception NotInList
     */
    @Test(expected=NotInList.class)
    public void testDelIntElWithExpection() throws NotInList{
        List <Integer> list = new List<Integer>();
        list.delEl(3);
    }
    
    /**
     * Test of delEl method, of class List, when it throws exception NotInList
     */
    @Test(expected=NotInList.class)
    public void testDelStrElWithExpection() throws NotInList{
        List <String> list = new List<String>();
        list.delEl("Yes");
    }
    
    /**
     * Test of delEl method, of class List, when it throws exception NotInList
     */
    @Test(expected=NotInList.class)
    public void testDelFromBeginIWithExpection() throws NotInList{
        List <Integer> list = new List<Integer>();
        list.delFromBegin();
    }
    
    /**
     * Test of delEl method, of class List, when it throws exception NotInList
     */
    @Test(expected=NotInList.class)
    public void testDelFromBeginStrElWithExpection() throws NotInList{
        List <String> list = new List<String>();
        list.delFromBegin();
    }
    
    /**
     * Test of next method, of class ListIterator.
     */
    @Test
    public void testNext() {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        int result = list.iterator().next();
        assertEquals(3, result);
    }
    
    /**
     * Test of next method, of class ListIterator.
     */
    @Test(expected = NoSuchElementException.class)
    public void testNextOfEmptyList() {
        List <Integer> list = new List<Integer>();
        list.iterator().next();
    }
    
    /**
     * Test of HasNext method, of class ListIterator.
     */
    @Test
    public void testHasNext() {
        List <Integer> list = new List<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addToHead(i);
        }
        assertTrue(list.iterator().hasNext());
    }
    
    /**
     * Test of next method, of class ListIterator.
     */
    @Test
    public void testHasNextOfEmptyList() {
        List <Integer> list = new List<Integer>();
        assertFalse(list.iterator().hasNext());
    }

    
    /**
     * Test of foreach
     *//*
    @Test
    public void testForeach() throws NotInList {
        List <Integer> list = new List<Integer>();
        list.addToHead(3);
        list.addToHead(4);
        list.addToHead(5);
        for (Integer i : list) {
            assertEquals(list.getValueOfHead(), i, 0.0);
            list.delFromBegin();
        }
    }*/
}
