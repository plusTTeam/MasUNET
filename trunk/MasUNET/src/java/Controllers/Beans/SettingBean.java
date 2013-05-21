/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Controllers.AbstractController;
import Entities.Asignatura;
import Entities.Usuario;
import Entities.VistaAsignatura;
import Facades.AsignaturaFacade;
import Facades.ParametroFacade;
import Facades.UsuarioFacade;
import Facades.VistaAsignaturaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

/**
 *
 * @author Jesus Lugo ;)
 */
@Named(value = "settingBean")
@RequestScoped
public class SettingBean extends AbstractController<Usuario> implements Serializable {

    @EJB
    private UsuarioFacade ejbFacade;
    @EJB
    private AsignaturaFacade ejbFacade_Asignatura;
    @EJB
    private VistaAsignaturaFacade ejbFacade_VistaAsignatura;
    @EJB
    private ParametroFacade ejbFacade_Parametro;

    /**
     * Creates a new instance of SettingBean
     */
    public SettingBean() {
        super(Usuario.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
        super.setSelected(ejbFacade.find(ejbFacade.getIdCurrentUser()));
    }

    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(ejbFacade.getIdCurrentUser().toString(), message);
    }

    public void readAndWriteAllSubjects(ActionEvent event) {
        try {
            if (ejbFacade.getRolIdCurrentUser() == 1) {
                for (Asignatura item : ejbFacade_Asignatura.findAll()) {
                    ejbFacade_Asignatura.remove(item);
                }
                for (VistaAsignatura view : ejbFacade_VistaAsignatura.findAll()) {
                    Asignatura aux = new Asignatura();
                    aux.setCodMateria(view.getCodMateria());
                    aux.setNombre(view.getNombre());
                    aux.setSeccion(view.getSeccion());
                    aux.setProfesor(ejbFacade_Asignatura.findNameTeacherSubject(view.getCodMateria(), ejbFacade_Parametro.findByNombre("Lapso")));
                    ejbFacade_Asignatura.create(aux);
                }
                addMessage(new FacesMessage("Proceso Realizado con Exito! ;)"));
            }

        } catch (Exception e) {
            addMessage(new FacesMessage("Error en el Proceso! :(", e.getMessage()));
        }
    }
}
