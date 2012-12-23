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
public class NetworkTest {
    
    public NetworkTest() {
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
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testProgressNetworkInStart() {
        Network network = new Network();
        PC[] currentComputers = network.getComputers();
        assertTrue(currentComputers[0].isInfected());
        assertTrue(currentComputers[4].isInfected());
        for (int i = 1; i < 4; i++) {
            assertFalse(currentComputers[i].isInfected());
        }
    }
     
    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testProgressNetworkInProgress(){
        Network network = new Network();
        PC[] currentComputers = network.getComputers();
        assertTrue(currentComputers[0].isInfected());
        assertTrue(currentComputers[4].isInfected());
        for (int i = 1; i < 4; i++) {
            assertFalse(currentComputers[i].isInfected());
        }
        network.progressNetwork();
        assertTrue(currentComputers[0].isInfected());
        assertTrue(currentComputers[4].isInfected());
        assertFalse(currentComputers[3].isInfected());
    }

    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testPrintNetwork(){
        Network network = new Network();
        network.printNetwork();
    }
    
    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testStartNetwork(){
        Network network = new Network();
        PC[] currentComputers = network.getComputers();
        network.start();
    }
}
