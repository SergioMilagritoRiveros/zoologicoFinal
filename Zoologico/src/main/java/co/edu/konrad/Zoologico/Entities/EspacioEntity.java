
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sergio Riveros
 */
@Entity
public class EspacioEntity implements Serializable {

   /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EspacioID")
    private Long id;
    /*
    *atributo nombre del espacio
     */
    @Column(name = "nombre_espacio")
    private String nombreEspacio;
    /*
    *atributo ubibcacion
     */
    @Column(name = "Ubicacion")
    private String ubicacion;
    /*
    *atributo disponibilidad
     */
    @JoinColumn
    @Column(name = "Disponibilidad")
    private Boolean disponibilidad;
    /*
    *atributo tipo de espacio
     */

    @Column(name = "TipoEspacioID")
    @ManyToOne
    private TipoEspacioEntity tipoEspacioID;

    public EspacioEntity() {
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.ubicacion = Ubicacion;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public TipoEspacioEntity getTipoEspacioID() {
        return tipoEspacioID;
    }

    public void setTipoEspacioID(TipoEspacioEntity tipoEspacioID) {
        this.tipoEspacioID = tipoEspacioID;
    }

} 

