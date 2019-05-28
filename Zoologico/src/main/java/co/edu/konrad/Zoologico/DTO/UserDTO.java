/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.UserEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julia
 */
public class UserDTO {

    private Long id;
    private String tipoUser;
    private String correoElectronico;
    private String nombre;
    private String apellido;
    private String contrasena;

    public UserDTO(UserEntity empleado) {
        this.id = empleado.getId();
        this.tipoUser = empleado.getTipoUser();
        this.correoElectronico = empleado.getCorreoElectronico();
        this.nombre = empleado.getNombre();
        this.apellido = empleado.getApellido();
        this.contrasena = empleado.getContrasena();
    }

    public UserEntity toEntity() {
        UserEntity entity = new UserEntity();
        entity.setId(this.id);
        entity.setTipoUser(this.tipoUser);
        entity.setCorreoElectronico(this.correoElectronico);
        entity.setNombre(this.nombre);
        entity.setApellido(this.apellido);
        entity.setContrasena(this.contrasena);
        return entity;
    }

    public static List<UserDTO> toUserList(List<UserEntity> listaEmpleado) {
        List<UserDTO> listaEmpleadoDTO = new ArrayList<>();
        for (UserEntity entity : listaEmpleado) {
            listaEmpleadoDTO.add(new UserDTO(entity));
        }
        return listaEmpleadoDTO;
    }

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
