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
public class TipoAnimalDTO {

    private Long id;
    private Long especieID;
    private Long generoID;
    private String Descripcion;

    public TipoAnimalDTO() {
    }

    public TipoAnimalDTO(TipoAnimalEntity tip) {
        this.id = tip.getId();
        this.especieID = tip.getEspecieID();
        this.generoID = tip.getGeneroID();
        this.Descripcion = tip.getDescripcion();
    }

    public TipoAnimalEntity toEntity() {
        TipoAnimalEntity entity = new TipoAnimalEntity();
        entity.setId(this.id);
        entity.setDescripcion(this.Descripcion);
        entity.setEspecieID(this.especieID);
        entity.setGeneroID(this.generoID);

        return entity;
    }

    public static List<TipoAnimalDTO> toTipoAnimalList(List<TipoAnimalEntity> listaTipoAnimal) {
        List<TipoAnimalDTO> listaTipoAnimalDTO = new ArrayList<>();
        for (TipoAnimalEntity entity : listaTipoAnimal) {
            listaTipoAnimalDTO.add(new TipoAnimalDTO(entity));
        }
        return listaTipoAnimalDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEspecieID() {
        return especieID;
    }

    public void setEspecieID(Long EspecieID) {
        this.especieID = EspecieID;
    }

    public Long getGeneroID() {
        return generoID;
    }

    public void setGeneroID(Long GeneroID) {
        this.generoID = GeneroID;
    }

    
    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
