
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity
public class RatingEntity implements Serializable {
    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RatingID",nullable=false)
    private Long id;

    /*
    *atributo puntuacion
     */
    @Column(name = "Puntuacion",nullable=false)
    private Long puntuacion;
    /*
    *atributo comentario
     */
    @Column(name = "Comentario",nullable=false)
    private String comentario;

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