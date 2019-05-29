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
 *
 * @author Sergio Riveros
 */
@Entity
public class TipoEspacioEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TipoEspacioID",nullable=false)
    private Long id;

    /*
    * atributo tamaño
     */
    @Column(name = "NombreEspacio",nullable=false)
    private String nombreEspacio;
    /*
    * atributo tamaño
     */
    @Column(name = "Tamaño",nullable=false)
    private String tamaño;
    /*
    * atributo dsponibilidad personas
     */
    @Column(name = "DisponibilidadPersonas",nullable=false)
    private Long dsponibilidadPersonas;

    public TipoEspacioEntity() {
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Long getDsponibilidadPersonas() {
        return dsponibilidadPersonas;
    }

    public void setDsponibilidadPersonas(Long dsponibilidadPersonas) {
        this.dsponibilidadPersonas = dsponibilidadPersonas;
    }

} 