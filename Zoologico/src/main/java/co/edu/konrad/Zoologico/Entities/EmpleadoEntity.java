/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;

/**
 *
 * @author SErgio Riveros
 */
@Entity
public class EmpleadoEntity implements Serializable{
    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmpleadoID")
    private Long id;

     @Column(name="TipoEmpleadoID")
    @ManyToOne
    private TipoEmpleadoEntity tipoEmpleadoID;

     @Column(name="Nombre")
    private String nombreEmpleado;

      @Column(name="TipoIdentificacionID")
    @ManyToOne
    private TipoEmpleadoEntity tipoIdentificacionID;

      @Column(name="NumeroIdentificacion")
    private long numeroIdentificacion;

      /*
    *atributo numero telefono
    */
    @Column(name="NumeroTelefono")
    private long numeroTelefono;
    /*
    *atributo fecha nacimiento
    */
    @Column(name="FechaNacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nacimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoEmpleadoEntity getTipoEmpleadoID() {
        return tipoEmpleadoID;
    }

    public void setTipoEmpleadoID(TipoEmpleadoEntity tipoEmpleadoID) {
        this.tipoEmpleadoID = tipoEmpleadoID;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public TipoIdentificacionEntity getTipoIdentificacionID() {
        return tipoIdentificacionID;
    }

    public void setTipoIdentificacionID(TipoIdentificacionEntity tipoIdentificacionID) {
        this.tipoIdentificacionID = tipoIdentificacionID;
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

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }


}