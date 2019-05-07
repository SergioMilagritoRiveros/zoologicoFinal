/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.AnimalDTO;
import co.edu.konrad.Zoologico.Entities.AnimalEntity;
import co.edu.konrad.Zoologico.Logic.AnimalLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Recurso de Producto
 * @author JulianT.
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/Animal")    
public class AnimalResource {
    
    @EJB
    private AnimalLogic animalLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<AnimalDTO> getAnimalList(){
        List <AnimalEntity> animales = animalLogic.obtenerAnimales();
        return AnimalDTO.toAnimalList(animales);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public AnimalDTO getAnimal(@PathParam("id") Long id) throws IllegalAccessException{
        AnimalEntity animal = animalLogic.obtenerAnimalPorId(id);
        if (animal == null){
            throw new RuntimeException("El animal no existe");
        } 
        return new AnimalDTO(animal);
    }
    
    @POST
    public AnimalDTO createProducto(AnimalDTO fdto){ 
        return new AnimalDTO(animalLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public AnimalDTO updateAnimal(@PathParam("id") Long id, AnimalDTO animalDTO) throws IllegalAccessException{
        AnimalEntity animalEntity = animalLogic.obtenerAnimalPorId(id);
        if(animalEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
        return new AnimalDTO(animalLogic.actualizarAnimal(id, animalDTO.toEntity()));
    }
    
    @DELETE
    @Path("{AnimalID: \\d+}")
    public void deleteAnimal(@PathParam("AnimalID") Long id) throws IllegalAccessException{
        AnimalEntity animalEntity = animalLogic.obtenerAnimalPorId(id);
        if(animalEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
        animalLogic.eliminarAnimal(id);
    }
}

