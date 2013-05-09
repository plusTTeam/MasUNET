/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "valoracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valoracion.findAll", query = "SELECT v FROM Valoracion v"),
    @NamedQuery(name = "Valoracion.findByUsuarioIdusuario", query = "SELECT v FROM Valoracion v WHERE v.valoracionPK.usuarioIdusuario = :usuarioIdusuario"),
    @NamedQuery(name = "Valoracion.findByRecursoIdrecurso", query = "SELECT v FROM Valoracion v WHERE v.valoracionPK.recursoIdrecurso = :recursoIdrecurso"),
    @NamedQuery(name = "Valoracion.findByCalificacion", query = "SELECT v FROM Valoracion v WHERE v.calificacion = :calificacion"),
    @NamedQuery(name = "Valoracion.findByComentario", query = "SELECT v FROM Valoracion v WHERE v.comentario = :comentario"),
    @NamedQuery(name = "Valoracion.findByFecha", query = "SELECT v FROM Valoracion v WHERE v.fecha = :fecha")})
public class Valoracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ValoracionPK valoracionPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calificacion")
    private float calificacion;
    @Size(max = 500)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;
    @JoinColumn(name = "recurso_idrecurso", referencedColumnName = "idrecurso", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Recurso recurso;

    public Valoracion() {
    }

    public Valoracion(ValoracionPK valoracionPK) {
        this.valoracionPK = valoracionPK;
    }

    public Valoracion(ValoracionPK valoracionPK, float calificacion, Date fecha) {
        this.valoracionPK = valoracionPK;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    public Valoracion(int usuarioIdusuario, int recursoIdrecurso) {
        this.valoracionPK = new ValoracionPK(usuarioIdusuario, recursoIdrecurso);
    }

    public ValoracionPK getValoracionPK() {
        return valoracionPK;
    }

    public void setValoracionPK(ValoracionPK valoracionPK) {
        this.valoracionPK = valoracionPK;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valoracionPK != null ? valoracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valoracion)) {
            return false;
        }
        Valoracion other = (Valoracion) object;
        if ((this.valoracionPK == null && other.valoracionPK != null) || (this.valoracionPK != null && !this.valoracionPK.equals(other.valoracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Valoracion[ valoracionPK=" + valoracionPK + " ]";
    }
    
}
