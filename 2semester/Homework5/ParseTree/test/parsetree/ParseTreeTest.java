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
public class ParseTreeTest {
    
    public ParseTreeTest() {
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
     *
     * Test of consrtuctor of class ParseTree.
     */
    @Test
    public void testSomeMethod() throws IncorrectString{
        ParseTree tree = new ParseTree("(*(+11)2)");
    }
    
    /**
     * Test of getRoot method, of class ParseTree.
     */
    @Test
    public void testGetRoot() throws IncorrectString{
        ParseTree tree = new ParseTree("(+11)");
        TreeElement operation = new Operation('+');
        //assertEquals(operation, tree.getRoot());
    }
}
