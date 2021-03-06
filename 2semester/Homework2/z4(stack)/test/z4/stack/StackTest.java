/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z4.stack;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class StackTest {
    
    public StackTest() {
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
    public void testIsEmptyOnEmptyStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testAddToEmptyStack() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
    
    @Test
    public void testTopOneEl() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.top());
    }
    
    @Test
    public void testTopOfEmptyStack() {
        Stack stack = new Stack();
        assertEquals(-1, stack.top());
    }
    
    @Test
    public void testAddToStack() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        assertEquals(1, stack.top());
    }
    
    @Test
    public void testPop() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.pop());
    }
    
    @Test
    public void testPopOfEmtyStack() {
        Stack stack = new Stack();
        assertEquals(-1, stack.pop());
    }
}
