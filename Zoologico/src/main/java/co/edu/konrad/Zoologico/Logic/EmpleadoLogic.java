/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;


import co.edu.konrad.Zoologico.Entities.EmpleadoEntity;
import co.edu.konrad.Zoologico.Persistence.EmpleadoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * manejar la logica de negocios de carrito
 *
 * @author Sergio E. Riveros
 */
@Stateless
public class EmpleadoLogic {

    @Inject
    private EmpleadoPersistence persistance;

    public List<EmpleadoEntity> obtenerEmpleados() {
        List<EmpleadoEntity> empleado=persistance.encontrarTodos();
        return empleado;
    }
     public EmpleadoEntity obtenerEmpleadoPorId(Long Id) throws IllegalAccessException {
        EmpleadoEntity empleado = persistance.encontrarPorId(Id);
        if (empleado == null) {
            throw new IllegalAccessException("el empleado no existe");
        }
        return empleado;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public EmpleadoEntity crearEmpleado(EmpleadoEntity empleado) {
        persistance.inserta(empleado);
        return empleado;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public EmpleadoEntity actualizarAnimal(Long Id, EmpleadoEntity empleado) {
        EmpleadoEntity empleadoActualizar = persistance.actualizar(empleado);
        return empleadoActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarEmpleado(Long Id) {
        persistance.eliminar(Id);

    }
}
