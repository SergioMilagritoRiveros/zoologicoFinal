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
import co.edu.konrad.Zoologico.Entities.EspecieEntity;
import co.edu.konrad.Zoologico.Persistence.EspeciePersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class EspecieLogic {

    @Inject
    private EspeciePersistence persistance;

    public List<EspecieEntity> obtenerEspecie() {
        List<EspecieEntity> especie=persistance.encontrarTodos();
        return especie;
    }
     public EspecieEntity obtenerEspeciePorId(Long Id) throws IllegalAccessException {
        EspecieEntity especie = persistance.encontrarPorId(Id);
        if (especie == null) {
            throw new IllegalAccessException("la especie no existe");
        }
        return especie;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public EspecieEntity crearProducto(EspecieEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public EspecieEntity actualizarEspecie(Long Id, EspecieEntity especie) {
        EspecieEntity especieActualizar = persistance.actualizar(especie);
        return especieActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarEspecie(Long Id) {
        persistance.eliminar(Id);

    }
}


