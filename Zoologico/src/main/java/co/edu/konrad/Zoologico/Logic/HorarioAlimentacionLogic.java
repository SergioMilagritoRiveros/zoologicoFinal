/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;

/**
 *
 * @author julian
 */
import co.edu.konrad.Zoologico.Entities.HorarioAlimentacionEntity;
import co.edu.konrad.Zoologico.Persistence.HorarioAlimentacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class HorarioAlimentacionLogic {

    @Inject
    private HorarioAlimentacionPersistence persistance;

    public List<HorarioAlimentacionEntity> obtenerHorarioAlimentacion() {
        List<HorarioAlimentacionEntity> horarioalimentacion=persistance.encontrarTodos();
        return horarioalimentacion;
    }
     public HorarioAlimentacionEntity obtenerHorarioAlimentacionPorId(Long Id) throws IllegalAccessException {
        HorarioAlimentacionEntity horarioalimentacion = persistance.encontrarPorId(Id);
        if (horarioalimentacion == null) {
            throw new IllegalAccessException("el horario de alimentacion no existe");
        }
        return horarioalimentacion;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public HorarioAlimentacionEntity crearProducto(HorarioAlimentacionEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public HorarioAlimentacionEntity actualizarHorarioAlimentacion(Long Id, HorarioAlimentacionEntity horarioalimentacion) {
        HorarioAlimentacionEntity horarioalimentacionActualizar = persistance.actualizar(horarioalimentacion);
        return horarioalimentacionActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarHorarioAlimentacion(Long Id) {
        persistance.eliminar(Id);

    }
}


