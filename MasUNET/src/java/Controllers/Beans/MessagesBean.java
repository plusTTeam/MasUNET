/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author jesus
 */
@Named(value = "messagesBean")
@SessionScoped
public class MessagesBean implements Serializable{
    private String mensaje;
    /**
     * Creates a new instance of MessagesBean
     */
    public MessagesBean() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
