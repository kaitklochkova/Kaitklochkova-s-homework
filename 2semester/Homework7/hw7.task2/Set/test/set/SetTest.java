/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class SetTest {

    public SetTest() {
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

    /*
     * Test of add method, of class Set
     */
    @Test
    public void testAdd() throws IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(1);
        assertTrue(set.isElementInSet(1));
    }

    /*
     * Test of add method, of class Set
     */
    @Test
    public void testAddSomeElements() throws IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        assertTrue(set.isElementInSet(3));
    }

    /*
     * Test of add method, of class Set
     */
    @Test
    public void testAddTwoSameElements() throws IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(1);
        boolean throwed = false;
        try {
            set.add(1);
        } catch (IsInSet isInSet) {
            throwed = true;
        }
        assertTrue(throwed);
    }

    /*
     * Test of del method, of class Set
     */
    @Test
    public void testDel() throws NotInSet, IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(2);
        set.delete(2);
        assertFalse(set.isElementInSet(2));
    }

    /*
     * Test of del method, of class Set
     */
    @Test
    public void testDelFirstElement() throws NotInSet, IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(2);
        set.add(3);
        set.add(1);
        set.delete(1);
        assertFalse(set.isElementInSet(1));
    }

    /*
     * Test of del method, of class Set
     */
    @Test
    public void testDelLastElement() throws NotInSet, IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(2);
        set.add(3);
        set.add(1);
        set.delete(2);
        assertFalse(set.isElementInSet(2));
    }

    /*
     * Test of del method, of class Set
     */
    @Test
    public void testDelMidleElement() throws NotInSet, IsInSet {
        Set<Integer> set = new Set<Integer>();
        set.add(2);
        set.add(3);
        set.add(1);
        set.delete(3);
        assertFalse(set.isElementInSet(3));
    }

    /*
     * Test of del method, of class Set
     */
    @Test
    public void testDelEmptySet() throws NotInSet {
        Set<Integer> set = new Set<Integer>();
        boolean throwed = false;
        try {
            set.delete(2);
        } catch (NotInSet notInSet) {
            throwed = true;
        }
        assertEquals(true, throwed);
    }

    /*
     * Test of sum method, of class Set
     */
    @Test
    public void testSum() throws NotInSet, IsInSet {
        Set<Integer> set1 = new Set<Integer>();
        Set<Integer> set2 = new Set<Integer>();
        for (int i = 0; i < 2; i++) {
            set1.add(i);
        }
        for (int i = 2; i < 4; i++) {
            set2.add(i);
        }
        Set<Integer> set = set1.sum(set2);
        for (int i = 0; i < 4; i++) {
            assertTrue(set.isElementInSet(i));
        }
    }
    
    /*
     * Test of cross method, of class Set
     */
    @Test
    public void testCross() throws NotInSet, IsInSet {
        Set<Integer> set1 = new Set<Integer>();
        Set<Integer> set2 = new Set<Integer>();
        for (int i = 0; i < 4; i++) {
            set1.add(i);
        }
        for (int i = 2; i < 6; i++) {
            set2.add(i);
        }
        Set<Integer> set = set1.cross(set2);
        for (int i = 2; i < 4; i++) {
            assertTrue(set.isElementInSet(i));
        }
    }
}
