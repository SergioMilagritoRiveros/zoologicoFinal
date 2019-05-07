/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.TipoEspacioEntity;
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
public class TipoEspacioPersistence {
      /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<TipoEspacioEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from TipoEspacioEntity ");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public TipoEspacioEntity encontrarPorId(Long id) {
        return em.find(TipoEspacioEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public TipoEspacioEntity create(TipoEspacioEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public TipoEspacioEntity actualizar(TipoEspacioEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id de una entidad
     */
    public void eliminar(Long Id) {
        TipoEspacioEntity productoEliminar = em.find(TipoEspacioEntity.class, Id);
        em.remove(productoEliminar);
    }     
}
