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
     * Test of add method, of class UniqueList.
     */
    @Test
    public void testadd() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.add(4);
        assertEquals(4, uniqueList.getIterator().getValue());
        assertEquals(uniqueList.getCount(), 1);
    }

    /**
     * Test of add method, of class UniqueList.
     */
    @Test
    public void testAddTwoSameElemnts() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.add(4);
        boolean throwed = false;
        try {
            uniqueList.add(4);
        } catch (IsInList isInList) {
            throwed = true;
        }
        assertEquals(throwed, true);
        assertEquals(uniqueList.getCount(), 1);
    }

    /**
     * Test of add method, of class UniqueList.
     */
    @Test
    public void testAddIsInList() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.add(4);
        boolean throwed = false;
        try {
            uniqueList.add(4);
        } catch (IsInList isInList) {
            throwed = true;
        }
        assertEquals(throwed, true);
    }
    
    /**
     * Test of del method, of class UniqueList.
     */
    @Test
    public void testDel() throws IsInList, NotInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.add(4);
        uniqueList.add(5);
        uniqueList.del(4);
        assertEquals(uniqueList.getCount(), 1);
        assertEquals(5, uniqueList.getIterator().getValue());
    }

    /**
     * Test of del method, of class UniqueList.
     */
    @Test
    public void testDelElementNotInList() throws IsInList, NotInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.add(4);
        boolean throwed = false;
        try {
            uniqueList.del(5);
        } catch (NotInList notInList) {
            throwed = true;
        }
        assertEquals(throwed, true);
    }
}
