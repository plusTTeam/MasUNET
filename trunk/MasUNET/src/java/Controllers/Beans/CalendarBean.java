/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Controllers.AbstractController;
import Entities.Asignatura;
import Entities.Evento;
import Entities.Usuario;
import Facades.AsignaturaFacade;
import Facades.EventoFacade;
import Facades.UsuarioFacade;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.DateSelectEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.ScheduleEntrySelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

/**
 *
 * @author jesus
 */
@Named(value = "calendarBean")
@SessionScoped
public class CalendarBean extends AbstractController<Evento> implements Serializable {

    @EJB
    private UsuarioFacade ejbFacade_Usuario;
    @EJB
    private EventoFacade ejbFacade_Evento;
    @EJB
    private AsignaturaFacade ejbFacade_Asignatura;
    private Usuario user;
    private static ScheduleModel eventModel;
    private ScheduleEvent event;
    private int _case;
    private Asignatura currentsubject;

    /**
     * Creates a new instance of CalendarBean
     */
    public CalendarBean() {
        super(Evento.class);
        super.setSelected(new Evento());
        eventModel = new DefaultScheduleModel();
        eventModel.clear();
        event = new DefaultScheduleEvent();
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade_Evento);
        super.setSelected(new Evento());
        getAllEventsUser();
    }

    public Usuario getUser() {
        user = ejbFacade_Usuario.find(ejbFacade_Usuario.getIdCurrentUser());
        return user;
    }

    public List<Asignatura> getAllSubjectsCurrentUser() {
        if (ejbFacade_Asignatura.getRolIdCurrentUser() == 2) {
            return ejbFacade_Asignatura.getAllSubjectsStudent(ejbFacade_Asignatura.getCedulaCurrentUser(), ejbFacade_Asignatura.getCurrentLapso());
        } else {
            return ejbFacade_Asignatura.getAllSubjectsTeacher(ejbFacade_Asignatura.getCedulaCurrentUser(), ejbFacade_Asignatura.getCurrentLapso());
        }
    }

    public String getAllEventsUser() {
        _case = 0;
        eventModel.clear();
        List<Evento> items = ejbFacade_Evento.getAllEventsStudent(getUser(), ejbFacade_Evento.getCedulaCurrentUser());
        if (items != null && items.size() > 0) {
            for (Evento item : items) {
                DefaultScheduleEvent eve = new DefaultScheduleEvent(item.getNombre(), item.getFechaIni(), item.getFechaFin(), item.getTododia());
                eve.setData(item);
                eventModel.addEvent(eve);
            }
        }
        return null;
    }

    public String getEventsPersonal() {
        _case = 1;
        eventModel.clear();
        List<Evento> aux = ejbFacade_Evento.getAllEventsPersonal(ejbFacade_Usuario.getIdCurrentUser());
        if (aux != null && aux.size() > 0) {
            for (Evento item : aux) {
                DefaultScheduleEvent eve = new DefaultScheduleEvent(item.getNombre(), item.getFechaIni(), item.getFechaFin(), item);
                eve.setAllDay(item.getTododia());
                eventModel.addEvent(eve);
            }
        }
        return null;
    }

    public String getEventsSubject(Asignatura subject) {
        _case = 3;
        currentsubject = subject;
        eventModel.clear();
        List<Evento> aux = ejbFacade_Evento.getAllEventsSubject(subject.getIdasignatura());
        if (aux != null && aux.size() > 0) {
            for (Evento item : aux) {
                DefaultScheduleEvent eve = new DefaultScheduleEvent(item.getNombre(), item.getFechaIni(), item.getFechaFin(), item.getTododia());
                eve.setData(item);
                eventModel.addEvent(eve);
            }
        }
        return null;
    }

    public ScheduleModel getEventModel() {
        return eventModel;
    }

    public ScheduleEvent getEvent() {
        return event;
    }

    public void setEvent(ScheduleEvent event) {
        this.event = event;
    }

    public void addEvent() {

        if (super.getSelected().getIdevento() == null) {
            super.getSelected().setFechaCreacion(new Date());
            super.getSelected().setUsuarioIdusuario(getLoggedUser());
            try {
                if (currentsubject != null && ejbFacade_Usuario.getRolIdCurrentUser().equals(3)) {
                    super.getSelected().setAsignaturaIdasignatura(currentsubject);
                }
                super.saveNew(null);
                reloadCalendar();
                addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("EventoCreated")));
            } catch (Exception e) {
                addMessage(new FacesMessage(e.getMessage()));
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, e);
            }

        } else if (validateEvent()) {
            try {
                ejbFacade_Evento.edit(super.getSelected());
                reloadCalendar();
                addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("EventoUpdated")));
                //addMessage(new FacesMessage("Update Event " + super.getSelected().getNombre()));
            } catch (Exception e) {
                 addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured")));
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
             addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured")));
        }
        super.setSelected(new Evento());
    }

    public void removeEvent() {
        if (super.getSelected().getIdevento() != null && validateEvent()) {
            ejbFacade_Evento.remove(super.getSelected());
            reloadCalendar();
            addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("EventoUpdated")));
        } else {
            addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("CalendarDialogRemoveEventoPermitMessage")));

        }
    }

    public void reloadCalendar() {
        super.setSelected(new Evento());
        if (eventModel != null) {
            eventModel.clear();
            if (_case == 0) {
                getAllEventsUser();
                currentsubject = null;
            } else if (_case == 1) {
                getEventsPersonal();
                currentsubject = null;
            } else {
                if (currentsubject != null) {
                    getEventsSubject(currentsubject);
                }
            }
        }
    }

    public void onEventSelect(ScheduleEntrySelectEvent selectEvent) {
        event = selectEvent.getScheduleEvent();
        super.setSelected((Evento) event.getData());
    }

    public void onDateSelect(DateSelectEvent selectEvent) {
        super.setSelected(new Evento());
        super.getSelected().setFechaFin(selectEvent.getDate());
        super.getSelected().setFechaIni(selectEvent.getDate());
    }

    public void onEventMove(ScheduleEntryMoveEvent event) {
        super.setSelected((Evento) event.getScheduleEvent().getData());
        if (validateEvent()) {
            super.getSelected().setFechaIni(event.getScheduleEvent().getStartDate());
            super.getSelected().setFechaFin(event.getScheduleEvent().getEndDate());
            ejbFacade_Evento.edit(super.getSelected());
            addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("EventoUpdated")));
        } else {
            addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("CalendarDialogMovedEventoPermitMessage")));
        }
        reloadCalendar();
    }

    public void onEventResize(ScheduleEntryResizeEvent event) {
        super.setSelected((Evento) event.getScheduleEvent().getData());
        if (validateEvent()) {
            super.getSelected().setFechaIni(event.getScheduleEvent().getStartDate());
            super.getSelected().setFechaFin(event.getScheduleEvent().getEndDate());
            ejbFacade_Evento.edit(super.getSelected());
            addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("EventoUpdated")));
        } else {
            addMessage(new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("CalendarDialogResizeEventoPermitMessage")));
        }
        reloadCalendar();
    }

    

    private boolean validateEvent() {
        if (ejbFacade_Usuario.getRolIdCurrentUser() == 1) {
            return true;
        } else if (super.getSelected().getUsuarioIdusuario().getIdusuario() == ejbFacade_Usuario.getIdCurrentUser()) {
            return true;
        }
        return false;
    }

    public boolean isMyEvent() {
        if (super.getSelected() != null) {
            if (super.getSelected().getUsuarioIdusuario() != null && currentsubject != null && super.getSelected().getUsuarioIdusuario().getRolIdrol().equals(2)) {
                return false;
            } else if (super.getSelected().getUsuarioIdusuario() == null || super.getSelected().getUsuarioIdusuario().getIdusuario() == ejbFacade_Usuario.getIdCurrentUser()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
