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
    @OneToMany
     @JoinColumn(name="ShowID")
    private List<ShowEntity> ShowID;
    
    @OneToMany
    @JoinColumn(name="AnimalID")
    private List<AnimalEntity> AnimalID;

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

    public List<ShowEntity> getShowID() {
        return ShowID;
    }

    public void setShowID(List<ShowEntity> ShowID) {
        this.ShowID = ShowID;
    }

    public List<AnimalEntity> getAnimalID() {
        return AnimalID;
    }

    public void setAnimalID(List<AnimalEntity> AnimalID) {
        this.AnimalID = AnimalID;
    }

   


}