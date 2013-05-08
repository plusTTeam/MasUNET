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
@Table(name = "vista_control_profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VistaControlProfesor.findAll", query = "SELECT v FROM VistaControlProfesor v"),
    @NamedQuery(name = "VistaControlProfesor.findByIdControlProfesor", query = "SELECT v FROM VistaControlProfesor v WHERE v.idControlProfesor = :idControlProfesor"),
    @NamedQuery(name = "VistaControlProfesor.findByCedula", query = "SELECT v FROM VistaControlProfesor v WHERE v.cedula = :cedula"),
    @NamedQuery(name = "VistaControlProfesor.findByNombres", query = "SELECT v FROM VistaControlProfesor v WHERE v.nombres = :nombres"),
    @NamedQuery(name = "VistaControlProfesor.findByApellidos", query = "SELECT v FROM VistaControlProfesor v WHERE v.apellidos = :apellidos"),
    @NamedQuery(name = "VistaControlProfesor.findByCorreo", query = "SELECT v FROM VistaControlProfesor v WHERE v.correo = :correo"),
    @NamedQuery(name = "VistaControlProfesor.findByCodMateria", query = "SELECT v FROM VistaControlProfesor v WHERE v.codMateria = :codMateria"),
    @NamedQuery(name = "VistaControlProfesor.findBySeccion", query = "SELECT v FROM VistaControlProfesor v WHERE v.seccion = :seccion"),
    @NamedQuery(name = "VistaControlProfesor.findByLapso", query = "SELECT v FROM VistaControlProfesor v WHERE v.lapso = :lapso")})
public class VistaControlProfesor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_control_profesor")
    private Integer idControlProfesor;
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

    public VistaControlProfesor() {
    }

    public VistaControlProfesor(Integer idControlProfesor) {
        this.idControlProfesor = idControlProfesor;
    }

    public VistaControlProfesor(Integer idControlProfesor, String cedula, String nombres, String apellidos, String correo, String codMateria, int seccion, String lapso) {
        this.idControlProfesor = idControlProfesor;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.codMateria = codMateria;
        this.seccion = seccion;
        this.lapso = lapso;
    }

    public Integer getIdControlProfesor() {
        return idControlProfesor;
    }

    public void setIdControlProfesor(Integer idControlProfesor) {
        this.idControlProfesor = idControlProfesor;
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
        hash += (idControlProfesor != null ? idControlProfesor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VistaControlProfesor)) {
            return false;
        }
        VistaControlProfesor other = (VistaControlProfesor) object;
        if ((this.idControlProfesor == null && other.idControlProfesor != null) || (this.idControlProfesor != null && !this.idControlProfesor.equals(other.idControlProfesor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.VistaControlProfesor[ idControlProfesor=" + idControlProfesor + " ]";
    }
    
}
