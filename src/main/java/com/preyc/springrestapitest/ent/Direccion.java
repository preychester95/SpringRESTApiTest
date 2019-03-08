/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springrestapitest.ent;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author prc
 */
@Entity
@Table(name = "Direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d"),
    @NamedQuery(name = "Direccion.findByUIDDireccion", query = "SELECT d FROM Direccion d WHERE d.uIDDireccion = :uIDDireccion"),
    @NamedQuery(name = "Direccion.findByCp", query = "SELECT d FROM Direccion d WHERE d.cp = :cp"),
    @NamedQuery(name = "Direccion.findByLocalidad", query = "SELECT d FROM Direccion d WHERE d.localidad = :localidad"),
    @NamedQuery(name = "Direccion.findByTelefono", query = "SELECT d FROM Direccion d WHERE d.telefono = :telefono")})
public class Direccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UIDDireccion")
    private String uIDDireccion;
    @Size(max = 5)
    @Column(name = "CP")
    private String cp;
    @Size(max = 50)
    @Column(name = "Localidad")
    private String localidad;
    @Column(name = "Telefono")
    private Long telefono;
    @JoinColumn(name = "UIDPais", referencedColumnName = "UIDPais")
    @ManyToOne
    private Pais uIDPais;
    @JoinColumn(name = "UIDProvincia", referencedColumnName = "UIDProvincia")
    @ManyToOne
    private Provincia uIDProvincia;

    public Direccion() {
    }

    public Direccion(String uIDDireccion) {
        this.uIDDireccion = uIDDireccion;
    }

    public String getUIDDireccion() {
        return uIDDireccion;
    }

    public void setUIDDireccion(String uIDDireccion) {
        this.uIDDireccion = uIDDireccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    
    public Pais getUIDPais() {
        return uIDPais;
    }

    public void setUIDPais(Pais uIDPais) {
        this.uIDPais = uIDPais;
    }

    public Provincia getUIDProvincia() {
        return uIDProvincia;
    }

    public void setUIDProvincia(Provincia uIDProvincia) {
        this.uIDProvincia = uIDProvincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uIDDireccion != null ? uIDDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.uIDDireccion == null && other.uIDDireccion != null) || (this.uIDDireccion != null && !this.uIDDireccion.equals(other.uIDDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.preyc.springrestapitest.ent.Direccion[ uIDDireccion=" + uIDDireccion + " ]";
    }
    
}
