/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.EspecieEntity;
import co.edu.konrad.Zoologico.Entities.HorarioAlimentacionEntity;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class HorarioAlimentacionDTO {
    private Long id;
    private String horaDesayuno;
    private String horaComida;

    public HorarioAlimentacionDTO() {
    }
    

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
    
    public static List<HorarioAlimentacionDTO> toHorarioAlimentacionList(List<HorarioAlimentacionEntity> listaHorarioAlimentacion){
        List<HorarioAlimentacionDTO> listaHorarioAlimentacionDTO = new ArrayList<>();
        for(HorarioAlimentacionEntity entity : listaHorarioAlimentacion){
            listaHorarioAlimentacionDTO.add(new HorarioAlimentacionDTO(entity));
        }
        return listaHorarioAlimentacionDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoraDesayuno() {
        return horaDesayuno;
    }

    public void setHoraDesayuno(String horaDesayuno) {
        this.horaDesayuno = horaDesayuno;
    }

    public String getHoraComida() {
        return horaComida;
    }

    public void setHoraComida(String horaComida) {
        this.horaComida = horaComida;
    }

   

   
}
