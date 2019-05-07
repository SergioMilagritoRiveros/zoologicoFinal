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
import co.edu.konrad.Zoologico.Entities.ZoologicoEntity;
import co.edu.konrad.Zoologico.Persistence.ZoologicoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class ZoologicoLogic {

    @Inject
    private ZoologicoPersistence persistance;

    public List<ZoologicoEntity> obtenerZoologico() {
        List<ZoologicoEntity>tipoIdentificacion=persistance.encontrarTodos();
        return tipoIdentificacion;
    }
     public ZoologicoEntity obtenerZoologicoPorId(Long Id) throws IllegalAccessException {
        ZoologicoEntity tipoI = persistance.encontrarPorId(Id);
        if (tipoI == null) {
            throw new IllegalAccessException("el Tipo de Identificacion no existe");
        }
        return tipoI;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public ZoologicoEntity crearProducto(ZoologicoEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public ZoologicoEntity actualizarZoologico(Long Id, ZoologicoEntity tipoEspacio) {
        ZoologicoEntity tipospacio = persistance.actualizar(tipoEspacio);
        return tipospacio;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarZoologico(Long Id) {
        persistance.eliminar(Id);

    }
}
