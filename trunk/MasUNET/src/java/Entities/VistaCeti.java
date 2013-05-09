/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "vista_ceti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VistaCeti.findAll", query = "SELECT v FROM VistaCeti v"),
    @NamedQuery(name = "VistaCeti.findByIdCeti", query = "SELECT v FROM VistaCeti v WHERE v.idCeti = :idCeti"),
    @NamedQuery(name = "VistaCeti.findByCedula", query = "SELECT v FROM VistaCeti v WHERE v.cedula = :cedula"),
    @NamedQuery(name = "VistaCeti.findByUsuario", query = "SELECT v FROM VistaCeti v WHERE v.usuario = :usuario"),
    @NamedQuery(name = "VistaCeti.findByClave", query = "SELECT v FROM VistaCeti v WHERE v.clave = :clave"),
    @NamedQuery(name = "VistaCeti.findByUsuarioandPass", query = "SELECT v FROM VistaCeti v WHERE v.usuario = :usuario and v.clave = :clave"),
    @NamedQuery(name = "VistaCeti.findByRol", query = "SELECT v FROM VistaCeti v WHERE v.rol = :rol")})
public class VistaCeti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ceti")
    private Integer idCeti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol")
    private int rol;

    public VistaCeti() {
    }

    public VistaCeti(Integer idCeti) {
        this.idCeti = idCeti;
    }

    public VistaCeti(Integer idCeti, String cedula, String usuario, String clave, int rol) {
        this.idCeti = idCeti;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public Integer getIdCeti() {
        return idCeti;
    }

    public void setIdCeti(Integer idCeti) {
        this.idCeti = idCeti;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCeti != null ? idCeti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VistaCeti)) {
            return false;
        }
        VistaCeti other = (VistaCeti) object;
        if ((this.idCeti == null && other.idCeti != null) || (this.idCeti != null && !this.idCeti.equals(other.idCeti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.VistaCeti[ idCeti=" + idCeti + " ]";
    }
    
}
