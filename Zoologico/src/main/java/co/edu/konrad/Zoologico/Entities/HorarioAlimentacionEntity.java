
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * entidad de horario de alimentacion
 * @author Sergio Riveros
 */
@Entity
public class HorarioAlimentacionEntity implements Serializable {
     /*
    * llave primaria
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="HorarioAlimentacionID")
    private Long id;
    /*
    *atributo hora desayuno
    */
    @Column(name="HoraDesayuno")
    
    private String horaDesayuno;
    /*
    *atributo hora comida
    */
    @Column(name="HoraComida")
   
    private String horaComida;

    public HorarioAlimentacionEntity() {
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