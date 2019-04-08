/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;

/**
 *
 * @author ArturoC
 */
public class ShowDTO {
    private Long id;
    private RatingEntity RatingID;
    private EmpleadoEntity empleadoID;
    private AnimalEntity animalID;
    private String espacio;
    private EspacioEntity EspaciosID;
    private Long cantidad;

    public ShowDTO(ShowEntity show) {
        this.id = show.getId();
        this.RatingID = show.getRatingID();
        this.empleadoID = show.getEmpleadoID();
        this.animalID = show.getAnimalID();
        this.espacio = show.getEspacio();
        this.EspaciosID = show.getEspaciosID();
        this.cantidad = show.getCantidad();
    }

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

    public EmpleadoEntity getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(EmpleadoEntity empleadoID) {
        this.empleadoID = empleadoID;
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
