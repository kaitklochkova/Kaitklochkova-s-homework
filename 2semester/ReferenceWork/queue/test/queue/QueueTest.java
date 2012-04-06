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

    @Test
    public void testEnqueue() {
        Queue<Integer> queue = new Queue <Integer>();
        queue.enqueue(4, 1);
        assertEquals(1, queue.getCount());
    }
}
