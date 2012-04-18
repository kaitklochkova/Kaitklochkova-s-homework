/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

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
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        hashTable.addHash("1");
        assertTrue(hashTable.isElementInHashTable("1"));
    }
    /**
     * Test of delHash method, of class HashTable.
     */
    @Test
    public void testDelEmptyHash() {
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        assertEquals(-1, hashTable.delHash("1"));
    }

    /**
     * Test of delHash method, of class HashTable.
     */
    @Test
    public void testDelHash() {
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        hashTable.addHash("1");
        hashTable.delHash("1");
        assertFalse(hashTable.isElementInHashTable("1"));
    }
    
    /**
     * Test of clearHash method, of class HashTable.
     */
    @Test
    public void testClearHash() {
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        hashTable.addHash("1");
        hashTable.clearHash();
        assertFalse(hashTable.isElementInHashTable("1"));
    }

    /**
     * Test of isElementInHashTable method, of class HashTable.
     */
    @Test
    public void testIsElementInHashTableInEmptyHash() {
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        assertFalse(hashTable.isElementInHashTable("1"));
    }
    
    /**
     * Test of isElementInHashTable method, of class HashTable.
     */
    @Test
    public void testIsElementInHashTable() {
        MyHashFun myHashFun = new MyHashFun();
        HashTable hashTable = new HashTable(myHashFun);
        hashTable.addHash("1");
        hashTable.addHash("2");
        hashTable.addHash("1");
        assertTrue(hashTable.isElementInHashTable("1"));
    }
}
