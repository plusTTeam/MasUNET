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
public class UserEvenControllerTest {
    
    public UserEvenControllerTest() {
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
     * Test of init method, of class UserEvenController.
     * Tiempo 0,026s
     */
        @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        UserEvenController instance = new UserEvenController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class UserEvenController.
     * Tiempo 0,001s
     */
        @Test(expected=ClassFormatError.class)
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        UserEvenController instance = new UserEvenController();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class UserEvenController.
     * Tiempo 0,001s
     */
        @Test(expected=ClassFormatError.class)
public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        UserEvenController instance = new UserEvenController();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
