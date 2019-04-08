/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.HorarioAlimentacionEntity;
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
public class HorarioAlimentacionPersistence {
    
    /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<HorarioAlimentacionEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from HorarioAlimentacionEntity ");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public HorarioAlimentacionEntity encontrarPorId(Long id) {
        return em.find(HorarioAlimentacionEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public HorarioAlimentacionEntity inserta(HorarioAlimentacionEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    *actualizar los datos de una endtidad
     */
    public HorarioAlimentacionEntity actualizar(HorarioAlimentacionEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id una entidad
     */
    public void eliminar(Long Id) {
        HorarioAlimentacionEntity productoEliminar = em.find(HorarioAlimentacionEntity.class, Id);
        em.remove(productoEliminar);
    }
}
