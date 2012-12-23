/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class PCTest {
    
    public PCTest() {
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
    public void testIsInfectedWindowsFalse() {
        PC computer1 = new PC(new Windows(), false);
        assertFalse(computer1.isInfected());
    }
    
    @Test
    public void testIsInfectedWindowsTrue() {
        PC computer1 = new PC(new Windows(), true);
        assertTrue(computer1.isInfected());
    }
    
    @Test
    public void testIsInfectedLinuxFalse() {
        PC computer1 = new PC(new Linux(), false);
        assertFalse(computer1.isInfected());
    }
    
    @Test
    public void testIsInfectedLinuxTrue() {
        PC computer1 = new PC(new Linux(), true);
        assertTrue(computer1.isInfected());
    }
    
    @Test
    public void testIsInfectedMacOSFalse() {
        PC computer1 = new PC(new MacOS(), false);
        assertFalse(computer1.isInfected());
    }
    
    @Test
    public void testIsInfectedMacOSTrue() {
        PC computer1 = new PC(new MacOS(), true);
        assertTrue(computer1.isInfected());
    }
}
