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
public class StackCalculateTest {
    
    public StackCalculateTest() {
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
     * Test of add method, of class StackCalculator.
     */
    @Test
    public void testAdd() {
        StackCalculate calc = new StackCalculate(new StackList());
        calc.addTwoElementsToStack(2, 3);
        assertEquals(calc.add(), 5);
    }
    
    /**
     * Test of sub method, of class StackCalculator.
     */
    @Test
    public void testSub() {
        StackCalculate calc = new StackCalculate(new StackList());
        calc.addTwoElementsToStack(3, 2);
        assertEquals(calc.sub(), -1);
    }
    
    /**
     * Test of mul method, of class StackCalculator.
     */
    @Test
    public void testMul() {
        StackCalculate calc = new StackCalculate(new StackList());
        calc.addTwoElementsToStack(3, 2);
        assertEquals(calc.mul(), 6);
    }
    
    /**
     * Test of div method, of class StackCalculator.
     */
    @Test
    public void testDiv() {
        StackCalculate calc = new StackCalculate(new StackList());
        calc.addTwoElementsToStack(3, 6);
        assertEquals(calc.div(), 2);
    }
}
