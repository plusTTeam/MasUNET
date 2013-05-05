/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "notificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notificacion.findAll", query = "SELECT n FROM Notificacion n"),
    @NamedQuery(name = "Notificacion.findByIdnotificacion", query = "SELECT n FROM Notificacion n WHERE n.idnotificacion = :idnotificacion"),
    @NamedQuery(name = "Notificacion.findByNombre", query = "SELECT n FROM Notificacion n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "Notificacion.findByTiempo", query = "SELECT n FROM Notificacion n WHERE n.tiempo = :tiempo")})
public class Notificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnotificacion")
    private Character idnotificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tiempo")
    private Integer tiempo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notificacionIdnotificacion", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;

    public Notificacion() {
    }

    public Notificacion(Character idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public Notificacion(Character idnotificacion, String nombre) {
        this.idnotificacion = idnotificacion;
        this.nombre = nombre;
    }

    public Character getIdnotificacion() {
        return idnotificacion;
    }

    public void setIdnotificacion(Character idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotificacion != null ? idnotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.idnotificacion == null && other.idnotificacion != null) || (this.idnotificacion != null && !this.idnotificacion.equals(other.idnotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Notificacion[ idnotificacion=" + idnotificacion + " ]";
    }
    
}
