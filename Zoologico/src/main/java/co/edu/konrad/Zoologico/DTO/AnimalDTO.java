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
public class AnimalDTO {
    private Long AnimalID;
    private TipoAnimalEntity tipoAnimalID;
    private Long cantidadHabitad;
    private Long cantidadTotal;
    private HorarioAlimentacionEntity horarioAlimentacionID;
    private EspacioEntity espaciosID;
    private RatingEntity RatingID;
    private EmpleadoEntity EmpleadoEntityID;

    public AnimalDTO(AnimalEntity animal) {
        this.AnimalID = animal.getId();
        this.tipoAnimalID = animal.getAnimal();
        this.cantidadHabitad = animal.getCantidadHabitad();
        this.cantidadTotal = animal.getCantidadTotal();
        this.horarioAlimentacionID = animal.getHorarioAlimentacionID();
        this.espaciosID = animal.getEspaciosID();
        this.RatingID = animal.getRatingID();
        this.EmpleadoEntityID = animal.getEmpleadoEntityID();
    }

    public Long getAnimalID() {
        return AnimalID;
    }

    public void setAnimalID(Long AnimalID) {
        this.AnimalID = AnimalID;
    }

    public TipoAnimalEntity getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(TipoAnimalEntity tipoAnimalID) {
        this.tipoAnimalID = tipoAnimalID;
    }

    public Long getCantidadHabitad() {
        return cantidadHabitad;
    }

    public void setCantidadHabitad(Long cantidadHabitad) {
        this.cantidadHabitad = cantidadHabitad;
    }

    public Long getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Long cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public HorarioAlimentacionEntity getHorarioAlimentacionID() {
        return horarioAlimentacionID;
    }

    public void setHorarioAlimentacionID(HorarioAlimentacionEntity horarioAlimentacionID) {
        this.horarioAlimentacionID = horarioAlimentacionID;
    }

    public EspacioEntity getEspaciosID() {
        return espaciosID;
    }

    public void setEspaciosID(EspacioEntity espaciosID) {
        this.espaciosID = espaciosID;
    }

    public RatingEntity getRatingID() {
        return RatingID;
    }

    public void setRatingID(RatingEntity RatingID) {
        this.RatingID = RatingID;
    }

    public EmpleadoEntity getEmpleadoEntityID() {
        return EmpleadoEntityID;
    }

    public void setEmpleadoEntityID(EmpleadoEntity EmpleadoEntityID) {
        this.EmpleadoEntityID = EmpleadoEntityID;
    }
    
    
    
    
}
