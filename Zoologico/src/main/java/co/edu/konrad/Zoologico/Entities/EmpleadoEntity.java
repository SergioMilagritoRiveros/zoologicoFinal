package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Sergio Riveros
 */
@Entity
public class EmpleadoEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmpleadoID",nullable=false)
    private Long id;




    @Column(name = "Nombre",nullable=false)
    private String nombreEmpleado;

    @Column(name = "TipoIdentificacionID",nullable=false)
    private Long tipoIdentificacionID;

    @Column(name = "NumeroIdentificacion")
    private long numeroIdentificacion;

    /*
    *atributo numero telefono
     */
    @Column(name = "NumeroTelefono")
    private long numeroTelefono;
    /*
    *atributo fecha nacimiento
     */
    @Column(name = "FechaNacimiento")
    private String nacimiento;

    public Long getId() {
        return id;
    }

  
    public Long getTipoIdentificacionID() {
        return tipoIdentificacionID;
    }

    public void setTipoIdentificacionID(Long tipoIdentificacionID) {
        this.tipoIdentificacionID = tipoIdentificacionID;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }


}
