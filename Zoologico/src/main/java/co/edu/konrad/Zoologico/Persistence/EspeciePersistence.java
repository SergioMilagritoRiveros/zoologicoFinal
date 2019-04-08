/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.EspecieEntity;
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
public class EspeciePersistence {
      /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="zoologicoPU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<EspecieEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from EspecieEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public EspecieEntity encontrarPorId(Long id ){
        return em.find(EspecieEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public EspecieEntity inserta(EspecieEntity entity){
        em.persist(entity);
        return entity;
    }
    /*
    *actualizar los datos de una endtidad
    */
    public EspecieEntity actualizar(EspecieEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    EspecieEntity productoEliminar=em.find(EspecieEntity.class, Id);
    em.remove(productoEliminar);
    }
}
