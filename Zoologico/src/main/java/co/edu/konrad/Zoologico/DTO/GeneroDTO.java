/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.GeneroEntity;

/**
 *
 * @author ArturoC
 */
public class GeneroDTO {
     private Long id;
    private String Genero;

    public GeneroDTO(GeneroEntity genero) {
        this.id = genero.getId();
        this.Genero = genero.getGenero();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
}
