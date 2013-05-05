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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tipo_recurso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoRecurso.findAll", query = "SELECT t FROM TipoRecurso t"),
    @NamedQuery(name = "TipoRecurso.findByIdTiporecurso", query = "SELECT t FROM TipoRecurso t WHERE t.idTiporecurso = :idTiporecurso"),
    @NamedQuery(name = "TipoRecurso.findByNombre", query = "SELECT t FROM TipoRecurso t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoRecurso.findByExtension", query = "SELECT t FROM TipoRecurso t WHERE t.extension = :extension")})
public class TipoRecurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipo_recurso")
    private Integer idTiporecurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "extension")
    private String extension;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTiporecurso", fetch = FetchType.LAZY)
    private List<Recurso> recursoList;

    public TipoRecurso() {
    }

    public TipoRecurso(Integer idTiporecurso) {
        this.idTiporecurso = idTiporecurso;
    }

    public TipoRecurso(Integer idTiporecurso, String nombre, String extension) {
        this.idTiporecurso = idTiporecurso;
        this.nombre = nombre;
        this.extension = extension;
    }

    public Integer getIdTiporecurso() {
        return idTiporecurso;
    }

    public void setIdTiporecurso(Integer idTiporecurso) {
        this.idTiporecurso = idTiporecurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @XmlTransient
    public List<Recurso> getRecursoList() {
        return recursoList;
    }

    public void setRecursoList(List<Recurso> recursoList) {
        this.recursoList = recursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTiporecurso != null ? idTiporecurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRecurso)) {
            return false;
        }
        TipoRecurso other = (TipoRecurso) object;
        if ((this.idTiporecurso == null && other.idTiporecurso != null) || (this.idTiporecurso != null && !this.idTiporecurso.equals(other.idTiporecurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.TipoRecurso[ idTiporecurso=" + idTiporecurso + " ]";
    }
    
}
