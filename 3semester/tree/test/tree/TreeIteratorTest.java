/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class TreeIteratorTest {
    
    public TreeIteratorTest() {
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
     * Test of hasNext method, of class TreeIterator.
     */
    @Test
    public void testHasNextFalse() {
        Tree tree = new Tree();
        TreeIterator iterator = tree.iterator();
        assertFalse(iterator.hasNext());
    }

    
    /**
     * Test of hasNext method, of class TreeIterator.
     */
    @Test
    public void testHasNextTrue() {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(4);
        TreeIterator iterator = tree.iterator();
        assertTrue(iterator.hasNext());
    }
    
    /**
     * Test of next method, of class TreeIterator.
     */
    @Test
    public void testNext() {
        Tree tree = new Tree();
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(4);
        TreeIterator iterator = tree.iterator();
        assertEquals(3, iterator.next(), 0.0);
        assertEquals(4, iterator.next(), 0.0);
        assertEquals(1, iterator.next(), 0.0);
        assertEquals(2, iterator.next(), 0.0);
    }
}
