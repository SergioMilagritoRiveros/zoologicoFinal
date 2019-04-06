/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *Entidad zoologico
 * @author Sergio Riveros
 */
@Entity
public class ZoologicoEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ZoologicoID")
    private Long id;
    
    /*
    *atributo asignacion de espacios
    */
    @Column(name="AsignacionEspaciosID")
    private Long AsignacionEspaciosID;
    /*
    *atributo show ID
    */    
     @Column(name="ShowID")
    @OneToMany
    private ShowEntity ShowID;
     
    @Column(name="AnimalID")
    @OneToMany
    private AnimalEntity AnimalID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAsignacionEspaciosID() {
        return AsignacionEspaciosID;
    }

    public void setAsignacionEspaciosID(Long AsignacionEspaciosID) {
        this.AsignacionEspaciosID = AsignacionEspaciosID;
    }

    public ShowEntity getShowID() {
        return ShowID;
    }

    public void setShowID(ShowEntity ShowID) {
        this.ShowID = ShowID;
    }

    public AnimalEntity getAnimalID() {
        return AnimalID;
    }

    public void setAnimalID(AnimalEntity AnimalID) {
        this.AnimalID = AnimalID;
    }
     
    
    
}
