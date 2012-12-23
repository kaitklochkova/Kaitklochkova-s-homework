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
    int[][] connections = {
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
        };
    
    PC[] computers = new PC[connections.length];
    public NetworkTest() {     
        computers[0] = new PC(new Windows(), true);
        computers[1] = new PC(new Windows(), false);
        computers[2] = new PC(new MacOS(), false);
        computers[3] = new PC(new Linux(), false);
        computers[4] = new PC(new Windows(), true);
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
        Network network = new Network(connections, computers);
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
        Network network = new Network(connections, computers);
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
        Network network = new Network(connections, computers);
        network.printNetwork();
    }
    
    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testStartNetwork(){
        final Network network = new Network(connections, computers);
        PC[] currentComputers = network.getComputers();      
        network.start();
        for (int i = 0; i < currentComputers.length; i++) {
            assertTrue(currentComputers[i].isInfected());
        }
    }
    
    /**
     * Test of progress method, of class NetWork.
     */
    @Test
    public void testStartNetwork1(){
        int[][] connectionsThree = {
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0},
            
        };
        PC[] computersThree = new PC[connectionsThree.length];
        computersThree[0] = new PC(new Windows(), true);
        computersThree[1] = new PC(new Windows(), false);
        computersThree[2] = new PC(new MacOS(), false);
        final Network network = new Network(connectionsThree, computersThree);
        PC[] currentComputers = network.getComputers();      
        network.start();
        for (int i = 0; i < currentComputers.length; i++) {
            assertTrue(currentComputers[i].isInfected());
        }
    }
}
