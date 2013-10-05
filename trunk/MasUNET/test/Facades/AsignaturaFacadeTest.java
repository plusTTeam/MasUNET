/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Asignatura;
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
public class AsignaturaFacadeTest {
    
    public AsignaturaFacadeTest() {
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
     * Test of create method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testCreate() throws Exception {
        System.out.println("create");
        Asignatura entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testEdit() throws Exception {
        System.out.println("edit");
        Asignatura entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,002s
    public void testRemove() throws Exception {
        System.out.println("remove");
        Asignatura entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        Asignatura expResult = null;
        Asignatura result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetIdCurrentUser() throws Exception {
        System.out.println("getIdCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        Integer expResult = null;
        Integer result = instance.getIdCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetNombreCurrentUser() throws Exception {
        System.out.println("getNombreCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getNombreCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCedulaCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetCedulaCurrentUser() throws Exception {
        System.out.println("getCedulaCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getCedulaCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliasCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetAliasCurrentUser() throws Exception {
        System.out.println("getAliasCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getAliasCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0.0s
    public void testGetEmailCurrentUser() throws Exception {
        System.out.println("getEmailCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getEmailCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFotoURLCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetFotoURLCurrentUser() throws Exception {
        System.out.println("getFotoURLCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getFotoURLCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetRolCurrentUser() throws Exception {
        System.out.println("getRolCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getRolCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolIdCurrentUser method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,01s
    public void testGetRolIdCurrentUser() throws Exception {
        System.out.println("getRolIdCurrentUser");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        Integer expResult = null;
        Integer result = instance.getRolIdCurrentUser();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLapso method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetCurrentLapso() throws Exception {
        System.out.println("getCurrentLapso");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.getCurrentLapso();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectsStudent method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetAllSubjectsStudent() throws Exception {
        System.out.println("getAllSubjectsStudent");
        String Cedula = "";
        String Lapso = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        List expResult = null;
        List result = instance.getAllSubjectsStudent(Cedula, Lapso);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectsTeacher method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,0s
    public void testGetAllSubjectsTeacher() throws Exception {
        System.out.println("getAllSubjectsTeacher");
        String Cedula = "";
        String Lapso = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        List expResult = null;
        List result = instance.getAllSubjectsTeacher(Cedula, Lapso);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNameTeacherSubject method, of class AsignaturaFacade.
     */
    @Test(expected=ClassFormatError.class)//0,001s
    public void testFindNameTeacherSubject() throws Exception {
        System.out.println("findNameTeacherSubject");
        String codMateria = "";
        String Lapso = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsignaturaFacade instance = (AsignaturaFacade)container.getContext().lookup("java:global/classes/AsignaturaFacade");
        String expResult = "";
        String result = instance.findNameTeacherSubject(codMateria, Lapso);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
