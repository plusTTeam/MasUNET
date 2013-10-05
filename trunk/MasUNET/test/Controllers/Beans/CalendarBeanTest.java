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
import org.primefaces.event.DateSelectEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.ScheduleEntrySelectEvent;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

/**
 *
 * @author jhonangel mireles
 */
public class CalendarBeanTest {
    
    public CalendarBeanTest() {
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
     * Test of init method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testInit() {
        System.out.println("init");
        CalendarBean instance = new CalendarBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetUser() {
        System.out.println("getUser");
        CalendarBean instance = new CalendarBean();
        Usuario expResult = null;
        Usuario result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectsCurrentUser method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAllSubjectsCurrentUser() {
        System.out.println("getAllSubjectsCurrentUser");
        CalendarBean instance = new CalendarBean();
        List expResult = null;
        List result = instance.getAllSubjectsCurrentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEventsUser method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetAllEventsUser() {
        System.out.println("getAllEventsUser");
        CalendarBean instance = new CalendarBean();
        String expResult = "";
        String result = instance.getAllEventsUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventsPersonal method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetEventsPersonal() {
        System.out.println("getEventsPersonal");
        CalendarBean instance = new CalendarBean();
        String expResult = "";
        String result = instance.getEventsPersonal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventsSubject method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetEventsSubject() {
        System.out.println("getEventsSubject");
        Asignatura subject = null;
        CalendarBean instance = new CalendarBean();
        String expResult = "";
        String result = instance.getEventsSubject(subject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventModel method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetEventModel() {
        System.out.println("getEventModel");
        CalendarBean instance = new CalendarBean();
        ScheduleModel expResult = null;
        ScheduleModel result = instance.getEventModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvent method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testGetEvent() {
        System.out.println("getEvent");
        CalendarBean instance = new CalendarBean();
        ScheduleEvent expResult = null;
        ScheduleEvent result = instance.getEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvent method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testSetEvent() {
        System.out.println("setEvent");
        ScheduleEvent event = null;
        CalendarBean instance = new CalendarBean();
        instance.setEvent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEvent method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testAddEvent() {
        System.out.println("addEvent");
        CalendarBean instance = new CalendarBean();
        instance.addEvent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEvent method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testRemoveEvent() {
        System.out.println("removeEvent");
        CalendarBean instance = new CalendarBean();
        instance.removeEvent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reloadCalendar method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testReloadCalendar() {
        System.out.println("reloadCalendar");
        CalendarBean instance = new CalendarBean();
        instance.reloadCalendar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onEventSelect method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testOnEventSelect() {
        System.out.println("onEventSelect");
        ScheduleEntrySelectEvent selectEvent = null;
        CalendarBean instance = new CalendarBean();
        instance.onEventSelect(selectEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onDateSelect method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testOnDateSelect() {
        System.out.println("onDateSelect");
        DateSelectEvent selectEvent = null;
        CalendarBean instance = new CalendarBean();
        instance.onDateSelect(selectEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onEventMove method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testOnEventMove() {
        System.out.println("onEventMove");
        ScheduleEntryMoveEvent event = null;
        CalendarBean instance = new CalendarBean();
        instance.onEventMove(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onEventResize method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testOnEventResize() {
        System.out.println("onEventResize");
        ScheduleEntryResizeEvent event = null;
        CalendarBean instance = new CalendarBean();
        instance.onEventResize(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMyEvent method, of class CalendarBean.
     */
    @Test(expected=ClassFormatError.class)
    public void testIsMyEvent() {
        System.out.println("isMyEvent");
        CalendarBean instance = new CalendarBean();
        boolean expResult = false;
        boolean result = instance.isMyEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
