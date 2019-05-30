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
public class ShowDTO {
    private Long id;
    private EmpleadoDTO empleadoID;
    private AnimalDTO animalID;
    private String espacio;
    private EspacioDTO EspaciosID;
    private Long cantidad;

    public ShowDTO() {
    }
    

    public ShowDTO(ShowEntity show) {
        this.id = show.getId();
        if(show.getEmpleadoID() != null){
            EmpleadoDTO e = new EmpleadoDTO(show.getEmpleadoID());
            this.empleadoID = e;
        }
        if(show.getAnimalID() != null){
            AnimalDTO e = new AnimalDTO(show.getAnimalID());
            this.animalID= e;
        }
        this.espacio = show.getEspacio();
        if(show.getEspaciosID() != null){
            EspacioDTO e = new EspacioDTO(show.getEspaciosID());
            this.EspaciosID= e;
        }
        this.cantidad = show.getCantidad();
    }
    
    public static List<ShowDTO> toShowList(List<ShowEntity> listaShow){
        List<ShowDTO> listaShowDTO = new ArrayList<>();
        for(ShowEntity entity : listaShow){
            listaShowDTO.add(new ShowDTO(entity));
        }
        return listaShowDTO;
    }
    
    public ShowEntity toEntity(){
        ShowEntity entity = new ShowEntity();
        entity.setId(this.id);
        if (this.animalID != null) {
            entity.setAnimalID(this.animalID.toEntity());
        }
        entity.setCantidad(this.cantidad);
        if (this.empleadoID != null) {
            entity.setEmpleadoID(this.empleadoID.toEntity());
        }
        entity.setEspacio(this.espacio);
        if (this.EspaciosID != null) {
            entity.setEspaciosID(this.EspaciosID.toEntity());
        }
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmpleadoDTO getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(EmpleadoDTO empleadoID) {
        this.empleadoID = empleadoID;
    }

    public AnimalDTO getAnimalID() {
        return animalID;
    }

    public void setAnimalID(AnimalDTO animalID) {
        this.animalID = animalID;
    }

    public EspacioDTO getEspaciosID() {
        return EspaciosID;
    }

    public void setEspaciosID(EspacioDTO EspaciosID) {
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
