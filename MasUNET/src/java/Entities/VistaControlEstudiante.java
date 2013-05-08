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
@Table(name = "vista_control_estudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VistaControlEstudiante.findAll", query = "SELECT v FROM VistaControlEstudiante v"),
    @NamedQuery(name = "VistaControlEstudiante.findByIdControlEstudiante", query = "SELECT v FROM VistaControlEstudiante v WHERE v.idControlEstudiante = :idControlEstudiante"),
    @NamedQuery(name = "VistaControlEstudiante.findByCedula", query = "SELECT v FROM VistaControlEstudiante v WHERE v.cedula = :cedula"),
    @NamedQuery(name = "VistaControlEstudiante.findByNombres", query = "SELECT v FROM VistaControlEstudiante v WHERE v.nombres = :nombres"),
    @NamedQuery(name = "VistaControlEstudiante.findByApellidos", query = "SELECT v FROM VistaControlEstudiante v WHERE v.apellidos = :apellidos"),
    @NamedQuery(name = "VistaControlEstudiante.findByCorreo", query = "SELECT v FROM VistaControlEstudiante v WHERE v.correo = :correo"),
    @NamedQuery(name = "VistaControlEstudiante.findByCarrera", query = "SELECT v FROM VistaControlEstudiante v WHERE v.carrera = :carrera"),
    @NamedQuery(name = "VistaControlEstudiante.findByCodMateria", query = "SELECT v FROM VistaControlEstudiante v WHERE v.codMateria = :codMateria"),
    @NamedQuery(name = "VistaControlEstudiante.findBySeccion", query = "SELECT v FROM VistaControlEstudiante v WHERE v.seccion = :seccion"),
    @NamedQuery(name = "VistaControlEstudiante.findByLapso", query = "SELECT v FROM VistaControlEstudiante v WHERE v.lapso = :lapso")})
public class VistaControlEstudiante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_control_estudiante")
    private Integer idControlEstudiante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "carrera")
    private String carrera;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cod_materia")
    private String codMateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seccion")
    private int seccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lapso")
    private String lapso;

    public VistaControlEstudiante() {
    }

    public VistaControlEstudiante(Integer idControlEstudiante) {
        this.idControlEstudiante = idControlEstudiante;
    }

    public VistaControlEstudiante(Integer idControlEstudiante, String cedula, String nombres, String apellidos, String correo, String carrera, String codMateria, int seccion, String lapso) {
        this.idControlEstudiante = idControlEstudiante;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.carrera = carrera;
        this.codMateria = codMateria;
        this.seccion = seccion;
        this.lapso = lapso;
    }

    public Integer getIdControlEstudiante() {
        return idControlEstudiante;
    }

    public void setIdControlEstudiante(Integer idControlEstudiante) {
        this.idControlEstudiante = idControlEstudiante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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

    public String getLapso() {
        return lapso;
    }

    public void setLapso(String lapso) {
        this.lapso = lapso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idControlEstudiante != null ? idControlEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VistaControlEstudiante)) {
            return false;
        }
        VistaControlEstudiante other = (VistaControlEstudiante) object;
        if ((this.idControlEstudiante == null && other.idControlEstudiante != null) || (this.idControlEstudiante != null && !this.idControlEstudiante.equals(other.idControlEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.VistaControlEstudiante[ idControlEstudiante=" + idControlEstudiante + " ]";
    }
    
}
