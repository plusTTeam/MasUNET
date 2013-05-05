/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "bitacora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b"),
    @NamedQuery(name = "Bitacora.findByIdbitacora", query = "SELECT b FROM Bitacora b WHERE b.idbitacora = :idbitacora"),
    @NamedQuery(name = "Bitacora.findByFecha", query = "SELECT b FROM Bitacora b WHERE b.fecha = :fecha"),
    @NamedQuery(name = "Bitacora.findByIp", query = "SELECT b FROM Bitacora b WHERE b.ip = :ip"),
    @NamedQuery(name = "Bitacora.findByInformacion", query = "SELECT b FROM Bitacora b WHERE b.informacion = :informacion")})
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbitacora")
    private Integer idbitacora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ip")
    private String ip;
    @Size(max = 300)
    @Column(name = "informacion")
    private String informacion;
    @JoinColumn(name = "accion_idaccion", referencedColumnName = "idaccion")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Accion accionIdaccion;
    @JoinColumn(name = "pagina_idpagina", referencedColumnName = "idpagina")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pagina paginaIdpagina;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioIdusuario;

    public Bitacora() {
    }

    public Bitacora(Integer idbitacora) {
        this.idbitacora = idbitacora;
    }

    public Bitacora(Integer idbitacora, Date fecha, String ip) {
        this.idbitacora = idbitacora;
        this.fecha = fecha;
        this.ip = ip;
    }

    public Integer getIdbitacora() {
        return idbitacora;
    }

    public void setIdbitacora(Integer idbitacora) {
        this.idbitacora = idbitacora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Accion getAccionIdaccion() {
        return accionIdaccion;
    }

    public void setAccionIdaccion(Accion accionIdaccion) {
        this.accionIdaccion = accionIdaccion;
    }

    public Pagina getPaginaIdpagina() {
        return paginaIdpagina;
    }

    public void setPaginaIdpagina(Pagina paginaIdpagina) {
        this.paginaIdpagina = paginaIdpagina;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbitacora != null ? idbitacora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.idbitacora == null && other.idbitacora != null) || (this.idbitacora != null && !this.idbitacora.equals(other.idbitacora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Bitacora[ idbitacora=" + idbitacora + " ]";
    }
    
}
