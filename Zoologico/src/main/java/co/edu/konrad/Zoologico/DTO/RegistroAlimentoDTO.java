/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.RegistroAlimentoEntity;
import co.edu.konrad.Zoologico.Entities.TipoAnimalEntity;

/**
 *
* @author ArturoC
 */
public class RegistroAlimentoDTO {
    private Long id;
    private double cantidadAlimento;
    private String TipoAlimento;
    private TipoAnimalEntity tipoAnimalID;

    public RegistroAlimentoDTO(RegistroAlimentoEntity reg) {
        this.id = reg.getId();
        this.cantidadAlimento = reg.getCantidadAlimento();
        this.TipoAlimento = reg.getTipoAlimento();
        this.tipoAnimalID = reg.getTipoAnimalID();
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
        return TipoAlimento;
    }

    public void setTipoAlimento(String TipoAlimento) {
        this.TipoAlimento = TipoAlimento;
    }

    public TipoAnimalEntity getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(TipoAnimalEntity tipoAnimalID) {
        this.tipoAnimalID = tipoAnimalID;
    }
    
    
}
