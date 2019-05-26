
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @Temporal(TemporalType.DATE)
    private Date horaDesayuno;
    /*
    *atributo hora comida
    */
    @Column(name="HoraComida")
    @Temporal(TemporalType.DATE)
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