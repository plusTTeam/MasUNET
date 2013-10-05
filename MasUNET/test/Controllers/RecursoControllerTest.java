/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Asignatura;
import Entities.Recurso;
import Entities.TipoRecurso;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
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
public class RecursoControllerTest {
    
    public RecursoControllerTest() {
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
     * Test of getEntityManager method, of class RecursoController.
     * Tiempo 0,001s
     */
       @Test(expected=ClassFormatError.class)
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        RecursoController instance = new RecursoController();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class RecursoController.
     * Tiempo 0,001s
     */
    @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        RecursoController instance = new RecursoController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class RecursoController.
     * Tiempo 0,016s
     */
        @Test(expected=ClassFormatError.class)
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        ActionEvent event = null;
        RecursoController instance = new RecursoController();
        Recurso expResult = null;
        Recurso result = instance.prepareCreate(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRecursosEntities method, of class RecursoController.
     * Tiempo 0,001s
     */
    @Test(expected=ClassFormatError.class)
    public void testFindRecursosEntities() {
        System.out.println("findRecursosEntities");
        TipoRecurso Tp = null;
        Asignatura Asig = null;
        RecursoController instance = new RecursoController();
        List expResult = null;
        List result = instance.findRecursosEntities(Tp, Asig);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecursosOrderedByTipoRecurso method, of class RecursoController.
     * Tiempo  0,001s
     */
    @Test(expected=ClassFormatError.class)
    public void testGetRecursosOrderedByTipoRecurso() {
        System.out.println("getRecursosOrderedByTipoRecurso");
        RecursoController instance = new RecursoController();
        List expResult = null;
        List result = instance.getRecursosOrderedByTipoRecurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
