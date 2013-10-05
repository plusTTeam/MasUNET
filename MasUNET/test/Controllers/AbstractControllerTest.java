/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Usuario;
import Facades.AbstractFacade;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucybell Velasco
 */
public class AbstractControllerTest {
    
    public AbstractControllerTest() {
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
     * Test of getFacade method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001S
    public void testGetFacade() {
        System.out.println("getFacade");
        AbstractController instance = new AbstractControllerImpl();
        AbstractFacade expResult = null;
        AbstractFacade result = instance.getFacade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacade method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001S
    public void testSetFacade() {
        System.out.println("setFacade");
        AbstractController instance = new AbstractControllerImpl();
        instance.setFacade(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001S
    public void testGetSelected() {
        System.out.println("getSelected");
        AbstractController instance = new AbstractControllerImpl();
        Object expResult = null;
        Object result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testSetSelected() {
        System.out.println("setSelected");
        Object selected = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        AbstractController instance = new AbstractControllerImpl();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        AbstractController instance = new AbstractControllerImpl();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testGetItems() {
        System.out.println("getItems");
        AbstractController instance = new AbstractControllerImpl();
        List expResult = null;
        List result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,002s
    public void testSave() {
        System.out.println("save");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.save(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveNew method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testSaveNew() {
        System.out.println("saveNew");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.saveNew(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testDelete() {
        System.out.println("delete");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.delete(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,002s
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        Object expResult = null;
        Object result = instance.prepareCreate(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidationFailed method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,012s
    public void testIsValidationFailed() {
        System.out.println("isValidationFailed");
        AbstractController instance = new AbstractControllerImpl();
        boolean expResult = false;
        boolean result = instance.isValidationFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMessage method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testAddMessage() {
        System.out.println("addMessage");
        FacesMessage message = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.addMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMessageError method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testAddMessageError() {
        System.out.println("addMessageError");
        String title = "";
        String message = "";
        AbstractController instance = new AbstractControllerImpl();
        instance.addMessageError(title, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMessageInfo method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testAddMessageInfo() {
        System.out.println("addMessageInfo");
        String title = "";
        String message = "";
        AbstractController instance = new AbstractControllerImpl();
        instance.addMessageInfo(title, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMessageWarning method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testAddMessageWarning() {
        System.out.println("addMessageWarning");
        String title = "";
        String message = "";
        AbstractController instance = new AbstractControllerImpl();
        instance.addMessageWarning(title, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMessageFatalError method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testAddMessageFatalError() {
        System.out.println("addMessageFatalError");
        String title = "";
        String message = "";
        AbstractController instance = new AbstractControllerImpl();
        instance.addMessageFatalError(title, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoggedUser method, of class AbstractController.
     */
    @Test(expected=ClassFormatError.class)//0,002s
    public void testGetLoggedUser() {
        System.out.println("getLoggedUser");
        AbstractController instance = new AbstractControllerImpl();
        Usuario expResult = null;
        Usuario result = instance.getLoggedUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractControllerImpl extends AbstractController {
    }
}
