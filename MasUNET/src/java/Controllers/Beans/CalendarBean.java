/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import Entities.Usuario;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author jesus
 */
@Named(value = "calendarBean")
@ApplicationScoped
public class CalendarBean {

    @ManagedProperty(value="#{loginBean.user}")
    private Usuario user;
    /**
     * Creates a new instance of CalendarBean
     */ 
    public CalendarBean() {
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
}
