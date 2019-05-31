/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class AnimalDTO {

    private Long AnimalID;
    private Long tipoAnimalID;
    private Long cantidadHabitad;
    private Long cantidadTotal;
    private Long horarioAlimentacionID;
    private Long espaciosID;
    private Long EmpleadoEntityID;
    private String nombreCientifico;

    public AnimalDTO() {
    }

    public AnimalDTO(AnimalEntity animal) {
        this.AnimalID = animal.getId();
        this.tipoAnimalID = animal.getAnimal();
        this.cantidadHabitad = animal.getCantidadHabitad();
        this.cantidadTotal = animal.getCantidadTotal();
        this.horarioAlimentacionID = animal.getHorarioAlimentacionID();
        this.espaciosID = animal.getEspaciosID();
        this.EmpleadoEntityID = animal.getEmpleadoEntityID();
        this.nombreCientifico = animal.getNombreCientifico();
    }

    public AnimalEntity toEntity() {
        AnimalEntity entity = new AnimalEntity();
        entity.setAnimal(this.tipoAnimalID);
        entity.setCantidadHabitad(this.cantidadHabitad);
        entity.setCantidadTotal(this.cantidadTotal);
        entity.setEmpleadoEntityID(this.EmpleadoEntityID);
        entity.setEspaciosID(this.espaciosID);
        entity.setHorarioAlimentacionID(this.horarioAlimentacionID);
        entity.setId(this.AnimalID);
        entity.setNombreCientifico(this.nombreCientifico);
        return entity;
    }

    public static List<AnimalDTO> toAnimalList(List<AnimalEntity> listaAnimal) {
        List<AnimalDTO> listaAnimalDTO = new ArrayList<>();
        for (AnimalEntity entity : listaAnimal) {
            listaAnimalDTO.add(new AnimalDTO(entity));
        }
        return listaAnimalDTO;
    }

    public Long getAnimalID() {
        return AnimalID;
    }

    public void setAnimalID(Long AnimalID) {
        this.AnimalID = AnimalID;
    }

    public Long getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(Long tipoAnimalID) {
        this.tipoAnimalID = tipoAnimalID;
    }

    public Long getHorarioAlimentacionID() {
        return horarioAlimentacionID;
    }

    public void setHorarioAlimentacionID(Long horarioAlimentacionID) {
        this.horarioAlimentacionID = horarioAlimentacionID;
    }

    public Long getEspaciosID() {
        return espaciosID;
    }

    public void setEspaciosID(Long espaciosID) {
        this.espaciosID = espaciosID;
    }

    public Long getEmpleadoEntityID() {
        return EmpleadoEntityID;
    }

    public void setEmpleadoEntityID(Long EmpleadoEntityID) {
        this.EmpleadoEntityID = EmpleadoEntityID;
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

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

}
