/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Asignatura;
import Entities.Usuario;
import java.util.List;
import javax.faces.event.ActionEvent;
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
public class MessagesBeanTest {
    
    public MessagesBeanTest() {
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
     * Test of getAllMessageUSer method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAllMessageUSer() {
        System.out.println("getAllMessageUSer");
        MessagesBean instance = new MessagesBean();
        List expResult = null;
        List result = instance.getAllMessageUSer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateMessage method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testValidateMessage() {
        System.out.println("validateMessage");
        int userId = 0;
        MessagesBean instance = new MessagesBean();
        boolean expResult = false;
        boolean result = instance.validateMessage(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of send method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSend() {
        System.out.println("send");
        ActionEvent event = null;
        MessagesBean instance = new MessagesBean();
        instance.send(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeUser method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testCompleteUser() {
        System.out.println("completeUser");
        String query = "";
        MessagesBean instance = new MessagesBean();
        List expResult = null;
        List result = instance.completeUser(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadUsers method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testLoadUsers() {
        System.out.println("loadUsers");
        MessagesBean instance = new MessagesBean();
        instance.loadUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectsUser method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetSubjectsUser() {
        System.out.println("getSubjectsUser");
        MessagesBean instance = new MessagesBean();
        List expResult = null;
        List result = instance.getSubjectsUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersSubject method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetUsersSubject() {
        System.out.println("getUsersSubject");
        MessagesBean instance = new MessagesBean();
        List expResult = null;
        List result = instance.getUsersSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserSelected method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetUserSelected() {
        System.out.println("getUserSelected");
        MessagesBean instance = new MessagesBean();
        Usuario expResult = null;
        Usuario result = instance.getUserSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserSelected method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetUserSelected() {
        System.out.println("setUserSelected");
        Usuario userSelected = null;
        MessagesBean instance = new MessagesBean();
        instance.setUserSelected(userSelected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectSelected method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetSubjectSelected() {
        System.out.println("getSubjectSelected");
        MessagesBean instance = new MessagesBean();
        Asignatura expResult = null;
        Asignatura result = instance.getSubjectSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectSelected method, of class MessagesBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetSubjectSelected() {
        System.out.println("setSubjectSelected");
        Asignatura subjectSelected = null;
        MessagesBean instance = new MessagesBean();
        instance.setSubjectSelected(subjectSelected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
