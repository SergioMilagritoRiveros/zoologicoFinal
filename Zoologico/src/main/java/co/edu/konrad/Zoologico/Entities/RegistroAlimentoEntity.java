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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class RegistroAlimentoEntity implements Serializable {
    /*
    * llave primaria
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RegistroAlimentoID")
    private Long id;

     /*
    *atributo cantidad alimento
    */
    
    @Column(name="CantidadAlimento")
    private double cantidadAlimento;
    /*
    *atributo tipo alimento 
    */   
    @Column(name="TipoAlimentoID")
    private String TipoAlimento;
    @JoinColumn
    @OneToMany
    @Column(name="TipoAnimalID")
    private TipoAnimalEntity tipoAnimalID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(double cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public String getTipoAlimento() {
        return TipoAlimento;
    }

    public void setTipoAlimento(String TipoAlimento) {
        this.TipoAlimento = TipoAlimento;
    }

    public TipoAnimalEntity getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(TipoAnimalEntity tipoAnimalID) {
        this.tipoAnimalID = tipoAnimalID;
    }
    
}