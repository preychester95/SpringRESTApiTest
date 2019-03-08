/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springrestapitest.ent;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author prc
 */
@Entity
@Table(name = "Contacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c"),
    @NamedQuery(name = "Contacto.findByUIDContacto", query = "SELECT c FROM Contacto c WHERE c.uIDContacto = :uIDContacto"),
    @NamedQuery(name = "Contacto.findByNombre", query = "SELECT c FROM Contacto c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Contacto.findByEmail", query = "SELECT c FROM Contacto c WHERE c.email = :email"),
    @NamedQuery(name = "Contacto.findByTelefono", query = "SELECT c FROM Contacto c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Contacto.findByMovil", query = "SELECT c FROM Contacto c WHERE c.movil = :movil")})
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UIDContacto")
    private String uIDContacto;
    @Size(max = 100)
    @Column(name = "Nombre")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 75)
    @Column(name = "Email")
    private String email;
    @Column(name = "Telefono")
    private Long telefono;
    @Column(name = "Movil")
    private Long movil;
    @JoinColumn(name = "UIDDireccion", referencedColumnName = "UIDDireccion")
    @ManyToOne
    private Direccion uIDDireccion;

    public Contacto() {
    }

    public Contacto(String uIDContacto) {
        this.uIDContacto = uIDContacto;
    }

    public String getUIDContacto() {
        return uIDContacto;
    }

    public void setUIDContacto(String uIDContacto) {
        this.uIDContacto = uIDContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Long getMovil() {
        return movil;
    }

    public void setMovil(Long movil) {
        this.movil = movil;
    }

    public Direccion getUIDDireccion() {
        return uIDDireccion;
    }

    public void setUIDDireccion(Direccion uIDDireccion) {
        this.uIDDireccion = uIDDireccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uIDContacto != null ? uIDContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.uIDContacto == null && other.uIDContacto != null) || (this.uIDContacto != null && !this.uIDContacto.equals(other.uIDContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.preyc.springrestapitest.ent.Contacto[ uIDContacto=" + uIDContacto + " ]";
    }
    
}
