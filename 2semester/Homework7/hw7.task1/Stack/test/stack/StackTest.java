/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

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
    public void testAddToEmptyStack() throws EmptyStack {
        Stack <Integer> stack = new Stack<Integer>();
        stack.push(1);
        int result = stack.top();
        assertEquals(1, result);
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
    
    @Test
    public void testTopOneEl() throws EmptyStack {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.top());
    }
    
    @Test
    public void testTopOfEmptyStack() throws EmptyStack {
        Stack stack = new Stack();
        boolean throwed = false;
        try {
            stack.top();
        } catch (EmptyStack emptyStack) {
            throwed = true;
        }
        assertEquals(true, throwed);
    }
    
    @Test
    public void testAddToStack() throws EmptyStack {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        assertEquals(1, stack.top());
    }
    
    @Test
    public void testPop() throws EmptyStack {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.pop());
    }
    
    @Test
    public void testPopOfEmtyStack() throws EmptyStack {
        Stack stack = new Stack();
        boolean throwed = false;
        try {
            stack.pop();
        } catch (EmptyStack emptyStack) {
            throwed = true;
        }
        assertEquals(true, throwed);
    }
}
