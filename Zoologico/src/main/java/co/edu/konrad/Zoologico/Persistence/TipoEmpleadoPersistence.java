/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.TipoEmpleadoEntity;
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
public class TipoEmpleadoPersistence {
     /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<TipoEmpleadoEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from TipoEmpleadoEntity p");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public TipoEmpleadoEntity encontrarPorId(Long id) {
        return em.find(TipoEmpleadoEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public TipoEmpleadoEntity create(TipoEmpleadoEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public TipoEmpleadoEntity actualizar(TipoEmpleadoEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id de una entidad
     */
    public void eliminar(Long Id) {
        TipoEmpleadoEntity productoEliminar = em.find(TipoEmpleadoEntity.class, Id);
        em.remove(productoEliminar);
    }     
}
