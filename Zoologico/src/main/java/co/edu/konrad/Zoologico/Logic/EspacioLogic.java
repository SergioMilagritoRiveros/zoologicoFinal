/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;

import co.edu.konrad.Zoologico.Entities.EspacioEntity;
import co.edu.konrad.Zoologico.Persistence.EspacioPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * manejar la logica de negocios de carrito
 *
 * @author Sergio E. Riveros
 */
@Stateless
public class EspacioLogic {

    @Inject
    private EspacioPersistence persistance;

    public List<EspacioEntity> obtenerEspacio() {
        List<EspacioEntity> espacio=persistance.encontrarTodos();
        return espacio;
    }
     public EspacioEntity obtenerEspacioPorId(Long Id) throws IllegalAccessException {
        EspacioEntity espacio = persistance.encontrarPorId(Id);
        if (espacio == null) {
            throw new IllegalAccessException("el espacio no existe");
        }
        return espacio;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public EspacioEntity crearProducto(EspacioEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public EspacioEntity actualizarEspacio(Long Id, EspacioEntity espacio) {
        EspacioEntity espacioActualizar = persistance.actualizar(espacio);
        return espacioActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarEspacio(Long Id) {
        persistance.eliminar(Id);

    }
}

