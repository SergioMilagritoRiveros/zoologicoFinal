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
import javax.persistence.ManyToOne;
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
    @Column(name="RegistroAlimentoID",nullable=false)
    private Long id;

     /*
    *atributo cantidad alimento
    */
    
    @Column(name="CantidadAlimento",nullable=false)
    private double cantidadAlimento;
    
    /*
    *atributo tipo alimento 
    */   
    @Column(name="TipoAlimentoID",nullable=false)
    private String tipoAlimento;
     
    @Column(name="TipoAnimalID")
    private Long tipoAnimalID;

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
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    

    public Long getTipoAnimalID() {
        return tipoAnimalID;
    }

    public void setTipoAnimalID(Long tipoAnimalID) {
        this.tipoAnimalID = tipoAnimalID;
    }
    
}