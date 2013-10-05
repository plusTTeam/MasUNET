/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhonangel mireles
 */
public class UsuMenControllerTest {
    
    public UsuMenControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class UsuMenController.
     * Tiempo 0,03s
     */
    @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        UsuMenController instance = new UsuMenController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class UsuMenController.
     * Tiempo 0,001s
     */
    @Test(expected=ClassFormatError.class)
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        UsuMenController instance = new UsuMenController();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class UsuMenController.
     * Tiempo 0,001s
     */
    @Test(expected=ClassFormatError.class)
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        UsuMenController instance = new UsuMenController();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
