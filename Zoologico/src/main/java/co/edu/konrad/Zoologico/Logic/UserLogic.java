/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;

import co.edu.konrad.Zoologico.Entities.UserEntity;
import co.edu.konrad.Zoologico.Persistence.UserPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Julia
 */
@Stateless
public class UserLogic {
    
    @Inject
    private UserPersistence persistance;

    public List<UserEntity> obtenerUseres() {
        List<UserEntity> animales=persistance.encontrarTodos();
        return animales;
    }
     public UserEntity obtenerUserPorId(Long Id) throws IllegalAccessException {
        UserEntity animal = persistance.encontrarPorId(Id);
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
    public UserEntity crearProducto(UserEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public UserEntity actualizarUser(Long Id, UserEntity ani) {
        UserEntity UserActualizar = persistance.actualizar(ani);
        return UserActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarUser(Long Id) {
        persistance.eliminar(Id);

    }
}
