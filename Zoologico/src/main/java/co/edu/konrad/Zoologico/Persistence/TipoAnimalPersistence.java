/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.TipoAnimalEntity;
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
public class TipoAnimalPersistence {
    /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<TipoAnimalEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from TipoAnimalEntity ");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public TipoAnimalEntity encontrarPorId(Long id) {
        return em.find(TipoAnimalEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public TipoAnimalEntity create(TipoAnimalEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public TipoAnimalEntity actualizar(TipoAnimalEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id de una entidad
     */
    public void eliminar(Long Id) {
        TipoAnimalEntity productoEliminar = em.find(TipoAnimalEntity.class, Id);
        em.remove(productoEliminar);
    }     
}
