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
@Table(name = "Pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByUIDPais", query = "SELECT p FROM Pais p WHERE p.uIDPais = :uIDPais"),
    @NamedQuery(name = "Pais.findByCodigo", query = "SELECT p FROM Pais p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Pais.findByNombrePais", query = "SELECT p FROM Pais p WHERE p.nombrePais = :nombrePais")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UIDPais")
    private String uIDPais;
    @Size(max = 3)
    @Column(name = "Codigo")
    private String codigo;
    @Size(max = 25)
    @Column(name = "NombrePais")
    private String nombrePais;

    public Pais() {
    }

    public Pais(String uIDPais) {
        this.uIDPais = uIDPais;
    }

    public String getUIDPais() {
        return uIDPais;
    }

    public void setUIDPais(String uIDPais) {
        this.uIDPais = uIDPais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uIDPais != null ? uIDPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.uIDPais == null && other.uIDPais != null) || (this.uIDPais != null && !this.uIDPais.equals(other.uIDPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.preyc.springrestapitest.ent.Pais[ uIDPais=" + uIDPais + " ]";
    }
    
}
