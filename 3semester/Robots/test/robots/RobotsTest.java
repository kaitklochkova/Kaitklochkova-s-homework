/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Miracle
 */
public class RobotsTest {
    
    public RobotsTest() {
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
     * Test of canRobotsBeDestroed method, of class Robots
     */
    @Test
    public void testCanRobotsBeDestroed1() {
        int[][] matrix = {
            {0, 1, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}       
        };
        int[] robotsP = {1, 0, 0, 0, 0, 0};
        Robots robots = new Robots(matrix, robotsP);
        assertFalse(robots.canRobotsBeDestroed());
    }
    
    /**
     * Test of canRobotsBeDestroed method, of class Robots
     */
    @Test
    public void testCanRobotsBeDestroed() {
        int[][] matrix = {
            {0, 1, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}       
        };
        int[] robotsP = {1, 0, 0, 1, 1, 1};
        Robots robots = new Robots(matrix, robotsP);
        assertTrue(robots.canRobotsBeDestroed());
    }
}
