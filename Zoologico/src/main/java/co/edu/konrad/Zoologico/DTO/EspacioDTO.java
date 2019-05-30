/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class EspacioDTO {
    private Long id;
    private String nombreEspacio;
    private String ubicacion;
    private Boolean disponibilidad;
    private TipoEspacioDTO tipoEspacioID;

    public EspacioDTO() {
    }
    

    public EspacioDTO(EspacioEntity espacio) {
        this.id = espacio.getId();
        this.nombreEspacio = espacio.getNombreEspacio();
        this.ubicacion = espacio.getUbicacion();
        this.disponibilidad = espacio.getDisponibilidad();
        if(espacio.getTipoEspacioID() != null){
            TipoEspacioDTO e = new TipoEspacioDTO(espacio.getTipoEspacioID());
            this.tipoEspacioID = e;
        }
    }
    
    public static List<EspacioDTO> toEspacioList(List<EspacioEntity> listaEspacio){
        List<EspacioDTO> listaEspacioDTO = new ArrayList<>();
        for(EspacioEntity entity : listaEspacio){
            listaEspacioDTO.add(new EspacioDTO(entity));
        }
        return listaEspacioDTO;
    }
    
    public EspacioEntity toEntity(){
        EspacioEntity entity = new EspacioEntity();
        entity.setDisponibilidad(this.disponibilidad);
        entity.setId(this.id);
        entity.setNombreEspacio(this.nombreEspacio);
        if (this.tipoEspacioID != null) {
            entity.setTipoEspacioID(this.tipoEspacioID.toEntity());
        }
        entity.setUbicacion(this.ubicacion);
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public TipoEspacioDTO getTipoEspacioID() {
        return tipoEspacioID;
    }

    public void setTipoEspacioID(TipoEspacioDTO tipoEspacioID) {
        this.tipoEspacioID = tipoEspacioID;
    }

    
    
    
    
}
