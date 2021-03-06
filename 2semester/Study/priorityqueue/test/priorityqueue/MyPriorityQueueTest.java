/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lich
 */
public class MyPriorityQueueTest {

    public MyPriorityQueueTest() {
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
     * Test of enqueue method, of class MyPriorityQueue.
     */
    @Test
    public void testEnqueueInteger() throws Exception {
        MyPriorityQueue<Integer> instance = new MyPriorityQueue<Integer>();
        instance.enqueue(100, 1);
        instance.enqueue(100, 0);
    }
    
    /**
     * Test of enqueue method, of class MyPriorityQueue.
     */
    @Test
    public void testDequeueInteger() throws Exception {
        MyPriorityQueue<Integer> instance = new MyPriorityQueue<Integer>();
        instance.enqueue(90, 1);
        instance.enqueue(100, 0);
        int ret = instance.dequeue();
        assertEquals("first elem", 90, ret);
        ret = instance.dequeue();
        assertEquals("second elem", 100, ret);
    }

    /**
     * Test of enqueue method, of class MyPriorityQueue.
     */
    @Test
    public void testEnqueueString() throws Exception {
        MyPriorityQueue<String> instance = new MyPriorityQueue<String>();
        instance.enqueue("str1", 1);
        instance.enqueue("str2", 2);
    }
    
    /**
     * Test of enqueue method, of class MyPriorityQueue.
     */
    @Test
    public void testDequeueString() throws Exception {
        MyPriorityQueue<String> instance = new MyPriorityQueue<String>();
        instance.enqueue("str1", 2);
        instance.enqueue("str2", 1);
        String ret = instance.dequeue();
        assertEquals("first elem", "str1", ret);
        ret = instance.dequeue();
        assertEquals("second elem", "str2", ret);
    }

    /**
     * Test of Exception method, of class MyPriorityQueue.
     */
    @Test(expected = EmptyQueueException.class)
    public void testQueueException() throws Exception {
        MyPriorityQueue<String> instance = new MyPriorityQueue<String>();
        instance.dequeue();
    }
}
