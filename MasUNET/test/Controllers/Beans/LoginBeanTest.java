/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Usuario;
import javax.faces.event.ComponentSystemEvent;
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
public class LoginBeanTest {
    
    public LoginBeanTest() {
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
     * Test of login method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testLogin() {
        System.out.println("login");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testLogout() {
        System.out.println("logout");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyUseLogin method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testVerifyUseLogin() {
        System.out.println("verifyUseLogin");
        ComponentSystemEvent event = null;
        LoginBean instance = new LoginBean();
        instance.verifyUseLogin(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetUsername() {
        System.out.println("getUsername");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        LoginBean instance = new LoginBean();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginBean instance = new LoginBean();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoggedIn method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        LoginBean instance = new LoginBean();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAdmin method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testIsIsAdmin() {
        System.out.println("isIsAdmin");
        LoginBean instance = new LoginBean();
        boolean expResult = false;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsTeacher method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testIsIsTeacher() {
        System.out.println("isIsTeacher");
        LoginBean instance = new LoginBean();
        boolean expResult = false;
        boolean result = instance.isIsTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsStudent method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testIsIsStudent() {
        System.out.println("isIsStudent");
        LoginBean instance = new LoginBean();
        boolean expResult = false;
        boolean result = instance.isIsStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoggedIn method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetLoggedIn() {
        System.out.println("setLoggedIn");
        boolean isLoggedIn = false;
        LoginBean instance = new LoginBean();
        instance.setLoggedIn(isLoggedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetUser() {
        System.out.println("getUser");
        LoginBean instance = new LoginBean();
        Usuario expResult = null;
        Usuario result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class LoginBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetUser() {
        System.out.println("setUser");
        Usuario user = null;
        LoginBean instance = new LoginBean();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
