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
import co.edu.konrad.Zoologico.Entities.TipoAnimalEntity;
import co.edu.konrad.Zoologico.Persistence.TipoAnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * manejar la logica de negocios de carrito
 *
 * @author Sergio E. Riveros
 */
@Stateless
public class TipoAnimalLogic {

    @Inject
    private TipoAnimalPersistence persistance;

    public List<TipoAnimalEntity> obtenerTipoAnimal() {
        List<TipoAnimalEntity> tipoAnimales=persistance.encontrarTodos();
        return tipoAnimales;
    }
     public TipoAnimalEntity obtenerTipoAnimalPorId(Long Id) throws IllegalAccessException {
        TipoAnimalEntity tipoAnimal = persistance.encontrarPorId(Id);
        if (tipoAnimal == null) {
            throw new IllegalAccessException("el tipo de animal no existe");
        }
        return tipoAnimal;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public TipoAnimalEntity crearTipoAnimal(TipoAnimalEntity tani) {
        persistance.inserta(tani);
        return tani;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public TipoAnimalEntity actualizarTipoAnimal(Long Id, TipoAnimalEntity tani) {
        TipoAnimalEntity tipoAnimalActualizar = persistance.actualizar(tani);
        return tipoAnimalActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarTipoAnimal(Long Id) {
        persistance.eliminar(Id);

    }
}
