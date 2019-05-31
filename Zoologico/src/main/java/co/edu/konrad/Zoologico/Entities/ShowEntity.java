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
import co.edu.konrad.Zoologico.Entities.AnimalEntity;
import java.util.List;
import javax.persistence.JoinColumn;
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
    @Column(name = "ShowID",nullable=false)
    private Long id;
    /*
    *atributo ratingID
     */ 

    /*
    *atributo EmpleadoID
     */
    @Column(name = "EmpleadoID",nullable=false)
    private Long empleadoID;

    /*
    *atributo animalID
     */
    @Column(name = "AnimalID")
    private Long animalID;
    /*
    *atributo espacio
     */
    @Column(name = "Espacio")
    private String espacio;
    /*
    *atributo espacioID
     */ 
    @Column(name = "EspaciosID")
    private Long EspaciosID;
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

    public Long getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(Long empleadoID) {
        this.empleadoID = empleadoID;
    }

    public Long getAnimalID() {
        return animalID;
    }

    public void setAnimalID(Long animalID) {
        this.animalID = animalID;
    }

    public Long getEspaciosID() {
        return EspaciosID;
    }

    public void setEspaciosID(Long EspaciosID) {
        this.EspaciosID = EspaciosID;
    }


    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

}