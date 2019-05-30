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
    private EspecieDTO EspecieID;
    private GeneroDTO GeneroID;
    private String Descripcion;

    public TipoAnimalDTO() {
    }
    

    public TipoAnimalDTO(TipoAnimalEntity tip) {
        this.id = tip.getId();
        if(tip.getEspecieID() != null){
            EspecieDTO e = new EspecieDTO();
            this.EspecieID = e;
        }
        if (tip.getGeneroID() != null) {
            GeneroDTO e = new GeneroDTO();
            this.GeneroID = e;
        }        
        this.Descripcion = tip.getDescripcion();
    }
    
    public TipoAnimalEntity toEntity(){
        TipoAnimalEntity entity = new TipoAnimalEntity();
        entity.setId(this.id);
        entity.setDescripcion(this.Descripcion);
        if (this.EspecieID != null) {
            entity.setEspecieID(this.EspecieID.toEntity());
        }
        if (this.GeneroID != null) {
            entity.setGeneroID(this.GeneroID.toEntity());
        }
        return entity;
    }
    
    public static List<TipoAnimalDTO> toTipoAnimalList(List<TipoAnimalEntity> listaTipoAnimal){
        List<TipoAnimalDTO> listaTipoAnimalDTO = new ArrayList<>();
        for(TipoAnimalEntity entity : listaTipoAnimal){
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

    public EspecieDTO getEspecieID() {
        return EspecieID;
    }

    public void setEspecieID(EspecieDTO EspecieID) {
        this.EspecieID = EspecieID;
    }

    public GeneroDTO getGeneroID() {
        return GeneroID;
    }

    public void setGeneroID(GeneroDTO GeneroID) {
        this.GeneroID = GeneroID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

   

    
    
    
}
