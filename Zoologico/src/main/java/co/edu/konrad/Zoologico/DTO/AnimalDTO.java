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
    private TipoAnimalDTO tipoAnimalID;
    private Long cantidadHabitad;
    private Long cantidadTotal;
    private HorarioAlimentacionDTO horarioAlimentacionID;
    private EspacioDTO espaciosID;
    private EmpleadoDTO EmpleadoEntityID;
    private String nombreCientifico;

    public AnimalDTO() {
    }
    

    public AnimalDTO(AnimalEntity animal) {
        this.AnimalID = animal.getId();
        if(animal.getAnimal() != null){
            TipoAnimalDTO e = new TipoAnimalDTO(animal.getAnimal());
            this.tipoAnimalID = e;
        }
        this.cantidadHabitad = animal.getCantidadHabitad();
        this.cantidadTotal = animal.getCantidadTotal();
        if(animal.getHorarioAlimentacionID() != null){
             HorarioAlimentacionDTO e = new  HorarioAlimentacionDTO(animal.getHorarioAlimentacionID());
            this.horarioAlimentacionID= e;
        }
        if(animal.getEspaciosID() != null){
            EspacioDTO e = new EspacioDTO(animal.getEspaciosID());
            this.espaciosID= e;
        }
        if(animal.getEmpleadoEntityID() != null){
            EmpleadoDTO e = new EmpleadoDTO(animal.getEmpleadoEntityID());          
            this.EmpleadoEntityID= e;
        }
        this.nombreCientifico = animal.getNombreCientifico();
    }
    
    public AnimalEntity toEntity(){
        AnimalEntity entity = new AnimalEntity();
        if (this.tipoAnimalID != null) {
            entity.setAnimal(this.tipoAnimalID.toEntity());
        }
        entity.setCantidadHabitad(this.cantidadHabitad);
        entity.setCantidadTotal(this.cantidadTotal);
        if (this.EmpleadoEntityID != null) {
            entity.setEmpleadoEntityID(this.EmpleadoEntityID.toEntity());
        }
        if (this.espaciosID != null) {
            entity.setEspaciosID(this.espaciosID.toEntity());
        }
        if (this.horarioAlimentacionID != null) {
            entity.setHorarioAlimentacionID(this.horarioAlimentacionID.toEntity());
        }
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

    public TipoAnimalDTO getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(TipoAnimalDTO tipoAnimalID) {
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

    public HorarioAlimentacionDTO getHorarioAlimentacionID() {
        return horarioAlimentacionID;
    }

    public void setHorarioAlimentacionID(HorarioAlimentacionDTO horarioAlimentacionID) {
        this.horarioAlimentacionID = horarioAlimentacionID;
    }

    public EspacioDTO getEspaciosID() {
        return espaciosID;
    }

    public void setEspaciosID(EspacioDTO espaciosID) {
        this.espaciosID = espaciosID;
    }

    public EmpleadoDTO getEmpleadoEntityID() {
        return EmpleadoEntityID;
    }

    public void setEmpleadoEntityID(EmpleadoDTO EmpleadoEntityID) {
        this.EmpleadoEntityID = EmpleadoEntityID;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

        
    
    
}
