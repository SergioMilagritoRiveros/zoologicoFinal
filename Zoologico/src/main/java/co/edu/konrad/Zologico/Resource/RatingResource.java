/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.RatingDTO;
import co.edu.konrad.Zoologico.Entities.RatingEntity;
import co.edu.konrad.Zoologico.Logic.RatingLogic;
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
@Path("/Rating")    
public class RatingResource {
    
    @EJB
    private RatingLogic ratingLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<RatingDTO> getRatingList(){
        List <RatingEntity> ratinges = ratingLogic.obtenerRating();
        return RatingDTO.toRatingList(ratinges);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public RatingDTO getRating(@PathParam("id") Long id) throws IllegalAccessException{
        RatingEntity rating = ratingLogic.obtenerRatingPorId(id);
        if (rating == null){
            throw new RuntimeException("El rating no existe");
        } 
        return new RatingDTO(rating);
    }
    
    @POST
    public RatingDTO createRating(RatingDTO ratingDTO){
        return new RatingDTO(ratingLogic.crearRating(ratingDTO.toEntity()));
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public RatingDTO updateRating(@PathParam("id") Long id, RatingDTO ratingDTO) throws IllegalAccessException{
        RatingEntity ratingEntity = ratingLogic.obtenerRatingPorId(id);
        if(ratingEntity == null){
            throw new RuntimeException("El rating no existe.");
        }
        return new RatingDTO(ratingLogic.actualizarRating(id, ratingDTO.toEntity()));
    }
    
    @DELETE
    @Path("{RatingID: \\d+}")
    public void deleteRating(@PathParam("RatingID") Long id) throws IllegalAccessException{
        RatingEntity ratingEntity = ratingLogic.obtenerRatingPorId(id);
        if(ratingEntity == null){
            throw new RuntimeException("El rating no existe.");
        }
        ratingLogic.eliminarRating(id);
    }
}


