/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.ZoologicoEntity;
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
public class ZoologicoPersistence {
 /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<ZoologicoEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from ZoologicoEntity p");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public ZoologicoEntity encontrarPorId(Long id) {
        return em.find(ZoologicoEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public ZoologicoEntity create(ZoologicoEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public ZoologicoEntity actualizar(ZoologicoEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id de una entidad
     */
    public void eliminar(Long Id) {
        ZoologicoEntity productoEliminar = em.find(ZoologicoEntity.class, Id);
        em.remove(productoEliminar);
    }   
}
