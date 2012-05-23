/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsetree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class DigitTest {
    
    public DigitTest() {
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
     * Test of isDigit method of class Digit.
     */
    @Test
    public void testIsDigit() {
        TreeElement digit = new Digit(1);
        assertTrue(digit.isDigit());
    }
    
    /**
     * Test of getDigit method of class Digit.
     */
    @Test
    public void testGetDigit() {
        TreeElement digit = new Digit(1);
        assertEquals(1, digit.getDigit());
    }
    
    /**
     * Test of getRightSon method, of class Digit.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testCalculate() {
        TreeElement digit = new Digit(1);
        digit.getRightSon();
    }
    
    /**
     * Test of getRightSon method, of class Digit.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetRightSon() {
        TreeElement digit = new Digit(1);
        digit.getRightSon();
    }

    /**
     * Test of getLeftSon method, of class Digit.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetLeftSon() {
        TreeElement digit = new Digit(1);
        digit.getLeftSon();
    }

    /**
     * Test of setRightSon method, of class Digit.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetRightSon() {
        TreeElement digit = new Digit(1);
        digit.setRightSon(digit);
    }

    /**
     * Test of setLeftSon method, of class Digit.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetLeftSon() {
        TreeElement digit = new Digit(1);
        digit.setLeftSon(digit);
    }
}
