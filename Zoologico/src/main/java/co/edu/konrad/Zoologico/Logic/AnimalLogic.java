/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;

import co.edu.konrad.Zoologico.Entities.AnimalEntity;
import co.edu.konrad.Zoologico.Persistence.AnimalPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * manejar la logica de negocios de carrito
 *
 * @author Sergio E. Riveros
 */
@Stateless
public class AnimalLogic {

    @Inject
    private AnimalPersistence persistance;

    public List<AnimalEntity> obtenerAnimales() {
        List<AnimalEntity> animales=persistance.encontrarTodos();
        return animales;
    }
     public AnimalEntity obtenerAnimalPorId(Long Id) throws IllegalAccessException {
        AnimalEntity animal = persistance.encontrarPorId(Id);
        if (animal == null) {
            throw new IllegalAccessException("el animal no existe");
        }
        return animal;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public AnimalEntity crearAnimal(AnimalEntity ani) {
        persistance.inserta(ani);
        return ani;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public AnimalEntity actualizarAnimal(Long Id, AnimalEntity ani) {
        AnimalEntity AnimalActualizar = persistance.actualizar(ani);
        return AnimalActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarAnimal(Long Id) {
        persistance.eliminar(Id);

    }
}
