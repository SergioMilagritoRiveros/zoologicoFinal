/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Persistence;

import co.edu.konrad.Zoologico.Entities.AnimalEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author SergioRiveros
 */
@Stateless
public class AnimalPersistence {
     /*
    *manejador de entidad
    */
    @PersistenceContext(unitName="zoologicoOU")
    protected EntityManager em;
   /*
    *Buscar todas las entidades
    */
    public List<AnimalEntity> encontrarTodos(){
        Query todos =em.createQuery("select p from AnimalEntity p");
        return todos.getResultList();
    }
    /*
    *buscar una entidad por su id
    */
    public AnimalEntity encontrarPorId(Long id ){
        return em.find(AnimalEntity.class, id);
    }
    /*
    *insertar un registro a la tabla 
    */
    public AnimalEntity inserta(AnimalEntity entity){
        em.persist(entity);
        return entity;
    }
    /*
    *actualizar los datos de una endtidad
    */
    public AnimalEntity actualizar(AnimalEntity entity){
        return em.merge(entity);
    }
    /*
    *eliminar por id una entidad
    */
    public void eliminar(Long Id){
    AnimalEntity animalEliminar=em.find(AnimalEntity.class, Id);
    em.remove(animalEliminar);
    }
}