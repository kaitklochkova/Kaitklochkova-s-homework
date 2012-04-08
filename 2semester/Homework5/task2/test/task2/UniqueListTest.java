/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class UniqueListTest {

    public UniqueListTest() {
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
     * Test of uniqueAdd method, of class UniqueList.
     */
    @Test
    public void testUniqueAdd() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.uniqueAdd(4);
        assertEquals(4, uniqueList.getIterator().getValue());
        assertEquals(uniqueList.getCount(), 1);
    }

    /**
     * Test of uniqueAdd method, of class UniqueList.
     */
    @Test
    public void testUniqueAddTwoSameElemnts() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.uniqueAdd(4);
        boolean throwed = false;
        try {
            uniqueList.uniqueAdd(4);
        } catch (IsInList isInList) {
            throwed = true;
        }
        assertEquals(throwed, true);
        assertEquals(uniqueList.getCount(), 1);
    }

    /**
     * Test of uniqueDel method, of class UniqueList.
     */
    @Test
    public void testUniqueDel() throws IsInList, NotInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.uniqueAdd(4);
        uniqueList.uniqueAdd(5);
        uniqueList.uniqueDel(4);
        assertEquals(uniqueList.getCount(), 1);
        assertEquals(5, uniqueList.getIterator().getValue());
    }

    /**
     * Test of uniqueDel method, of class UniqueList.
     */
    @Test
    public void testUniqueDelElementNotInList() throws IsInList, NotInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.uniqueAdd(4);
        boolean throwed = false;
        try {
            uniqueList.uniqueDel(5);
        } catch (NotInList notInList) {
            throwed = true;
        }
        assertEquals(throwed, true);
    }
}
