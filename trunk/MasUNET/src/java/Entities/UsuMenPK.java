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
public class UsuMenPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mensaje_idmensaje")
    private int mensajeIdmensaje;

    public UsuMenPK() {
    }

    public UsuMenPK(int usuarioIdusuario, int mensajeIdmensaje) {
        this.usuarioIdusuario = usuarioIdusuario;
        this.mensajeIdmensaje = mensajeIdmensaje;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getMensajeIdmensaje() {
        return mensajeIdmensaje;
    }

    public void setMensajeIdmensaje(int mensajeIdmensaje) {
        this.mensajeIdmensaje = mensajeIdmensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usuarioIdusuario;
        hash += (int) mensajeIdmensaje;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuMenPK)) {
            return false;
        }
        UsuMenPK other = (UsuMenPK) object;
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        if (this.mensajeIdmensaje != other.mensajeIdmensaje) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UsuMenPK[ usuarioIdusuario=" + usuarioIdusuario + ", mensajeIdmensaje=" + mensajeIdmensaje + " ]";
    }
    
}
