/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Pagina;
import java.util.List;
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
public class MenuBeanTest {
    
    public MenuBeanTest() {
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
     * Test of getMainMenu method, of class MenuBean.
     */
    @Test(expected=NullPointerException.class)
    public void testGetMainMenu() {
        System.out.println("getMainMenu");
        MenuBean instance = new MenuBean();
        List expResult = null;
        List result = instance.getMainMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdminMenu method, of class MenuBean.
     */
    @Test(expected=NullPointerException.class)
    public void testGetAdminMenu() {
        System.out.println("getAdminMenu");
        MenuBean instance = new MenuBean();
        Pagina expResult = null;
        Pagina result = instance.getAdminMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdminSubMenu method, of class MenuBean.
     */
    @Test(expected=NullPointerException.class)
    public void testGetAdminSubMenu() {
        System.out.println("getAdminSubMenu");
        MenuBean instance = new MenuBean();
        List expResult = null;
        List result = instance.getAdminSubMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
