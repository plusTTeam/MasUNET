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
public class ValoracionPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurso_idrecurso")
    private int recursoIdrecurso;

    public ValoracionPK() {
    }

    public ValoracionPK(int usuarioIdusuario, int recursoIdrecurso) {
        this.usuarioIdusuario = usuarioIdusuario;
        this.recursoIdrecurso = recursoIdrecurso;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getRecursoIdrecurso() {
        return recursoIdrecurso;
    }

    public void setRecursoIdrecurso(int recursoIdrecurso) {
        this.recursoIdrecurso = recursoIdrecurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usuarioIdusuario;
        hash += (int) recursoIdrecurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValoracionPK)) {
            return false;
        }
        ValoracionPK other = (ValoracionPK) object;
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        if (this.recursoIdrecurso != other.recursoIdrecurso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ValoracionPK[ usuarioIdusuario=" + usuarioIdusuario + ", recursoIdrecurso=" + recursoIdrecurso + " ]";
    }
    
}
