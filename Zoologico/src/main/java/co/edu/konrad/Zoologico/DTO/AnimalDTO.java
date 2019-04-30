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
    private TipoAnimalEntity tipoAnimalID;
    private Long cantidadHabitad;
    private Long cantidadTotal;
    private List<HorarioAlimentacionEntity> horarioAlimentacionID;
    private EspacioEntity espaciosID;
    private List<RatingEntity> RatingID;
    private EmpleadoEntity EmpleadoEntityID;
    private String nombreCientifico;

    public AnimalDTO(AnimalEntity animal) {
        this.AnimalID = animal.getId();
        this.tipoAnimalID = animal.getAnimal();
        this.cantidadHabitad = animal.getCantidadHabitad();
        this.cantidadTotal = animal.getCantidadTotal();
        this.horarioAlimentacionID = animal.getHorarioAlimentacionID();
        this.espaciosID = animal.getEspaciosID();
        this.RatingID = animal.getRatingID();        
        this.EmpleadoEntityID = animal.getEmpleadoEntityID();
        this.nombreCientifico = animal.getNombreCientifico();
    }
    
    public AnimalEntity toEntity(){
        AnimalEntity entity = new AnimalEntity();
        entity.setAnimal(this.tipoAnimalID);
        entity.setCantidadHabitad(this.cantidadHabitad);
        entity.setCantidadTotal(this.cantidadTotal);
        entity.setEmpleadoEntityID(this.EmpleadoEntityID);
        entity.setEspaciosID(this.espaciosID);
        entity.setHorarioAlimentacionID(horarioAlimentacionID);
        entity.setId(this.AnimalID);
        entity.setNombreCientifico(this.nombreCientifico);
        return entity;
    }
     public static List<AnimalDTO> toAnimalList(List<AnimalEntity> listaAnimal){
        List<AnimalDTO> listaAnimalDTO = new ArrayList<>();
        for(AnimalEntity entity : listaAnimal){
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

    public List<HorarioAlimentacionEntity> getHorarioAlimentacionID() {
        return horarioAlimentacionID;
    }

    public void setHorarioAlimentacionID(List<HorarioAlimentacionEntity> horarioAlimentacionID) {
        this.horarioAlimentacionID = horarioAlimentacionID;
    }

    

    public EspacioEntity getEspaciosID() {
        return espaciosID;
    }

    public void setEspaciosID(EspacioEntity espaciosID) {
        this.espaciosID = espaciosID;
    }

    public List<RatingEntity> getRatingID() {
        return RatingID;
    }

    public void setRatingID(List<RatingEntity> RatingID) {
        this.RatingID = RatingID;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

   

    public EmpleadoEntity getEmpleadoEntityID() {
        return EmpleadoEntityID;
    }

    public void setEmpleadoEntityID(EmpleadoEntity EmpleadoEntityID) {
        this.EmpleadoEntityID = EmpleadoEntityID;
    }
    
    
    
    
}
