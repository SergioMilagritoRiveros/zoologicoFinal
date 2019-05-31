/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.EspecieEntity;
import co.edu.konrad.Zoologico.Entities.RegistroAlimentoEntity;
import co.edu.konrad.Zoologico.Entities.TipoAnimalEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
* @author ArturoC
 */
public class RegistroAlimentoDTO {
    private Long id;
    private double cantidadAlimento;
    private String tipoAlimento;
    private Long tipoAnimalID;

    public RegistroAlimentoDTO() {
    }
    

    public RegistroAlimentoDTO(RegistroAlimentoEntity reg) {
        this.id = reg.getId();
        this.cantidadAlimento = reg.getCantidadAlimento();
        this.tipoAlimento = reg.getTipoAlimento();
        this.tipoAnimalID = reg.getTipoAnimalID();
    }
    
    public RegistroAlimentoEntity toEntity(){
        RegistroAlimentoEntity entity = new RegistroAlimentoEntity();
        entity.setId(this.id);
        entity.setCantidadAlimento(this.cantidadAlimento);
        entity.setTipoAlimento(this.tipoAlimento);
        entity.setTipoAnimalID(this.tipoAnimalID);
        return entity;
    }
    
    public static List<RegistroAlimentoDTO> toRegistroAlimentoList(List<RegistroAlimentoEntity> listaRegistroAlimento){
        List<RegistroAlimentoDTO> listaRegistroAlimentoDTO = new ArrayList<>();
        for(RegistroAlimentoEntity entity : listaRegistroAlimento){
            listaRegistroAlimentoDTO.add(new RegistroAlimentoDTO(entity));
        }
        return listaRegistroAlimentoDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(double cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String TipoAlimento) {
        this.tipoAlimento = TipoAlimento;
    }

    public Long getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(Long tipoAnimalID) {
        this.tipoAnimalID = tipoAnimalID;
    }

    
    
    
}
