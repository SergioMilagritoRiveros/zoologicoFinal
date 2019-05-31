/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.ShowEntity;
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
public class ShowPersistence {
    /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<ShowEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from ShowEntity p");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public ShowEntity encontrarPorId(Long id) {
        return em.find(ShowEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public ShowEntity create(ShowEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public ShowEntity actualizar(ShowEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id una entidad
     */
    public void eliminar(Long Id) {
        ShowEntity productoEliminar = em.find(ShowEntity.class, Id);
        em.remove(productoEliminar);
    }   
}
