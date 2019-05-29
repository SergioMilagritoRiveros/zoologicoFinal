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
public class TipoAnimalEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TipoAnimalID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "EspecieID",nullable=false)
    private EspecieEntity EspecieID;

    @ManyToOne
    @JoinColumn(name = "GeneroID",nullable=false)
    private GeneroEntity GeneroID;
    /*
    *atributo descripcion
     */
    @Column(name = "Descripciion",nullable=false)
    private String Descripcion;

    public TipoAnimalEntity() {
    }

    public TipoAnimalEntity(Long id, EspecieEntity EspecieID, GeneroEntity GeneroID, String Descripcion) {
        this.id = id;
        this.EspecieID = EspecieID;
        this.GeneroID = GeneroID;
        this.Descripcion = Descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EspecieEntity getEspecieID() {
        return EspecieID;
    }

    public void setEspecieID(EspecieEntity EspecieID) {
        this.EspecieID = EspecieID;
    }

    public GeneroEntity getGeneroID() {
        return GeneroID;
    }

    public void setGeneroID(GeneroEntity GeneroID) {
        this.GeneroID = GeneroID;
    }

   

    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
}
