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
public class PermisologiaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol_idrol")
    private int rolIdrol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pagina_idpagina")
    private int paginaIdpagina;

    public PermisologiaPK() {
    }

    public PermisologiaPK(int rolIdrol, int paginaIdpagina) {
        this.rolIdrol = rolIdrol;
        this.paginaIdpagina = paginaIdpagina;
    }

    public int getRolIdrol() {
        return rolIdrol;
    }

    public void setRolIdrol(int rolIdrol) {
        this.rolIdrol = rolIdrol;
    }

    public int getPaginaIdpagina() {
        return paginaIdpagina;
    }

    public void setPaginaIdpagina(int paginaIdpagina) {
        this.paginaIdpagina = paginaIdpagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rolIdrol;
        hash += (int) paginaIdpagina;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisologiaPK)) {
            return false;
        }
        PermisologiaPK other = (PermisologiaPK) object;
        if (this.rolIdrol != other.rolIdrol) {
            return false;
        }
        if (this.paginaIdpagina != other.paginaIdpagina) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PermisologiaPK[ rolIdrol=" + rolIdrol + ", paginaIdpagina=" + paginaIdpagina + " ]";
    }
    
}
