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
public class VistaControlProfesorControllerTest {
    
    public VistaControlProfesorControllerTest() {
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
     * Test of init method, of class VistaControlProfesorController.
     * Tiempo 0,023s
     */
        @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        VistaControlProfesorController instance = new VistaControlProfesorController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
