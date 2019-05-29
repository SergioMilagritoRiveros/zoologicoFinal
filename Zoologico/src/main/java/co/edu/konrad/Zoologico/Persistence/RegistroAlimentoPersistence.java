/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.RegistroAlimentoEntity;
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
public class RegistroAlimentoPersistence {
        
    /*
    *manejador de entidad
     */
    @PersistenceContext(unitName = "zoologicoPU")
    protected EntityManager em;

    /*
    *Buscar todas las entidades
     */
    public List<RegistroAlimentoEntity> encontrarTodos() {
        Query todos = em.createQuery("select p from RegistroAlimentoEntity p");
        return todos.getResultList();
    }

    /*
    *buscar una entidad por su id
     */
    public RegistroAlimentoEntity encontrarPorId(Long id) {
        return em.find(RegistroAlimentoEntity.class, id);
    }

    /*
    *insertar un registro a la tabla 
     */
    public RegistroAlimentoEntity create(RegistroAlimentoEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }

    /*
    *actualizar los datos de una endtidad
     */
    public RegistroAlimentoEntity actualizar(RegistroAlimentoEntity entity) {
        return em.merge(entity);
    }

    /*
    *eliminar por id una entidad
     */
    public void eliminar(Long Id) {
        RegistroAlimentoEntity productoEliminar = em.find(RegistroAlimentoEntity.class, Id);
        em.remove(productoEliminar);
    }  
}
