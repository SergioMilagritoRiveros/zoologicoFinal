/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.EspecieEntity;
import co.edu.konrad.Zoologico.Entities.GeneroEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class GeneroDTO {
     private Long id;
    private String genero;

    public GeneroDTO() {
    }
    

    public GeneroDTO(GeneroEntity genero) {
        this.id = genero.getId();
        this.genero = genero.getGenero();
    }
    
    public GeneroEntity toEntity(){
        GeneroEntity entity = new GeneroEntity();
        entity.setGenero(this.genero);
        entity.setId(this.id);
        return entity;
    }
    
    public static List<GeneroDTO> toGeneroList(List<GeneroEntity> listaGenero){
        List<GeneroDTO> listaGeneroDTO = new ArrayList<>();
        for(GeneroEntity entity : listaGenero){
            listaGeneroDTO.add(new GeneroDTO(entity));
        }
        return listaGeneroDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String Genero) {
        this.genero = Genero;
    }
    
    
}
