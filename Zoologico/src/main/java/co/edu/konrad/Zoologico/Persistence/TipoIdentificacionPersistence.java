/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.TipoIdentificacionEntity;
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
public class TipoIdentificacionPersistence {
    /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<TipoIdentificacionEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from TipoIdentificacionEntity ");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public TipoIdentificacionEntity encontrarPorId(Long id) {
        return em.find(TipoIdentificacionEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public TipoIdentificacionEntity create(TipoIdentificacionEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public TipoIdentificacionEntity actualizar(TipoIdentificacionEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id de una entidad
     */
    public void eliminar(Long Id) {
        TipoIdentificacionEntity productoEliminar = em.find(TipoIdentificacionEntity.class, Id);
        em.remove(productoEliminar);
    }
}
