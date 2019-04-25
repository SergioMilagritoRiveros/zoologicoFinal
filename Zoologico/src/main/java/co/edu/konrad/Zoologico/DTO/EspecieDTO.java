/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.EspecieEntity;

/**
 *
 * @author ArturoC
 */
public class EspecieDTO {
    private Long id;
    private String Especie;

    public EspecieDTO(EspecieEntity especie) {
        this.id = especie.getId();
        this.Especie = especie.getEspecie();
    }
    
    public EspecieEntity toEntity(){
        EspecieEntity entity = new EspecieEntity();
        entity.setEspecie(this.Especie);
        entity.setId(this.id);
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }
    
    
}
