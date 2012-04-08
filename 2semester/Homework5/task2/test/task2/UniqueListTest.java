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

    @Test
    public void testUniqueAdd() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.uniqueAdd(4);
        assertEquals(4, uniqueList.getIterator().getValue());
    }
    
    @Test
    public void testUniqueAddTwoSameElemnts() throws IsInList {
        UniqueList uniqueList = new UniqueList();
        uniqueList.uniqueAdd(4);
        uniqueList.uniqueAdd(4);
       // assertEquals(4, uniqueList.getIterator().getValue());
        assertEquals(1, uniqueList.getCount());
    }
}
