/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Controllers.AbstractController;
import Entities.Asignatura;
import Entities.Mensaje;
import Entities.UsuMen;
import Entities.UsuMenPK;
import Entities.Usuario;
import Facades.AsignaturaFacade;
import Facades.MensajeFacade;
import Facades.UsuMenFacade;
import Facades.UsuarioFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

/**
 *
 * @author jesus
 */
@Named(value = "messagesBean")
@SessionScoped
public class MessagesBean extends AbstractController<Mensaje> implements Serializable {

    @EJB
    private MensajeFacade ejbFacade;
    @EJB
    private AsignaturaFacade ejbFacade_subject;
    @EJB
    private UsuarioFacade ejbFacade_student;
    @EJB
    private UsuMenFacade ejbFacade_usumen;
    private List<Asignatura> subjectsUser;
    private List<Usuario> usersSubject;
    private Asignatura subjectSelected;
    private Usuario userSelected;
    private List<Usuario> usersAutoComplete;
    private UsuMen usermessage;

    public MessagesBean() {
        super(Mensaje.class);
        if(getSelected()==null) {
            prepareCreate(null);
        }
        usermessage = new UsuMen();
    }

    public List<Mensaje> getAllMessageUSer() {
        if (userSelected != null) {
            return ejbFacade.getMessageUser(ejbFacade.getIdCurrentUser(), userSelected.getIdusuario());
        } else {
            return null;
        }
    }
    public boolean validateMessage(int userId){
        if(userId==ejbFacade.getIdCurrentUser()) {
            return true;
        }
        else {
            return false;
        }
    }
    public void send(ActionEvent event){
        if (userSelected != null) {
            if (!getSelected().getMensaje().isEmpty()) {
                getSelected().setFecha(new Date());
                getSelected().setIdusuario(ejbFacade_student.find(ejbFacade.getIdCurrentUser()));
                ejbFacade.create(super.getSelected());
                usermessage.setUsuMenPK(new UsuMenPK(userSelected.getIdusuario(), ejbFacade.getIdLastMessage()));
                usermessage.setEstado('E');
                ejbFacade_usumen.create(usermessage);
                prepareCreate(null);                
                usermessage = new UsuMen();
                //FacesContext.getCurrentInstance().addMessage(getFacade().getIdCurrentUser().toString(), new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje Enviado", "Tu mensaje a sido enviado correctamente"));
                
            } else {
                FacesContext.getCurrentInstance().addMessage(getFacade().getIdCurrentUser().toString(), new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje Vacio", "Tu mensaje debe tener texto"));
                
            }
        } else {
            addMessageInfo("Selecciona un Usuario", "Es necesario seleccionar un usuario para poder enviar un mensaje");
        }
    }

    public List<Usuario> completeUser(String query) {
            usersAutoComplete = new ArrayList<Usuario>();
            for (Usuario u : ejbFacade_student.findAll()) {
                if (u.getNombre().toLowerCase().contains(query.toLowerCase())) {
                    usersAutoComplete.add(u);
                }
            }
            return usersAutoComplete;
    }
    public void loadUsers() {
        if (subjectSelected != null) {
            usersSubject = ejbFacade_student.findAllStudentsSubjectForMessage(subjectSelected.getCodMateria(), ejbFacade_student.getCurrentLapso(), ejbFacade_student.getCedulaCurrentUser(), getSubjectSelected().getSeccion());

        }
    }

    public List<Asignatura> getSubjectsUser() {
        return ejbFacade_subject.getAllSubjectsStudent(ejbFacade_student.getCedulaCurrentUser(), ejbFacade_student.getCurrentLapso());
    }

    public List<Usuario> getUsersSubject() {
        loadUsers();
        return usersSubject;
    }

    public Usuario getUserSelected() {
        return userSelected;
    }

    public void setUserSelected(Usuario userSelected) {
        if(userSelected!=null) {
            this.userSelected = userSelected;
        }
    }

    public Asignatura getSubjectSelected() {
        return subjectSelected;
    }

    public void setSubjectSelected(Asignatura subjectSelected) {
        this.subjectSelected = subjectSelected;
    }
}
