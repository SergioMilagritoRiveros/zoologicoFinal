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
import co.edu.konrad.Zoologico.Entities.TipoEmpleadoEntity;
import co.edu.konrad.Zoologico.Persistence.TipoEmpleadoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class TipoEmpleadoLogic {

    @Inject
    private TipoEmpleadoPersistence persistance;

    public List<TipoEmpleadoEntity> obtenerTipoEmpleado() {
        List<TipoEmpleadoEntity>tipoEmpleado=persistance.encontrarTodos();
        return tipoEmpleado;
    }
     public TipoEmpleadoEntity obtenerTipoEmpleadoPorId(Long Id) throws IllegalAccessException {
        TipoEmpleadoEntity tipoEmpleado = persistance.encontrarPorId(Id);
        if (tipoEmpleado == null) {
            throw new IllegalAccessException("el Tipo de Empleado no existe");
        }
        return tipoEmpleado;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public TipoEmpleadoEntity crearTipoEmpleado(TipoEmpleadoEntity tipoempleado) {
        persistance.inserta(tipoempleado);
        return tipoempleado;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public TipoEmpleadoEntity actualizarTipoEmpleado(Long Id, TipoEmpleadoEntity tipoEmpleado) {
        TipoEmpleadoEntity tipoEmpleadoEntity = persistance.actualizar(tipoEmpleado);
        return tipoEmpleadoEntity;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarHorarioTipoEmpleado(Long Id) {
        persistance.eliminar(Id);

    }
}

