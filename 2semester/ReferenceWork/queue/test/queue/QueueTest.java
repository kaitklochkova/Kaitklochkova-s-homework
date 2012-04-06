/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class QueueTest {

    public QueueTest() {
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
     * Test of count method, of class Queue.
     */
    @Test
    public void testCount() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(4, 1);
        assertEquals(1, queue.getCount());
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() throws EmptyQueue {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(4, 3);
        queue.enqueue(5, 1);
        int result = queue.dequeue();
        assertEquals(4, result);
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() throws EmptyQueue {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(4, 1);
        queue.enqueue(5, 3);
        queue.enqueue(1, 2);
        int result = queue.dequeue();
        assertEquals(5, result);
    }
}
