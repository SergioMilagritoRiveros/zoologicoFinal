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
    * atributo tamano
     */
    @Column(name = "NombreEspacio",nullable=false)
    private String nombreEspacio;
    /*
    * atributo tamano
     */
    @Column(name = "Tamano",nullable=false)
    private String tamano;
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Long getDsponibilidadPersonas() {
        return dsponibilidadPersonas;
    }

    public void setDsponibilidadPersonas(Long dsponibilidadPersonas) {
        this.dsponibilidadPersonas = dsponibilidadPersonas;
    }

} 