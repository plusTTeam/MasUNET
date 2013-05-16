/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Notificacion;
import Entities.Usuario;
import Entities.VistaCeti;
import Entities.VistaControlEstudiante;
import Entities.VistaControlProfesor;
import Facades.NotificacionFacade;
import Facades.ParametroFacade;
import Facades.RolFacade;
import Facades.UsuarioFacade;
import Facades.VistaCetiFacade;
import Facades.VistaControlEstudianteFacade;
import Facades.VistaControlProfesorFacade;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jesus
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private boolean isLoggedIn;
    private boolean isAdmin;
    private boolean isTeacher;
    private boolean isStudent;
    private VistaCeti user_ceti;
    private ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
    private HttpSession sesion = (HttpSession) ex.getSession(true);
    private Usuario user;
    @EJB
    private VistaCetiFacade ejbFacade;
    @EJB
    private UsuarioFacade ejbFacade_usuario;
    @EJB
    private VistaControlEstudianteFacade ejbFacade_control_estudiante;
    @EJB
    private VistaControlProfesorFacade ejbFacade_control_profesor;
    @EJB
    private RolFacade ejbFacade_rol;
    @EJB
    private NotificacionFacade ejbFacade_notificacion;
    @EJB
    private ParametroFacade ejbFacade_parametro;
    private FacesContext ctx = FacesContext.getCurrentInstance();
    private String path = ctx.getExternalContext().getRequestContextPath();

    public LoginBean() {
    }

    public String login() {
        if (!username.isEmpty() & !password.isEmpty()) {
            user_ceti = ejbFacade.FindUserAndPass(username, password);
            if (user_ceti != null) {
                user = ejbFacade_usuario.FindbyUsuario(username);
                if (user == null) {
                    user = new Usuario();
                    if (user_ceti.getRol() == 1) {
                        VistaControlEstudiante aux = ejbFacade_control_estudiante.FindbyCedula(user_ceti.getCedula());
                        if (aux == null) {
                            FacesContext.getCurrentInstance().addMessage("Login", new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("ErrorUserandPassword")));
                            return "index.xhtml";
                        } else {
                            user.setCedula(user_ceti.getCedula());
                            user.setRolIdrol(ejbFacade_rol.find(2));
                            user.setNombre(aux.getNombres() + " " + aux.getApellidos());
                            user.setUsuario(username);
                            user.setNotificacionIdnotificacion(ejbFacade_notificacion.find('I'));
                            user.setAlias(aux.getNombres() + " " + aux.getApellidos());
                            user.setOnline(true);
                            user.setUltimaConexion(new Date());
                            ejbFacade_usuario.create(user);
                        }
                    } else {
                        VistaControlProfesor aux = ejbFacade_control_profesor.FindbyCedula(user_ceti.getCedula());
                        if (aux == null) {
                            FacesContext.getCurrentInstance().addMessage("Login", new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("ErrorUserandPassword")));
                            return "index.xhtml";
                        } else {
                            user.setCedula(user_ceti.getCedula());
                            user.setRolIdrol(ejbFacade_rol.find(3));
                            user.setNombre(aux.getNombres() + " " + aux.getApellidos());
                            user.setUsuario(username);
                            user.setNotificacionIdnotificacion(ejbFacade_notificacion.find('I'));
                            user.setAlias(aux.getNombres() + " " + aux.getApellidos());
                            user.setOnline(true);
                            user.setUltimaConexion(new Date());
                            ejbFacade_usuario.create(user);
                        }
                    }
                    isLoggedIn = true;
                    return "home.xhtml";
                }

                if (user.getRolIdrol().getNombre().equals("Administrador")) {
                    isAdmin = true;
                } else if (user.getRolIdrol().getNombre().equals("Profesor")) {
                    isTeacher = true;
                } else {
                    isStudent = true;
                }
                String lapso = ejbFacade_parametro.findByNombre("Lapso");
                if(lapso!=null) {
                    sesion.setAttribute("lapso",lapso);
                }
                sesion.setAttribute("id", user.getIdusuario());
                sesion.setAttribute("cedula", user.getCedula());
                sesion.setAttribute("nombre", user.getNombre());
                sesion.setAttribute("foto", user.getFotoUrl());
                sesion.setAttribute("email", user.getEmail());
                sesion.setAttribute("alias", user.getAlias());
                sesion.setAttribute("rol", user.getRolIdrol().getNombre());
                sesion.setAttribute("idrol", user.getRolIdrol().getIdrol());
                isLoggedIn = true;
                return "home.xhtml";
            } else {
                //set the message to display when authentication fails  
                FacesContext.getCurrentInstance().addMessage("Login", new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("InvalidUserandPassword")));
                return "index.xhtml";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage("Login", new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("TypeUserandPassword")));
            return null;
        }
    }
    public void logout() {
        isLoggedIn = false;
        isAdmin = false;
        isStudent = false;
        isTeacher = false;
        FacesContext context = FacesContext.getCurrentInstance();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        try {
            context.getExternalContext().redirect(path);
        } catch (IOException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * An event listener for redirecting the user to login page if he/she is not
     * currently logged in
     *
     * @param event
     */
    public void verifyUseLogin(ComponentSystemEvent event) {
        if (!isLoggedIn) {
            doRedirect(path);
        }
    }

    /**
     * Method for redirecting a request
     *
     * @param url
     */
    private void doRedirect(String url) {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().redirect(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public boolean isIsTeacher() {
        return isTeacher;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
