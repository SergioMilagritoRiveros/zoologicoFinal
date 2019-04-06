
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
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
    @Column(name = "AnimalID")
    private Long id;
    /*
    *atributo tipo animalID
     */
    @Column(name = "animalID")
    @OneToMany
    private TipoAnimalEntity animal;

    /*
    *atributo cantidad en habitad
     */
    @Column(name = "CantidadHabitad")
    private Long cantidadHabitad;
    /*
    *atributo cantidad total
     */
    @Column(name = "cantidadTotal")
    private Long cantidadTotal;
    /*
    *atributo horario de alimentacionID
     */
    @Column(name = "HorarioAlimentacionID")
    @OneToMany
    private HorarioAlimentacionEntity horarioAlimentacionID;
    /*
    *atributo espaciosID
     */
    @Column(name = "espaciosID")
    @OneToOne
    private EspacioEntity espaciosID;

    @Column(name = "RatingID")
    @OneToMany
    private RatingEntity RatingID;

    @Column(name = "NombreCientifico")
    private String nombreCientifico;

    @ManyToOne
    @JoinColumn
    @Column(name="empleadoID")
    private EmpleadoEntity EmpleadoEntityID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAnimalEntity getAnimal() {
        return animal;
    }

    public void setAnimal(TipoAnimalEntity animal) {
        this.animal = animal;
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

    public HorarioAlimentacionEntity getHorarioAlimentacionID() {
        return horarioAlimentacionID;
    }

    public void setHorarioAlimentacionID(HorarioAlimentacionEntity horarioAlimentacionID) {
        this.horarioAlimentacionID = horarioAlimentacionID;
    }

    public EspacioEntity getEspaciosID() {
        return espaciosID;
    }

    public void setEspaciosID(EspacioEntity espaciosID) {
        this.espaciosID = espaciosID;
    }

    public RatingEntity getRatingID() {
        return RatingID;
    }

    public void setRatingID(RatingEntity RatingID) {
        this.RatingID = RatingID;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public EmpleadoEntity getEmpleadoEntityID() {
        return EmpleadoEntityID;
    }

    public void setEmpleadoEntityID(EmpleadoEntity EmpleadoEntityID) {
        this.EmpleadoEntityID = EmpleadoEntityID;
    }


}