
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author SergioRiveros
 */
@Entity
public class AnimalEntity implements Serializable {

    /*
    * llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AnimalID",nullable=false)
    private Long id;
    /*
    *atributo tipo animalID
     */
    @Column(name = "tipoAnimalID")
    private Long animal;

    /*
    *atributo cantidad en habitad
     */
    @Column(name = "CantidadHabitad",nullable=false)
    private Long cantidadHabitad;
    /*
    *atributo cantidad total
     */
    @Column(name = "cantidadTotal",nullable=false)
    private Long cantidadTotal;
    /*
    *atributo horario de alimentacionID
     */ 
    @Column(name = "HorarioAlimentacionID")
    private Long horarioAlimentacionID;
    /*
    *atributo espaciosID
     */
    @Column(name = "espaciosID")
    private Long espaciosID;

    @Column(name = "NombreCientifico",nullable=false)
    private String nombreCientifico;

    @Column(name="empleadoID",nullable=false)
    private Long EmpleadoEntityID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   

    public Long getCantidadHabitad() {
        return cantidadHabitad;
    }

    public void setCantidadHabitad(Long cantidadHabitad) {
        this.cantidadHabitad = cantidadHabitad;
    }

    public Long getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Long cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Long getAnimal() {
        return animal;
    }

    public void setAnimal(Long animal) {
        this.animal = animal;
    }

    public Long getHorarioAlimentacionID() {
        return horarioAlimentacionID;
    }

    public void setHorarioAlimentacionID(Long horarioAlimentacionID) {
        this.horarioAlimentacionID = horarioAlimentacionID;
    }

    public Long getEspaciosID() {
        return espaciosID;
    }

    public void setEspaciosID(Long espaciosID) {
        this.espaciosID = espaciosID;
    }

    public Long getEmpleadoEntityID() {
        return EmpleadoEntityID;
    }

    public void setEmpleadoEntityID(Long EmpleadoEntityID) {
        this.EmpleadoEntityID = EmpleadoEntityID;
    }



    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }


}