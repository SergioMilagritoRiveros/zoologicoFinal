/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.RatingEntity;

/**
 *
 * @author ArturoC
 */
public class RatingDTO {
    private Long id;
    private Long puntuacion;
    private String comentario;

    public RatingDTO(RatingEntity rating) {
        this.id = rating.getId();
        this.puntuacion = rating.getPuntuacion();
        this.comentario = rating.getComentario();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Long puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
