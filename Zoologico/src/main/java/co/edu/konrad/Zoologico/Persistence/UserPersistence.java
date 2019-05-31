/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.UserEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Julia
 */
@Stateless
public class UserPersistence {
    
     /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="zoologicoPU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<UserEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from UserEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public UserEntity encontrarPorId(Long id ){
        return em.find(UserEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public UserEntity create(UserEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }
    /*
    *actualizar los datos de una endtidad
    */
    public UserEntity actualizar(UserEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    UserEntity animalEliminar=em.find(UserEntity.class, Id);
    em.remove(animalEliminar);
    }
}
