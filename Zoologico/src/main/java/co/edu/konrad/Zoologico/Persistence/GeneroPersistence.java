/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.GeneroEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Sergio Riveros
 */
@Stateless
public class GeneroPersistence {
    /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="zoologicoPU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<GeneroEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from GeneroEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public GeneroEntity encontrarPorId(Long id ){
        return em.find(GeneroEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public GeneroEntity inserta(GeneroEntity entity){
        em.persist(entity);
        return entity;
    }
    /*
    *actualizar los datos de una endtidad
    */
    public GeneroEntity actualizar(GeneroEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    GeneroEntity productoEliminar=em.find(GeneroEntity.class, Id);
    em.remove(productoEliminar);
    } 
}
