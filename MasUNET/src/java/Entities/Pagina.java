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
@Table(name = "pagina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagina.findAll", query = "SELECT p FROM Pagina p"),
    @NamedQuery(name = "Pagina.findByIdpagina", query = "SELECT p FROM Pagina p WHERE p.idpagina = :idpagina"),
    @NamedQuery(name = "Pagina.findByTitulo", query = "SELECT p FROM Pagina p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Pagina.findByUrl", query = "SELECT p FROM Pagina p WHERE p.url = :url"),
    @NamedQuery(name = "Pagina.findByIcono", query = "SELECT p FROM Pagina p WHERE p.icono = :icono"),
    @NamedQuery(name = "Pagina.findByTipo", query = "SELECT p FROM Pagina p WHERE p.tipo = :tipo")})
public class Pagina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpagina")
    private Integer idpagina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "url")
    private String url;
    @Size(max = 30)
    @Column(name = "icono")
    private String icono;
    @Column(name = "tipo")
    private Integer tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagina", fetch = FetchType.LAZY)
    private List<Permisologia> permisologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paginaIdpagina", fetch = FetchType.LAZY)
    private List<Bitacora> bitacoraList;

    public Pagina() {
    }

    public Pagina(Integer idpagina) {
        this.idpagina = idpagina;
    }

    public Pagina(Integer idpagina, String titulo, String url) {
        this.idpagina = idpagina;
        this.titulo = titulo;
        this.url = url;
    }

    public Integer getIdpagina() {
        return idpagina;
    }

    public void setIdpagina(Integer idpagina) {
        this.idpagina = idpagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<Permisologia> getPermisologiaList() {
        return permisologiaList;
    }

    public void setPermisologiaList(List<Permisologia> permisologiaList) {
        this.permisologiaList = permisologiaList;
    }

    @XmlTransient
    public List<Bitacora> getBitacoraList() {
        return bitacoraList;
    }

    public void setBitacoraList(List<Bitacora> bitacoraList) {
        this.bitacoraList = bitacoraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpagina != null ? idpagina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagina)) {
            return false;
        }
        Pagina other = (Pagina) object;
        if ((this.idpagina == null && other.idpagina != null) || (this.idpagina != null && !this.idpagina.equals(other.idpagina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Pagina[ idpagina=" + idpagina + " ]";
    }
    
}
