/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Controllers.AbstractController;
import Entities.Asignatura;
import Entities.Mensaje;
import Entities.Usuario;
import Facades.AsignaturaFacade;
import Facades.UsuarioFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.registry.infomodel.User;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author jesus
 */
@Named(value = "messagesBean")
@SessionScoped
public class MessagesBean extends AbstractController<Mensaje> implements Serializable {

    @EJB
    private AsignaturaFacade ejbFacade_subject;
    @EJB
    private UsuarioFacade ejbFacade_student;
    private List<Asignatura> subjectsUser;
    private List<Usuario> usersSubject;
    private Asignatura subjectSelected;
    private Usuario userSelected;
    private String mensaje;

    public MessagesBean() {
        super(Mensaje.class);
        super.setSelected(new Mensaje());

    }
    public void sendMessage(){
        
    }
    public List<Usuario> completeUser(String query) {
        if (subjectSelected != null) {
            List<Usuario> users = new ArrayList<Usuario>();
            for (Usuario u : ejbFacade_student.findAllStudentsSubjectForMessage(subjectSelected.getCodMateria(), ejbFacade_student.getCurrentLapso(),ejbFacade_student.getCedulaCurrentUser(),getSubjectSelected().getSeccion())) {
                if (u.getNombre().startsWith(query)) {
                    users.add(u);
                }
            }
            return users;
        } else {
            return null;
        }
    }

    public List<Asignatura> getSubjectsUser() {
        return ejbFacade_subject.getAllSubjectsStudent(ejbFacade_student.getCedulaCurrentUser(), ejbFacade_student.getCurrentLapso());
    }

    public List<Usuario> getUsersSubject() {
        if (subjectSelected != null) {
            return ejbFacade_student.findAllStudentsSubjectForMessage(subjectSelected.getCodMateria(), ejbFacade_student.getCurrentLapso(),ejbFacade_student.getCedulaCurrentUser(),getSubjectSelected().getSeccion());
        } else {
            return null;
        }
    }

    public Usuario getUserSelected() {
        return userSelected;
    }

    public void setUserSelected(Usuario userSelected) {
        this.userSelected = userSelected;
    }

    public Asignatura getSubjectSelected() {
        return subjectSelected;
    }

    public void setSubjectSelected(Asignatura subjectSelected) {
        this.subjectSelected = subjectSelected;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
