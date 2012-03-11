/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class HashTableTest {
    
    public HashTableTest() {
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
     * Test of hashFun method, of class HashTable.
     */
    @Test

    /**
     * Test of addHash method, of class HashTable.
     */
    @Test
    public void testAddHash() {
        System.out.println("addHash");
        String str = "";
        HashTable instance = new HashTable();
        instance.addHash(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearHash method, of class HashTable.
     */
    @Test
    public void testClearHash() {
        System.out.println("clearHash");
        HashTable instance = new HashTable();
        instance.clearHash();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isElementInHashTable method, of class HashTable.
     */
    @Test
    public void testIsElementInHashTable() {
        System.out.println("isElementInHashTable");
        String str = "";
        HashTable instance = new HashTable();
        boolean expResult = false;
        boolean result = instance.isElementInHashTable(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
