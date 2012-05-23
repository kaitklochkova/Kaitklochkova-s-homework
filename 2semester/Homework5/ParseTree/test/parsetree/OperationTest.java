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
public class OperationTest {
    
    public OperationTest() {
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
     * Test of isDigit method of class Operation.
     */
    @Test
    public void testIsDigit() {
        TreeElement operation = new Operation('+');
        assertFalse(operation.isDigit());
    }
    
    /**
     * Test of getDigit method of class Operation.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetDigit() {
        TreeElement operation = new Operation('+');
        operation.getDigit();
    }
    
    /**
     * Test of calculate method, of class Operation.
     */
    public void testCalculate() throws IncorrectOperation {
        TreeElement operation = new Operation('+');
        operation.getRightSon();
        TreeElement digitLeft = new Digit(1);
        operation.setLeftSon(digitLeft);
        TreeElement digitRight = new Digit(1);
        operation.setRightSon(digitRight);
        assertEquals(2, operation.calculate(1, 1));
    }
    
    /**
     * Test of getRightSon and setRightSun method, of class Operation.
     */
    public void testSetAndGetRightSon() {
        TreeElement operation = new Operation('+');
        TreeElement digit = new Digit(1);
        operation.setRightSon(digit);
        assertEquals(digit, operation.getRightSon());
    }

    /**
     * Test of setLeftSon and getLeftSon method, of class Operation.
     */
    public void testSetAndGetLeftSon() {
        TreeElement operation = new Operation('+');
        TreeElement digit = new Digit(1);
        operation.setLeftSon(digit);
        assertEquals(digit, operation.getLeftSon());
    }

}
