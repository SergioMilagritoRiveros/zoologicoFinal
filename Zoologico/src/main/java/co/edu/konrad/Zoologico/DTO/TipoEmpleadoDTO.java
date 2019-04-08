/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.DTO;

import co.edu.konrad.Zoologico.Entities.*;

/**
 *
 * @author ArturoC
 */
public class TipoEmpleadoDTO {
    private Long id;
    private Long HorasDiarias;
    private String Ocupacion;
    private double Salario;

    public TipoEmpleadoDTO(TipoEmpleadoEntity tip) {
        this.id = tip.getId();
        this.HorasDiarias = tip.getHorasDiarias();
        this.Ocupacion = tip.getOcupacion();
        this.Salario = tip.getSalario();
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
