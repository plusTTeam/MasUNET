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
@Table(name = "vista_asignatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VistaAsignatura.findAll", query = "SELECT v FROM VistaAsignatura v"),
    @NamedQuery(name = "VistaAsignatura.findByIdAsignaturas", query = "SELECT v FROM VistaAsignatura v WHERE v.idAsignaturas = :idAsignaturas"),
    @NamedQuery(name = "VistaAsignatura.findByCodMateria", query = "SELECT v FROM VistaAsignatura v WHERE v.codMateria = :codMateria"),
    @NamedQuery(name = "VistaAsignatura.findBySeccion", query = "SELECT v FROM VistaAsignatura v WHERE v.seccion = :seccion"),
    @NamedQuery(name = "VistaAsignatura.findByNombre", query = "SELECT v FROM VistaAsignatura v WHERE v.nombre = :nombre")})
public class VistaAsignatura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_asignaturas")
    private Integer idAsignaturas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cod_materia")
    private String codMateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seccion")
    private int seccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;

    public VistaAsignatura() {
    }

    public VistaAsignatura(Integer idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
    }

    public VistaAsignatura(Integer idAsignaturas, String codMateria, int seccion, String nombre) {
        this.idAsignaturas = idAsignaturas;
        this.codMateria = codMateria;
        this.seccion = seccion;
        this.nombre = nombre;
    }

    public Integer getIdAsignaturas() {
        return idAsignaturas;
    }

    public void setIdAsignaturas(Integer idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignaturas != null ? idAsignaturas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VistaAsignatura)) {
            return false;
        }
        VistaAsignatura other = (VistaAsignatura) object;
        if ((this.idAsignaturas == null && other.idAsignaturas != null) || (this.idAsignaturas != null && !this.idAsignaturas.equals(other.idAsignaturas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.VistaAsignatura[ idAsignaturas=" + idAsignaturas + " ]";
    }
    
}
