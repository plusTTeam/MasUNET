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
public class ValoracionControllerTest {
    
    public ValoracionControllerTest() {
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
     * Test of init method, of class ValoracionController.
     * Tiempo 0,001s
     */
     @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        ValoracionController instance = new ValoracionController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class ValoracionController.
     * Tiempo 0,024s
     */
     @Test(expected=ClassFormatError.class)
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        ValoracionController instance = new ValoracionController();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class ValoracionController.
     * Tiempo 0,001s
     */
    @Test(expected=ClassFormatError.class)
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        ValoracionController instance = new ValoracionController();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
