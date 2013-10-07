/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Asignatura;
import Entities.Usuario;
import Facades.AsignaturaFacade;
import Facades.UsuarioFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author jesus
 */
@Named(value = "subjectBean")
@SessionScoped
public class SubjectBean implements Serializable {

    /**
     * Creates a new instance of SubjectBean
     */
    private Asignatura currentSubject;
    private Usuario currentSubjectTeacher;
    private Usuario currentSubjectStudent;
    @EJB
    private AsignaturaFacade ejbfacade_asignatura;
    @EJB
    private UsuarioFacade ejbfacade_usuario;

    public SubjectBean() {
        currentSubject = new Asignatura();

    }

    public List<Usuario> getStudentsfromSubject() {
        try {
            return ejbfacade_usuario.findAllStudentsSubject(currentSubject.getCodMateria(), ejbfacade_asignatura.getCurrentLapso(), currentSubject.getSeccion());
        } catch (Exception e) {
            return null;
        }

    }

    public List<Asignatura> getAllSubjectsCurrentUser() {
        if (ejbfacade_asignatura.getRolIdCurrentUser() == 2) {
            return ejbfacade_asignatura.getAllSubjectsStudent(ejbfacade_asignatura.getCedulaCurrentUser(), ejbfacade_asignatura.getCurrentLapso());
        } else {
            return ejbfacade_asignatura.getAllSubjectsTeacher(ejbfacade_asignatura.getCedulaCurrentUser(), ejbfacade_asignatura.getCurrentLapso());
        }
    }

    public void selectSubject(Asignatura subject) {
        currentSubject = subject;
        if (currentSubject != null) {
            currentSubjectTeacher = ejbfacade_usuario.findTheacherSubject(currentSubject.getCodMateria(), ejbfacade_asignatura.getCurrentLapso(), currentSubject.getSeccion());
        }

    }

    public void saveDescriptionSubject() {
        if (currentSubject != null && currentSubject.getIdasignatura() != null) {

            ejbfacade_asignatura.edit(currentSubject);
            addMessage(new FacesMessage("Asignatura Updated", currentSubject.getNombre() + "updated"));
        }
    }

    public boolean validateTeacher() {
        if (currentSubject != null) {
            if (ejbfacade_usuario.getRolIdCurrentUser() == 1 || ejbfacade_usuario.getRolIdCurrentUser() == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean showTabContent() {
        if (currentSubject != null && currentSubject.getCodMateria() != null) {
            return true;
        } else {
            return false;
        }
    }

    public Asignatura getCurrentSubject() {
        return currentSubject;
    }

    public void setCurrentSubject(Asignatura currentSubject) {
        this.currentSubject = currentSubject;
    }

    public Usuario getCurrentSubjectTeacher() {
        return currentSubjectTeacher;
    }

    public void setCurrentSubjectTeacher(Usuario currentSubjectTeacher) {
        this.currentSubjectTeacher = currentSubjectTeacher;
    }

    public Usuario getCurrentSubjectStudent() {
        return currentSubjectStudent;
    }

    public void setCurrentSubjectStudent(Usuario currentSubjectStudent) {
        this.currentSubjectStudent = currentSubjectStudent;
    }

    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(ejbfacade_asignatura.getIdCurrentUser().toString(), message);
    }
}
