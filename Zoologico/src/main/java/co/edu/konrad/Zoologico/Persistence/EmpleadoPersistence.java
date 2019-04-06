/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.EmpleadoEntity;
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
public class EmpleadoPersistence {
    /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="zoologicoPU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<EmpleadoEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from EmpleadoEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public EmpleadoEntity encontrarPorId(Long id ){
        return em.find(EmpleadoEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public EmpleadoEntity inserta(EmpleadoEntity entity){
        em.persist(entity);
        return entity;
    }
    /*
    *actualizar los datos de una endtidad
    */
    public EmpleadoEntity actualizar(EmpleadoEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    EmpleadoEntity productoEliminar=em.find(EmpleadoEntity.class, Id);
    em.remove(productoEliminar);
    }
}
