/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

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
public class SettingBeanTest {
    
    public SettingBeanTest() {
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
     * Test of init method, of class SettingBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        SettingBean instance = new SettingBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAndWriteAllSubjects method, of class SettingBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testReadAndWriteAllSubjects() {
        System.out.println("readAndWriteAllSubjects");
        ActionEvent event = null;
        SettingBean instance = new SettingBean();
        instance.readAndWriteAllSubjects(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
