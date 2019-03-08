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
@Table(name = "Provincia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provincia.findAll", query = "SELECT p FROM Provincia p"),
    @NamedQuery(name = "Provincia.findByUIDProvincia", query = "SELECT p FROM Provincia p WHERE p.uIDProvincia = :uIDProvincia"),
    @NamedQuery(name = "Provincia.findByCodigo", query = "SELECT p FROM Provincia p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Provincia.findByNombreProvincia", query = "SELECT p FROM Provincia p WHERE p.nombreProvincia = :nombreProvincia")})
public class Provincia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UIDProvincia")
    private String uIDProvincia;
    @Size(max = 3)
    @Column(name = "Codigo")
    private String codigo;
    @Size(max = 25)
    @Column(name = "NombreProvincia")
    private String nombreProvincia;

    public Provincia() {
    }

    public Provincia(String uIDProvincia) {
        this.uIDProvincia = uIDProvincia;
    }

    public String getUIDProvincia() {
        return uIDProvincia;
    }

    public void setUIDProvincia(String uIDProvincia) {
        this.uIDProvincia = uIDProvincia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uIDProvincia != null ? uIDProvincia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.uIDProvincia == null && other.uIDProvincia != null) || (this.uIDProvincia != null && !this.uIDProvincia.equals(other.uIDProvincia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.preyc.springrestapitest.ent.Provincia[ uIDProvincia=" + uIDProvincia + " ]";
    }
    
}
