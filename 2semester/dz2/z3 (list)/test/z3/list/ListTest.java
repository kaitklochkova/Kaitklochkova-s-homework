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
    public void testGetIterator() {
        System.out.println("getIterator");
        List instance = new List();
        ListIterator expResult = null;
        ListIterator result = instance.getIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
