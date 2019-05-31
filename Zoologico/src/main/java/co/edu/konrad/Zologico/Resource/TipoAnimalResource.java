/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.TipoAnimalDTO;
import co.edu.konrad.Zoologico.Entities.TipoAnimalEntity;
import co.edu.konrad.Zoologico.Logic.TipoAnimalLogic;
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
 *
 * @author ArturoC
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/TipoAnimal")  
public class TipoAnimalResource {
    @EJB
    private TipoAnimalLogic tipoAnimalLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<TipoAnimalDTO> getTipoAnimalList(){
        List <TipoAnimalEntity> TipoAnimal = tipoAnimalLogic.obtenerTipoAnimal();
        return TipoAnimalDTO.toTipoAnimalList(TipoAnimal);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public TipoAnimalDTO getTipoAnimal(@PathParam("id") Long id) throws IllegalAccessException{
       TipoAnimalEntity TipoAnimal =tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if (TipoAnimal == null){
            throw new RuntimeException("El TipoAnimal no existe");
        } 
        return new TipoAnimalDTO(TipoAnimal);
    }
    
    @POST
    public TipoAnimalDTO createProducto(TipoAnimalDTO fdto){ 
        return new TipoAnimalDTO(tipoAnimalLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public TipoAnimalDTO updateTipoAnimal(@PathParam("id") Long id,TipoAnimalDTO TipoAnimalDTO) throws IllegalAccessException{
       TipoAnimalEntity TipoAnimalEntity =tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(TipoAnimalEntity == null){
            throw new RuntimeException("El TipoAnimal no existe.");
        }
        return new TipoAnimalDTO(tipoAnimalLogic.actualizarTipoAnimal(id,TipoAnimalDTO.toEntity()));
    }
    
    @DELETE
    @Path("{TipoAnimalID: \\d+}")
    public void deleteShow(@PathParam("TipoAnimalID") Long id) throws IllegalAccessException{
       TipoAnimalEntity TipoAnimalEntity =tipoAnimalLogic.obtenerTipoAnimalPorId(id);
        if(TipoAnimalEntity == null){
            throw new RuntimeException("El tipoanimal no existe.");
        }
       tipoAnimalLogic.eliminarTipoAnimal(id);
    }
}
