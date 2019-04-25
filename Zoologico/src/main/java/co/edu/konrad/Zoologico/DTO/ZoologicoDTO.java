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
public class ZoologicoDTO {
    private Long id;
    private Long AsignacionEspaciosID;
    private ShowEntity ShowID;
    private AnimalEntity AnimalID;

    public ZoologicoDTO(ZoologicoEntity zoo) {
        this.id = zoo.getId();
        this.AsignacionEspaciosID = zoo.getAsignacionEspaciosID();
        this.ShowID = zoo.getShowID();
        this.AnimalID = zoo.getAnimalID();
    }
    
    public ZoologicoEntity toEntity(){
        ZoologicoEntity entity = new ZoologicoEntity();
        entity.setId(this.id);
        entity.setAsignacionEspaciosID(this.AsignacionEspaciosID);
        entity.setAnimalID(this.AnimalID);
        entity.setShowID(this.ShowID);
        return entity;
    }
    
    public static List<ZoologicoDTO> toZoologicoList(List<ZoologicoEntity> listaZoologico){
        List<ZoologicoDTO> listaZoologicoDTO = new ArrayList<>();
        for(ZoologicoEntity entity : listaZoologico){
            listaZoologicoDTO.add(new ZoologicoDTO(entity));
        }
        return listaZoologicoDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAsignacionEspaciosID() {
        return AsignacionEspaciosID;
    }

    public void setAsignacionEspaciosID(Long AsignacionEspaciosID) {
        this.AsignacionEspaciosID = AsignacionEspaciosID;
    }

    public ShowEntity getShowID() {
        return ShowID;
    }

    public void setShowID(ShowEntity ShowID) {
        this.ShowID = ShowID;
    }

    public AnimalEntity getAnimalID() {
        return AnimalID;
    }

    public void setAnimalID(AnimalEntity AnimalID) {
        this.AnimalID = AnimalID;
    }
    
    
}
