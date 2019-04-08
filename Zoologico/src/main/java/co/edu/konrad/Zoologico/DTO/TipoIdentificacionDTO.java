/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.TipoIdentificacionEntity;

/**
 *
 * @author ArturoC
 */
public class TipoIdentificacionDTO {
    private Long id;
    private String TipoIdentificacion;

    public TipoIdentificacionDTO(TipoIdentificacionEntity tip) {
        this.id = tip.getId();
        this.TipoIdentificacion = tip.getTipoIdentificacion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.TipoIdentificacion = TipoIdentificacion;
    }
    
    
}
