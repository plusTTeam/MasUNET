/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "permisologia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permisologia.findAll", query = "SELECT p FROM Permisologia p"),
    @NamedQuery(name = "Permisologia.findByRolIdrol", query = "SELECT p FROM Permisologia p WHERE p.permisologiaPK.rolIdrol = :rolIdrol"),
    @NamedQuery(name = "Permisologia.findByPaginaIdpagina", query = "SELECT p FROM Permisologia p WHERE p.permisologiaPK.paginaIdpagina = :paginaIdpagina"),
    @NamedQuery(name = "Permisologia.findByPermisos", query = "SELECT p FROM Permisologia p WHERE p.permisos = :permisos")})
public class Permisologia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermisologiaPK permisologiaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permisos")
    private int permisos;
    @JoinColumn(name = "rol_idrol", referencedColumnName = "idrol", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol;
    @JoinColumn(name = "pagina_idpagina", referencedColumnName = "idpagina", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pagina pagina;

    public Permisologia() {
    }

    public Permisologia(PermisologiaPK permisologiaPK) {
        this.permisologiaPK = permisologiaPK;
    }

    public Permisologia(PermisologiaPK permisologiaPK, int permisos) {
        this.permisologiaPK = permisologiaPK;
        this.permisos = permisos;
    }

    public Permisologia(int rolIdrol, int paginaIdpagina) {
        this.permisologiaPK = new PermisologiaPK(rolIdrol, paginaIdpagina);
    }

    public PermisologiaPK getPermisologiaPK() {
        return permisologiaPK;
    }

    public void setPermisologiaPK(PermisologiaPK permisologiaPK) {
        this.permisologiaPK = permisologiaPK;
    }

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permisologiaPK != null ? permisologiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permisologia)) {
            return false;
        }
        Permisologia other = (Permisologia) object;
        if ((this.permisologiaPK == null && other.permisologiaPK != null) || (this.permisologiaPK != null && !this.permisologiaPK.equals(other.permisologiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Permisologia[ permisologiaPK=" + permisologiaPK + " ]";
    }
    
}
