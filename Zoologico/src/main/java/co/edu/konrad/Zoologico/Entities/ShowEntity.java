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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Sergio Riveros
 */
@Entity
public class ShowEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ShowID")
    private Long id;
    /*
    *atributo ratingID
     */
    @Column(name = "RatingID")
    @OneToMany
    private RatingEntity RatingID;

    /*
    *atributo EmpleadoID
     */
    @Column(name = "EmpleadoID")
    @ManyToOne
    private EmpleadoEntity animalID;

    /*
    *atributo animalID
     */
    @Column(name = "AnimalID")
    @ManyToOne
    private AnimalEntity animalID;
    /*
    *atributo espacio
     */
    @Column(name = "Espacio")
    private String espacio;
    /*
    *atributo espacioID
     */
    @Column(name = "EspaciosID")
    @ManyToOne
    private EspacioEntity EspaciosID;
    /*
    *atributo cantidad
     */
    @Column(name = "Cantidad")
    private Long cantidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RatingEntity getRatingID() {
        return RatingID;
    }

    public void setRatingID(RatingEntity RatingID) {
        this.RatingID = RatingID;
    }

    public EmpleadoEntity getAnimalID() {
        return animalID;
    }

    public void setAnimalID(EmpleadoEntity animalID) {
        this.animalID = animalID;
    }

    public AnimalEntity getAnimalID() {
        return animalID;
    }

    public void setAnimalID(AnimalEntity animalID) {
        this.animalID = animalID;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public EspacioEntity getEspaciosID() {
        return EspaciosID;
    }

    public void setEspaciosID(EspacioEntity EspaciosID) {
        this.EspaciosID = EspaciosID;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

}