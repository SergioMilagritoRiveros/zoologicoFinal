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
import co.edu.konrad.Zoologico.Entities.TipoEspacioEntity;
import co.edu.konrad.Zoologico.Persistence.TipoEspacioPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class TipoEspacioLogic {

    @Inject
    private TipoEspacioPersistence persistance;

    public List<TipoEspacioEntity> obtenerTipoEspacio() {
        List<TipoEspacioEntity>tipoEspacio=persistance.encontrarTodos();
        return tipoEspacio;
    }
     public TipoEspacioEntity obtenerTipoEspacioPorId(Long Id) throws IllegalAccessException {
        TipoEspacioEntity tipoEspacio = persistance.encontrarPorId(Id);
        if (tipoEspacio == null) {
            throw new IllegalAccessException("el Tipo de Empleado no existe");
        }
        return tipoEspacio;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public TipoEspacioEntity crearProducto(TipoEspacioEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public TipoEspacioEntity actualizarTipoEspacio(Long Id, TipoEspacioEntity tipoEspacio) {
        TipoEspacioEntity tipospacio = persistance.actualizar(tipoEspacio);
        return tipospacio;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarTipoEspacio(Long Id) {
        persistance.eliminar(Id);

    }
}

