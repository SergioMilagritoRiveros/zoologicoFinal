/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Entities;

/**
 *
 * @author Julia
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserEntity implements Serializable {

    /*
    * llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USerId",nullable=false)
    private Long id;
    /*
    *atributo tipo animalID
     */

    @Column(name = "tipoUser",nullable=false)
    private String tipoUser;

    /*
    *atributo cantidad en habitad
     */
    @Column(name = "correoElectronico",nullable=false)
    private String correoElectronico;
    /*
    *atributo cantidad total
     */
    @Column(name = "nombre",nullable=false)
    private String nombre;
    
    
    @Column(name = "apellido",nullable=false)
    private String apellido;
    
      @Column(name = "contrasena",nullable=false)
    private String contrasena;


    /*
    *atributo horario de alimentacionID
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }



}
