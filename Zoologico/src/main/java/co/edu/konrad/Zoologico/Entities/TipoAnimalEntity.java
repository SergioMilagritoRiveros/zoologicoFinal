/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Sergio Riveros
 */
@Entity
class TipoAnimalEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TipoAnimalID")
    private Long id;

    @ManyToOne
    @JoinColumn
    @Column(name = "EspecieID")
    private List<EspecieEntity> EspecieID;

    @OneToMany
    @JoinColumn
    @Column(name = "GeneroID")
    private List<GeneroEntity> GeneroID;
    /*
    *atributo descripcion
     */
    @Column(name = "Descripciion")
    private String Descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EspecieEntity> getEspecieID() {
        return EspecieID;
    }

    public void setEspecieID(List<EspecieEntity> EspecieID) {
        this.EspecieID = EspecieID;
    }

    public List<GeneroEntity> getGeneroID() {
        return GeneroID;
    }

    public void setGeneroID(List<GeneroEntity> GeneroID) {
        this.GeneroID = GeneroID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
