/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jesus
 */
@Embeddable
public class UserEvenPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "evento_idevento")
    private int eventoIdevento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;

    public UserEvenPK() {
    }

    public UserEvenPK(int eventoIdevento, int usuarioIdusuario) {
        this.eventoIdevento = eventoIdevento;
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getEventoIdevento() {
        return eventoIdevento;
    }

    public void setEventoIdevento(int eventoIdevento) {
        this.eventoIdevento = eventoIdevento;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) eventoIdevento;
        hash += (int) usuarioIdusuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserEvenPK)) {
            return false;
        }
        UserEvenPK other = (UserEvenPK) object;
        if (this.eventoIdevento != other.eventoIdevento) {
            return false;
        }
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UserEvenPK[ eventoIdevento=" + eventoIdevento + ", usuarioIdusuario=" + usuarioIdusuario + " ]";
    }
    
}
