/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Asignatura;
import Entities.Usuario;
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
public class SubjectBeanTest {
    
    public SubjectBeanTest() {
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
     * Test of getStudentsfromSubject method, of class SubjectBean.
     */
    @Test
    public void testGetStudentsfromSubject() {
        System.out.println("getStudentsfromSubject");
        SubjectBean instance = new SubjectBean();
        List expResult = null;
        List result = instance.getStudentsfromSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectsCurrentUser method, of class SubjectBean.
     */
    @Test(expected=NullPointerException.class)
    public void testGetAllSubjectsCurrentUser() {
        System.out.println("getAllSubjectsCurrentUser");
        SubjectBean instance = new SubjectBean();
        List expResult = null;
        List result = instance.getAllSubjectsCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectSubject method, of class SubjectBean.
     */
    @Test
    public void testSelectSubject() {
        System.out.println("selectSubject");
        Asignatura subject = null;
        SubjectBean instance = new SubjectBean();
        instance.selectSubject(subject);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of saveDescriptionSubject method, of class SubjectBean.
     */
    @Test
    public void testSaveDescriptionSubject() {
        System.out.println("saveDescriptionSubject");
        SubjectBean instance = new SubjectBean();
        instance.saveDescriptionSubject();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSubject method, of class SubjectBean.
     */
  /*  @Test
    public void testGetCurrentSubject() {
        System.out.println("getCurrentSubject");
        SubjectBean instance = new SubjectBean();
        Asignatura expResult = null;
        Asignatura result = instance.getCurrentSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setCurrentSubject method, of class SubjectBean.
     */
    @Test
    public void testSetCurrentSubject() {
        System.out.println("setCurrentSubject");
        Asignatura currentSubject = null;
        SubjectBean instance = new SubjectBean();
        instance.setCurrentSubject(currentSubject);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSubjectTeacher method, of class SubjectBean.
     */
    @Test
    public void testGetCurrentSubjectTeacher() {
        System.out.println("getCurrentSubjectTeacher");
        SubjectBean instance = new SubjectBean();
        Usuario expResult = null;
        Usuario result = instance.getCurrentSubjectTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentSubjectTeacher method, of class SubjectBean.
     */
    @Test
    public void testSetCurrentSubjectTeacher() {
        System.out.println("setCurrentSubjectTeacher");
        Usuario currentSubjectTeacher = null;
        SubjectBean instance = new SubjectBean();
        instance.setCurrentSubjectTeacher(currentSubjectTeacher);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSubjectStudent method, of class SubjectBean.
     */
    @Test
    public void testGetCurrentSubjectStudent() {
        System.out.println("getCurrentSubjectStudent");
        SubjectBean instance = new SubjectBean();
        Usuario expResult = null;
        Usuario result = instance.getCurrentSubjectStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentSubjectStudent method, of class SubjectBean.
     */
    @Test
    public void testSetCurrentSubjectStudent() {
        System.out.println("setCurrentSubjectStudent");
        Usuario currentSubjectStudent = null;
        SubjectBean instance = new SubjectBean();
        instance.setCurrentSubjectStudent(currentSubjectStudent);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
