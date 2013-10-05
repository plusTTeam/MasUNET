/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans.Resources;

import Controllers.AsignaturaController;
import Controllers.RecursoController;
import Controllers.TipoRecursoController;
import Entities.Asignatura;
import Entities.Recurso;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.TreeNode;

/**
 *
 * @author jhonangel mireles
 */
public class ResourcesBeanTest {
    
    public ResourcesBeanTest() {
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
     * Test of getC_Recurso method, of class ResourcesBean.
     */
    @Test
    public void testGetC_Recurso() {
        System.out.println("getC_Recurso");
        ResourcesBean instance = new ResourcesBean();
        RecursoController expResult = null;
        RecursoController result = instance.getC_Recurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getE_Recurso method, of class ResourcesBean.
     */
    @Test
    public void testGetE_Recurso() {
        System.out.println("getE_Recurso");
        ResourcesBean instance = new ResourcesBean();
        Recurso expResult = null;
        Recurso result = instance.getE_Recurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setE_Recurso method, of class ResourcesBean.
     */
    @Test
    public void testSetE_Recurso() {
        System.out.println("setE_Recurso");
        Recurso e_Recurso = null;
        ResourcesBean instance = new ResourcesBean();
        instance.setE_Recurso(e_Recurso);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setC_Recurso method, of class ResourcesBean.
     */
    @Test
    public void testSetC_Recurso() {
        System.out.println("setC_Recurso");
        RecursoController c_Recurso = null;
        ResourcesBean instance = new ResourcesBean();
        instance.setC_Recurso(c_Recurso);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getC_Asig method, of class ResourcesBean.
     */
    @Test
    public void testGetC_Asig() {
        System.out.println("getC_Asig");
        ResourcesBean instance = new ResourcesBean();
        AsignaturaController expResult = null;
        AsignaturaController result = instance.getC_Asig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getC_TipoRecurso method, of class ResourcesBean.
     */
    @Test
    public void testGetC_TipoRecurso() {
        System.out.println("getC_TipoRecurso");
        ResourcesBean instance = new ResourcesBean();
        TipoRecursoController expResult = null;
        TipoRecursoController result = instance.getC_TipoRecurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //  fail("The test case is a prototype.");
    }

    /**
     * Test of getTreeRoot method, of class ResourcesBean.
     */
      @Test(expected=NullPointerException.class)
    public void testGetTreeRoot() {
        System.out.println("getTreeRoot");
        ResourcesBean instance = new ResourcesBean();
        TreeNode expResult = null;
        TreeNode result = instance.getTreeRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecursosOrderedByTipoRecurso method, of class ResourcesBean.
     * Tiempo 0,058s
     */
    @Test(expected=NullPointerException.class)
    public void testGetRecursosOrderedByTipoRecurso() {
        System.out.println("getRecursosOrderedByTipoRecurso");
        ResourcesBean instance = new ResourcesBean();
        List expResult = null;
        List result = instance.getRecursosOrderedByTipoRecurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedNode method, of class ResourcesBean.
     * Tiempo 0,001s
     */
    @Test
    public void testGetSelectedNode() {
        System.out.println("getSelectedNode");
        ResourcesBean instance = new ResourcesBean();
        Node expResult = null;
        Node result = instance.getSelectedNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedNode method, of class ResourcesBean.
     * Tiempo 0,001s
     */
    @Test
    public void testSetSelectedNode() {
        System.out.println("setSelectedNode");
        Node selectedNode = null;
        ResourcesBean instance = new ResourcesBean();
        instance.setSelectedNode(selectedNode);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAsignaturaSeleccionada method, of class ResourcesBean.
     * Tiempo 0,001s
     */
    @Test
    public void testGetAsignaturaSeleccionada() {
        System.out.println("getAsignaturaSeleccionada");
        ResourcesBean instance = new ResourcesBean();
        Asignatura expResult = null;
        Asignatura result = instance.getAsignaturaSeleccionada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAsignaturaSeleccionada method, of class ResourcesBean.
     * Tiempo 0,001s
     */
    @Test
    public void testSetAsignaturaSeleccionada() {
        System.out.println("setAsignaturaSeleccionada");
        Asignatura asignaturaSeleccionada = null;
        ResourcesBean instance = new ResourcesBean();
        instance.setAsignaturaSeleccionada(asignaturaSeleccionada);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of handleFileUpload method, of class ResourcesBean.
     * Tiempo 0,013s
     */
    @Test(expected=ClassFormatError.class)
    public void testHandleFileUpload() {
        System.out.println("handleFileUpload");
        FileUploadEvent event = null;
        ResourcesBean instance = new ResourcesBean();
        instance.handleFileUpload(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select1Item method, of class ResourcesBean.
     * Tiempo 0,001s
     */
  @Test(expected=NullPointerException.class)
    public void testSelect1Item() {
        System.out.println("select1Item");
        ResourcesBean instance = new ResourcesBean();
        List expResult = null;
        List result = instance.select1Item();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
