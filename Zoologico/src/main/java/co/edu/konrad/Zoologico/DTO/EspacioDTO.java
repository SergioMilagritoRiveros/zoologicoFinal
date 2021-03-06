/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;

/**
 *
 * @author ArturoC
 */
public class EspacioDTO {
    private Long id;
    private String nombreEspacio;
    private String ubicacion;
    private Boolean disponibilidad;
    private TipoEspacioEntity tipoEspacioID;

    public EspacioDTO(EspacioEntity espacio) {
        this.id = espacio.getId();
        this.nombreEspacio = espacio.getNombreEspacio();
        this.ubicacion = espacio.getUbicacion();
        this.disponibilidad = espacio.getDisponibilidad();
        this.tipoEspacioID = espacio.getTipoEspacioID();
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

    public TipoEspacioEntity getTipoEspacioID() {
        return tipoEspacioID;
    }

    public void setTipoEspacioID(TipoEspacioEntity tipoEspacioID) {
        this.tipoEspacioID = tipoEspacioID;
    }
    
    
    
}
