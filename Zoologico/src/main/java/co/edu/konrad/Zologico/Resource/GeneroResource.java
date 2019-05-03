/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.GeneroDTO;
import co.edu.konrad.Zoologico.Entities.GeneroEntity;
import co.edu.konrad.Zoologico.Logic.GeneroLogic;
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
@Path("/Genero")    
public class GeneroResource {
    
    @EJB
    private GeneroLogic generoLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<GeneroDTO> getGeneroList(){
        List <GeneroEntity> generoes = generoLogic.obtenerGenero();
        return GeneroDTO.toGeneroList(generoes);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public GeneroDTO getGenero(@PathParam("id") Long id) throws IllegalAccessException{
        GeneroEntity genero = generoLogic.obtenerGeneroPorId(id);
        if (genero == null){
            throw new RuntimeException("El genero no existe");
        } 
        return new GeneroDTO(genero);
    }
    
    @POST
    public GeneroDTO createGenero(GeneroDTO generoDTO){
        return new GeneroDTO(generoLogic.crearGenero(generoDTO.toEntity()));
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public GeneroDTO updateGenero(@PathParam("id") Long id, GeneroDTO generoDTO) throws IllegalAccessException{
        GeneroEntity generoEntity = generoLogic.obtenerGeneroPorId(id);
        if(generoEntity == null){
            throw new RuntimeException("El genero no existe.");
        }
        return new GeneroDTO(generoLogic.actualizarGenero(id, generoDTO.toEntity()));
    }
    
    @DELETE
    @Path("{GeneroID: \\d+}")
    public void deleteGenero(@PathParam("GeneroID") Long id) throws IllegalAccessException{
        GeneroEntity generoEntity = generoLogic.obtenerGeneroPorId(id);
        if(generoEntity == null){
            throw new RuntimeException("El genero no existe.");
        }
        generoLogic.eliminarGenero(id);
    }
}

