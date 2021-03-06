/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class TipoAnimalDTO {
    private Long id; 
    private List<EspecieEntity> EspecieID;
    private List<GeneroEntity> GeneroID;
    private String Descripcion;

    public TipoAnimalDTO(TipoAnimalEntity tip) {
        this.id = tip.getId();
        this.EspecieID = tip.getEspecieID();
        this.GeneroID = tip.getGeneroID();
        this.Descripcion = tip.getDescripcion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EspecieEntity> getEspecieID() {
        return EspecieID;
    }

    public void setEspecieID(List<EspecieEntity> EspecieID) {
        this.EspecieID = EspecieID;
    }

    public List<GeneroEntity> getGeneroID() {
        return GeneroID;
    }

    public void setGeneroID(List<GeneroEntity> GeneroID) {
        this.GeneroID = GeneroID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    
    
}
