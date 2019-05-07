/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.EspacioEntity;
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
public class EspacioPersistence {
     /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="zoologicoPU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<EspacioEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from EspacioEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public EspacioEntity encontrarPorId(Long id ){
        return em.find(EspacioEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public EspacioEntity create(EspacioEntity productoNuevo){ 
        em.persist(productoNuevo); 
        return productoNuevo; 
    }
    /*
    *actualizar los datos de una endtidad
    */
    public EspacioEntity actualizar(EspacioEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    EspacioEntity productoEliminar=em.find(EspacioEntity.class, Id);
    em.remove(productoEliminar);
    }
}
