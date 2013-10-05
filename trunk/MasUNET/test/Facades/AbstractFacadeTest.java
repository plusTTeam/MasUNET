/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.List;
import javax.persistence.EntityManager;
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
public class AbstractFacadeTest {
    
    public AbstractFacadeTest() {
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
     * Test of getEntityManager method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,001
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        AbstractFacade instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,001
    public void testCreate() {
        System.out.println("create");
        Object entity = null;
        AbstractFacade instance = null;
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,006
    public void testEdit() {
        System.out.println("edit");
        Object entity = null;
        AbstractFacade instance = null;
        instance.edit(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,001s
    public void testRemove() {
        System.out.println("remove");
        Object entity = null;
        AbstractFacade instance = null;
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testFind() {
        System.out.println("find");
        Object id = null;
        AbstractFacade instance = null;
        Object expResult = null;
        Object result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,001s
    public void testFindAll() {
        System.out.println("findAll");
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testCount() {
        System.out.println("count");
        AbstractFacade instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,001s
    public void testGetIdCurrentUser() {
        System.out.println("getIdCurrentUser");
        AbstractFacade instance = null;
        Integer expResult = null;
        Integer result = instance.getIdCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testGetNombreCurrentUser() {
        System.out.println("getNombreCurrentUser");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getNombreCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCedulaCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testGetCedulaCurrentUser() {
        System.out.println("getCedulaCurrentUser");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getCedulaCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliasCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testGetAliasCurrentUser() {
        System.out.println("getAliasCurrentUser");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getAliasCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testGetEmailCurrentUser() {
        System.out.println("getEmailCurrentUser");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getEmailCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFotoURLCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,002s
    public void testGetFotoURLCurrentUser() {
        System.out.println("getFotoURLCurrentUser");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getFotoURLCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,001s
    public void testGetRolCurrentUser() {
        System.out.println("getRolCurrentUser");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getRolCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolIdCurrentUser method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testGetRolIdCurrentUser() {
        System.out.println("getRolIdCurrentUser");
        AbstractFacade instance = null;
        Integer expResult = null;
        Integer result = instance.getRolIdCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLapso method, of class AbstractFacade.
     */
    @Test(expected=NullPointerException.class)//0,0s
    public void testGetCurrentLapso() {
        System.out.println("getCurrentLapso");
        AbstractFacade instance = null;
        String expResult = "";
        String result = instance.getCurrentLapso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractFacadeImpl extends AbstractFacade {

        public AbstractFacadeImpl() {
            super(null);
        }

        public EntityManager getEntityManager() {
            return null;
        }
    }
}
