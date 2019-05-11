/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.EspecieEntity;
import co.edu.konrad.Zoologico.Entities.TipoEspacioEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class TipoEspacioDTO {
    private Long id;
    private String nombreEspacio;
    private String tamaño;
    private Long dsponibilidadPersonas;

    public TipoEspacioDTO() {
    }
    

    public TipoEspacioDTO(TipoEspacioEntity tip) {
        this.id = tip.getId();
        this.nombreEspacio = tip.getNombreEspacio();
        this.tamaño = tip.getTamaño();
        this.dsponibilidadPersonas = tip.getDsponibilidadPersonas();
    }
    
    public TipoEspacioEntity toEntity(){
        TipoEspacioEntity entity = new TipoEspacioEntity();
        entity.setId(this.id);
        entity.setDsponibilidadPersonas(this.dsponibilidadPersonas);
        entity.setNombreEspacio(this.nombreEspacio);
        entity.setTamaño(this.tamaño);
        return entity;
    }
    
    public static List<TipoEspacioDTO> toTipoEspacioList(List<TipoEspacioEntity> listaTipoEspacio){
        List<TipoEspacioDTO> listaTipoEspacioDTO = new ArrayList<>();
        for(TipoEspacioEntity entity : listaTipoEspacio){
            listaTipoEspacioDTO.add(new TipoEspacioDTO(entity));
        }
        return listaTipoEspacioDTO;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Long getDsponibilidadPersonas() {
        return dsponibilidadPersonas;
    }

    public void setDsponibilidadPersonas(Long dsponibilidadPersonas) {
        this.dsponibilidadPersonas = dsponibilidadPersonas;
    }
    
    
}
