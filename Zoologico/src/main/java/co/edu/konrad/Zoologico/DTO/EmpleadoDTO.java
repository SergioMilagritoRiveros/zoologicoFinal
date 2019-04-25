/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ArturoC
 */
public class EmpleadoDTO {
    
    private Long id;
    private TipoEmpleadoEntity tipoEmpleadoID;
    private String nombreEmpleado;
    private TipoEmpleadoEntity tipoIdentificacionID;
    private long numeroIdentificacion;
    private long numeroTelefono;
    private Date nacimiento;

    public EmpleadoDTO(EmpleadoEntity empleado) {
        this.id = empleado.getId();
        this.tipoEmpleadoID = empleado.getTipoEmpleadoID();
        this.nombreEmpleado = empleado.getNombreEmpleado();
        this.tipoIdentificacionID = empleado.getTipoEmpleadoID();
        this.numeroIdentificacion = empleado.getNumeroIdentificacion();
        this.numeroTelefono = empleado.getNumeroTelefono();
        this.nacimiento = empleado.getNacimiento();
    }
    
    public  EmpleadoEntity toEntity(){
         EmpleadoEntity entity = new  EmpleadoEntity();
        entity.setId(this.id);
        entity.setNacimiento(this.nacimiento);
        entity.setNombreEmpleado(this.nombreEmpleado);
        entity.setNumeroIdentificacion(this.numeroIdentificacion);
        entity.setNumeroTelefono(this.numeroTelefono);
        entity.setTipoEmpleadoID(this.tipoEmpleadoID);
        entity.setTipoIdentificacionID(this.tipoIdentificacionID);
        return entity;
    }
    
    public static List<EmpleadoDTO> toEmpleadoList(List<EmpleadoEntity> listaEmpleado){
        List<EmpleadoDTO> listaEmpleadoDTO = new ArrayList<>();
        for(EmpleadoEntity entity : listaEmpleado){
            listaEmpleadoDTO.add(new EmpleadoDTO(entity));
        }
        return listaEmpleadoDTO;
    }

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

    public TipoEmpleadoEntity getTipoIdentificacionID() {
        return tipoIdentificacionID;
    }

    public void setTipoIdentificacionID(TipoEmpleadoEntity tipoIdentificacionID) {
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
