
package co.edu.konrad.zoologico.entities;

import java.io.Serializable;
import java.util.Date;
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
    @Column(name="HorarioAlimentad¿cionID")
    private Long id;
    /*
    *atributo hora desayuno
    */
    @Column(name="HoraDesayuno")
    private Date horaDesayuno;
    /*
    *atributo hora comida
    */
    @Column(name="HoraComida")
    private Date horaComida;

    public HorarioAlimentacionEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHoraDesayuno() {
        return horaDesayuno;
    }

    public void setHoraDesayuno(Date horaDesayuno) {
        this.horaDesayuno = horaDesayuno;
    }

    public Date getHoraComida() {
        return horaComida;
    }

    public void setHoraComida(Date horaComida) {
        this.horaComida = horaComida;
    }
    
}