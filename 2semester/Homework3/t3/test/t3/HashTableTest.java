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
    public void testHashFun() {
    }
    /**
     * Test of addHash method, of class HashTable.
     */
    @Test
    public void testAddHash() {
        HashTable hashTable = new HashTable();
        hashTable.addHash("1");
        assertTrue(hashTable.isElementInHashTable("1"));
    }

    /**
     * Test of clearHash method, of class HashTable.
     */
    @Test
    public void testClearHash() {
        HashTable hashTable = new HashTable();
        hashTable.addHash("1");
        hashTable.clearHash();
        assertFalse(hashTable.isElementInHashTable("1"));
    }

    /**
     * Test of isElementInHashTable method, of class HashTable.
     */
    @Test
    public void testIsElementInHashTableInEmptyHash() {
        HashTable hashTable = new HashTable();
        assertFalse(hashTable.isElementInHashTable("1"));
    }
    
    /**
     * Test of isElementInHashTable method, of class HashTable.
     */
    @Test
    public void testIsElementInHashTable() {
        HashTable hashTable = new HashTable();
        hashTable.addHash("1");
        hashTable.addHash("2");
        hashTable.addHash("1");
        assertTrue(hashTable.isElementInHashTable("1"));
    }

}
