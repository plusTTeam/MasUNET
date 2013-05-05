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
@Table(name = "usu_men")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuMen.findAll", query = "SELECT u FROM UsuMen u"),
    @NamedQuery(name = "UsuMen.findByUsuarioIdusuario", query = "SELECT u FROM UsuMen u WHERE u.usuMenPK.usuarioIdusuario = :usuarioIdusuario"),
    @NamedQuery(name = "UsuMen.findByMensajeIdmensaje", query = "SELECT u FROM UsuMen u WHERE u.usuMenPK.mensajeIdmensaje = :mensajeIdmensaje"),
    @NamedQuery(name = "UsuMen.findByEstado", query = "SELECT u FROM UsuMen u WHERE u.estado = :estado")})
public class UsuMen implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuMenPK usuMenPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private char estado;
    @JoinColumn(name = "mensaje_idmensaje", referencedColumnName = "idmensaje", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Mensaje mensaje;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public UsuMen() {
    }

    public UsuMen(UsuMenPK usuMenPK) {
        this.usuMenPK = usuMenPK;
    }

    public UsuMen(UsuMenPK usuMenPK, char estado) {
        this.usuMenPK = usuMenPK;
        this.estado = estado;
    }

    public UsuMen(int usuarioIdusuario, int mensajeIdmensaje) {
        this.usuMenPK = new UsuMenPK(usuarioIdusuario, mensajeIdmensaje);
    }

    public UsuMenPK getUsuMenPK() {
        return usuMenPK;
    }

    public void setUsuMenPK(UsuMenPK usuMenPK) {
        this.usuMenPK = usuMenPK;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuMenPK != null ? usuMenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuMen)) {
            return false;
        }
        UsuMen other = (UsuMen) object;
        if ((this.usuMenPK == null && other.usuMenPK != null) || (this.usuMenPK != null && !this.usuMenPK.equals(other.usuMenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UsuMen[ usuMenPK=" + usuMenPK + " ]";
    }
    
}
