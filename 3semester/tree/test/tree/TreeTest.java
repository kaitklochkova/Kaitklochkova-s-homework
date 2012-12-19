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
public class TreeTest {
    
    public TreeTest() {
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
     * Test of isEmpty method, of class BinarySearchTree.
     */
    @Test
    public void testIsEmpty() {
        Tree tree = new Tree();
        assertTrue(tree.isEmpty());
        tree.add(1);
        assertFalse(tree.isEmpty());
    }

    /**
     * Test of add method, of class BinarySearchTree.
     */
    @Test
    public void testAdd() {
        Tree tree = new Tree();
        assertTrue(tree.isEmpty());
        tree.add(1);
        assertFalse(tree.isEmpty());
    }

    /**
     * Test of search method, of class BinarySearchTree.
     */
    @Test
    public void testSearch() {
        Tree tree = new Tree();
        assertFalse(tree.search(1));
        tree.add(1);
        tree.add(2);
        assertTrue(tree.search(2));
    }
    
}
