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
@Table(name = "user_even")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserEven.findAll", query = "SELECT u FROM UserEven u"),
    @NamedQuery(name = "UserEven.findByEventoIdevento", query = "SELECT u FROM UserEven u WHERE u.userEvenPK.eventoIdevento = :eventoIdevento"),
    @NamedQuery(name = "UserEven.findByUsuarioIdusuario", query = "SELECT u FROM UserEven u WHERE u.userEvenPK.usuarioIdusuario = :usuarioIdusuario"),
    @NamedQuery(name = "UserEven.findByCheked", query = "SELECT u FROM UserEven u WHERE u.cheked = :cheked"),
    @NamedQuery(name = "UserEven.findByNotificado", query = "SELECT u FROM UserEven u WHERE u.notificado = :notificado")})
public class UserEven implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserEvenPK userEvenPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cheked")
    private boolean cheked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notificado")
    private boolean notificado;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;
    @JoinColumn(name = "evento_idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Evento evento;

    public UserEven() {
    }

    public UserEven(UserEvenPK userEvenPK) {
        this.userEvenPK = userEvenPK;
    }

    public UserEven(UserEvenPK userEvenPK, boolean cheked, boolean notificado) {
        this.userEvenPK = userEvenPK;
        this.cheked = cheked;
        this.notificado = notificado;
    }

    public UserEven(int eventoIdevento, int usuarioIdusuario) {
        this.userEvenPK = new UserEvenPK(eventoIdevento, usuarioIdusuario);
    }

    public UserEvenPK getUserEvenPK() {
        return userEvenPK;
    }

    public void setUserEvenPK(UserEvenPK userEvenPK) {
        this.userEvenPK = userEvenPK;
    }

    public boolean getCheked() {
        return cheked;
    }

    public void setCheked(boolean cheked) {
        this.cheked = cheked;
    }

    public boolean getNotificado() {
        return notificado;
    }

    public void setNotificado(boolean notificado) {
        this.notificado = notificado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userEvenPK != null ? userEvenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserEven)) {
            return false;
        }
        UserEven other = (UserEven) object;
        if ((this.userEvenPK == null && other.userEvenPK != null) || (this.userEvenPK != null && !this.userEvenPK.equals(other.userEvenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UserEven[ userEvenPK=" + userEvenPK + " ]";
    }
    
}
