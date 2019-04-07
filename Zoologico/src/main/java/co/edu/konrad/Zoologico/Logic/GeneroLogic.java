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
import co.edu.konrad.Zoologico.Entities.GeneroEntity;
import co.edu.konrad.Zoologico.Persistence.GeneroPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class GeneroLogic {

    @Inject
    private GeneroPersistence persistance;

    public List<GeneroEntity> obtenerGenero() {
        List<GeneroEntity> genero=persistance.encontrarTodos();
        return genero;
    }
     public GeneroEntity obtenerGeneroPorId(Long Id) throws IllegalAccessException {
        GeneroEntity genero = persistance.encontrarPorId(Id);
        if (genero == null) {
            throw new IllegalAccessException("el producto no existe");
        }
        return genero;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public GeneroEntity crearGenero(GeneroEntity genero) {
        persistance.inserta(genero);
        return genero;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public GeneroEntity actualizarAnimal(Long Id, GeneroEntity genero) {
        GeneroEntity generoActualizar = persistance.actualizar(genero);
        return generoActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarGenero(Long Id) {
        persistance.eliminar(Id);

    }
}


