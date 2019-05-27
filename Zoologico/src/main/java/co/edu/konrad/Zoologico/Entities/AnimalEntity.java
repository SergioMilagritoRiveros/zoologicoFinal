
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
    @Column(name = "AnimalID")
    private Long id;
    /*
    *atributo tipo animalID
     */
    @ManyToOne
    @JoinColumn(name = "tipoAnimalID")
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
    @ManyToOne
    @JoinColumn(name = "HorarioAlimentacionID")
    private HorarioAlimentacionEntity horarioAlimentacionID;
    /*
    *atributo espaciosID
     */
    @OneToOne
    @JoinColumn(name = "espaciosID")
    private EspacioEntity espaciosID;
   
    @OneToMany
    @JoinColumn(name = "RatingID")
    private List<RatingEntity> RatingID;

    @Column(name = "NombreCientifico")
    private String nombreCientifico;

    @ManyToOne
    @JoinColumn(name="empleadoID")
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

    public List<RatingEntity> getRatingID() {
        return RatingID;
    }

    public void setRatingID(List<RatingEntity> RatingID) {
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