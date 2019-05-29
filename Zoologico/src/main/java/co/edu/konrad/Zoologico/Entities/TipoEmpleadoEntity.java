/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * entidad de tipo de empleado
 * @author Sergio Riveros
 */
@Entity
public class TipoEmpleadoEntity implements Serializable {
    /*
    * llave primaria
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TipoEmpleadoID",nullable=false)
    private Long id;

     /*
    *atributo horas diarias
    */
    @Column(name="HorasDiarias",nullable=false)
    private Long HorasDiarias;
    /*
    *atributo ocupacion
    */
    @Column(name="Ocupacion",nullable=false)
    private String Ocupacion;
    /*
    *atributo salario
    */
    @Column(name="Salario",nullable=false)
    private double Salario;

    public TipoEmpleadoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHorasDiarias() {
        return HorasDiarias;
    }

    public void setHorasDiarias(Long HorasDiarias) {
        this.HorasDiarias = HorasDiarias;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }


}