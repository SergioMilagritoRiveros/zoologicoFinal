/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.HorarioAlimentacionEntity;
import java.util.Date;

/**
 *
 * @author ArturoC
 */
public class HorarioAlimentacionDTO {
    private Long id;
    private Date horaDesayuno;
    private Date horaComida;

    public HorarioAlimentacionDTO(HorarioAlimentacionEntity hor) {
        this.id = hor.getId();
        this.horaDesayuno = hor.getHoraDesayuno();
        this.horaComida = hor.getHoraComida();
    }
    
    public HorarioAlimentacionEntity toEntity(){
        HorarioAlimentacionEntity entity = new HorarioAlimentacionEntity();
        entity.setHoraComida(this.horaComida);
        entity.setId(this.id);
        entity.setHoraDesayuno(this.horaDesayuno);
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHoraDesayuno() {
        return horaDesayuno;
    }

    public void setHoraDesayuno(Date horaDesayuno) {
        this.horaDesayuno = horaDesayuno;
    }

    public Date getHoraComida() {
        return horaComida;
    }

    public void setHoraComida(Date horaComida) {
        this.horaComida = horaComida;
    }
    
    
}
