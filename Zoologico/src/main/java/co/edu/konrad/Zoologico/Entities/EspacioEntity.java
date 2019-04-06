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

/**
 *
 * @author Sergio Riveros
 */
@Entity
class EspacioEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EspacioID")
    private Long id;

    /*
    *atributo nombre espacio
     */
    @Column(name = "NombreEspacio")
    private String nombreEspacio;

    /*
    *atributo nombre ubicacion
     */
    @Column(name = "NombreEspacio")
    private String ubicacion;

    /*
    *atributo nombre disponibilidad
     */
    @Column(name = "Disponibilidad")
    private boolean disponibilidad;

    /*
    *atributo tipo de espacio
     */
    @Column(name = "AnimalID")
    @ManyToOne
    private TipoEspacioEntity animalID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public TipoEspacioEntity getAnimalID() {
        return animalID;
    }

    public void setAnimalID(TipoEspacioEntity animalID) {
        this.animalID = animalID;
    }

} 
