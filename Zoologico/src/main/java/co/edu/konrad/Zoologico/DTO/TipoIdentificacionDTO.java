/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.TipoIdentificacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class TipoIdentificacionDTO {
    private Long id;
    private String tipoIdentificacion;

    public TipoIdentificacionDTO() {
    }
    

    public TipoIdentificacionDTO(TipoIdentificacionEntity tip) {
        this.id = tip.getId();
        this.tipoIdentificacion = tip.getTipoIdentificacion();
    }
    
    public TipoIdentificacionEntity toEntity(){
        TipoIdentificacionEntity entity = new TipoIdentificacionEntity();
        entity.setId(this.id);
        entity.setTipoIdentificacion(this.tipoIdentificacion);
        return entity;
    }
    
    public static List<TipoIdentificacionDTO> toTipoIdentificacionList(List<TipoIdentificacionEntity> listaTipoIdentificacion){
        List<TipoIdentificacionDTO> listaTipoIdentificacionDTO = new ArrayList<>();
        for(TipoIdentificacionEntity entity : listaTipoIdentificacion){
            listaTipoIdentificacionDTO.add(new TipoIdentificacionDTO(entity));
        }
        return listaTipoIdentificacionDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.tipoIdentificacion = TipoIdentificacion;
    }
    
    
}
