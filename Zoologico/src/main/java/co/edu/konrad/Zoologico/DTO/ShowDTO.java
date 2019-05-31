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
    private Long empleadoID;
    private Long animalID;
    private String espacio;
    private Long EspaciosID;
    private Long cantidad;

    public ShowDTO() {
    }

    public ShowDTO(ShowEntity show) {
        this.id = show.getId();
        this.empleadoID = show.getEmpleadoID();
        this.animalID = show.getAnimalID();
        this.espacio = show.getEspacio();
        this.EspaciosID = show.getEspaciosID();
        this.cantidad = show.getCantidad();
    }

    public static List<ShowDTO> toShowList(List<ShowEntity> listaShow) {
        List<ShowDTO> listaShowDTO = new ArrayList<>();
        for (ShowEntity entity : listaShow) {
            listaShowDTO.add(new ShowDTO(entity));
        }
        return listaShowDTO;
    }

    public ShowEntity toEntity() {
        ShowEntity entity = new ShowEntity();
        entity.setId(this.id);
        entity.setAnimalID(this.animalID);
        entity.setCantidad(this.cantidad);
        entity.setEmpleadoID(this.empleadoID);
        entity.setEspacio(this.espacio);
        entity.setEspaciosID(this.EspaciosID);

        return entity;
    }

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
