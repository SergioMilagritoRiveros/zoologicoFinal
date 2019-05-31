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
public class EspecieEntity implements Serializable {

    /*
    * llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EspecieID",nullable=false)
    private Long id;
    /*
    *atributo especie
     */
    @Column(name = "Especie",nullable=false)
    private String especie;

    public EspecieEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    

}
