/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Usuario;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class UsuarioFacadeTest {
    
    public UsuarioFacadeTest() {
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
     * Test of create method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testCreate() throws Exception {
        System.out.println("create");
        Usuario entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testEdit() throws Exception {
        System.out.println("edit");
        Usuario entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testRemove() throws Exception {
        System.out.println("remove");
        Usuario entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        Usuario expResult = null;
        Usuario result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetIdCurrentUser() throws Exception {
        System.out.println("getIdCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        Integer expResult = null;
        Integer result = instance.getIdCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetNombreCurrentUser() throws Exception {
        System.out.println("getNombreCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getNombreCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCedulaCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetCedulaCurrentUser() throws Exception {
        System.out.println("getCedulaCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getCedulaCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliasCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAliasCurrentUser() throws Exception {
        System.out.println("getAliasCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getAliasCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetEmailCurrentUser() throws Exception {
        System.out.println("getEmailCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getEmailCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFotoURLCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetFotoURLCurrentUser() throws Exception {
        System.out.println("getFotoURLCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getFotoURLCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetRolCurrentUser() throws Exception {
        System.out.println("getRolCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getRolCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolIdCurrentUser method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetRolIdCurrentUser() throws Exception {
        System.out.println("getRolIdCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        Integer expResult = null;
        Integer result = instance.getRolIdCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLapso method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetCurrentLapso() throws Exception {
        System.out.println("getCurrentLapso");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        String expResult = "";
        String result = instance.getCurrentLapso();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FindbyUsuario method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindbyUsuario() throws Exception {
        System.out.println("FindbyUsuario");
        String usuario = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        Usuario expResult = null;
        Usuario result = instance.FindbyUsuario(usuario);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FindbyCedula method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindbyCedula() throws Exception {
        System.out.println("FindbyCedula");
        String cedula = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        Usuario expResult = null;
        Usuario result = instance.FindbyCedula(cedula);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTheacherSubject method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindTheacherSubject() throws Exception {
        System.out.println("findTheacherSubject");
        String codmateria = "";
        String lapso = "";
        int seccion = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        Usuario expResult = null;
        Usuario result = instance.findTheacherSubject(codmateria, lapso, seccion);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllStudentsSubject method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindAllStudentsSubject() throws Exception {
        System.out.println("findAllStudentsSubject");
        String codmateria = "";
        String lapso = "";
        int seccion = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        List expResult = null;
        List result = instance.findAllStudentsSubject(codmateria, lapso, seccion);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllStudentsSubjectForMessage method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindAllStudentsSubjectForMessage() throws Exception {
        System.out.println("findAllStudentsSubjectForMessage");
        String codmateria = "";
        String lapso = "";
        String cedula = "";
        int seccion = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        List expResult = null;
        List result = instance.findAllStudentsSubjectForMessage(codmateria, lapso, cedula, seccion);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllUsers method, of class UsuarioFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindAllUsers() throws Exception {
        System.out.println("findAllUsers");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsuarioFacade instance = (UsuarioFacade)container.getContext().lookup("java:global/classes/UsuarioFacade");
        List expResult = null;
        List result = instance.findAllUsers();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
