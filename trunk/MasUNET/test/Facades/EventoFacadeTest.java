/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Evento;
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
public class EventoFacadeTest {
    
    public EventoFacadeTest() {
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
     * Test of create method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)//todos 0,001 y 0,0 testremove 0,003
    public void testCreate() throws Exception {
        System.out.println("create");
        Evento entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testEdit() throws Exception {
        System.out.println("edit");
        Evento entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)//0,003s
    public void testRemove() throws Exception {
        System.out.println("remove");
        Evento entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        Evento expResult = null;
        Evento result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetIdCurrentUser() throws Exception {
        System.out.println("getIdCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        Integer expResult = null;
        Integer result = instance.getIdCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetNombreCurrentUser() throws Exception {
        System.out.println("getNombreCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getNombreCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCedulaCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetCedulaCurrentUser() throws Exception {
        System.out.println("getCedulaCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getCedulaCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliasCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAliasCurrentUser() throws Exception {
        System.out.println("getAliasCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getAliasCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetEmailCurrentUser() throws Exception {
        System.out.println("getEmailCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getEmailCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFotoURLCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetFotoURLCurrentUser() throws Exception {
        System.out.println("getFotoURLCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getFotoURLCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetRolCurrentUser() throws Exception {
        System.out.println("getRolCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getRolCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolIdCurrentUser method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetRolIdCurrentUser() throws Exception {
        System.out.println("getRolIdCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        Integer expResult = null;
        Integer result = instance.getRolIdCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLapso method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetCurrentLapso() throws Exception {
        System.out.println("getCurrentLapso");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        String expResult = "";
        String result = instance.getCurrentLapso();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEventsStudent method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAllEventsStudent() throws Exception {
        System.out.println("getAllEventsStudent");
        Usuario iduser = null;
        String cedula = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        List expResult = null;
        List result = instance.getAllEventsStudent(iduser, cedula);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEventsSubject method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAllEventsSubject() throws Exception {
        System.out.println("getAllEventsSubject");
        Integer idasignatura = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        List expResult = null;
        List result = instance.getAllEventsSubject(idasignatura);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEventsPersonal method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAllEventsPersonal() throws Exception {
        System.out.println("getAllEventsPersonal");
        Integer iduser = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        List expResult = null;
        List result = instance.getAllEventsPersonal(iduser);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastEvent method, of class EventoFacade.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetLastEvent() throws Exception {
        System.out.println("getLastEvent");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EventoFacade instance = (EventoFacade)container.getContext().lookup("java:global/classes/EventoFacade");
        Evento expResult = null;
        Evento result = instance.getLastEvent();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
