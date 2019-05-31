/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.TipoIdentificacionDTO;
import co.edu.konrad.Zoologico.Entities.TipoIdentificacionEntity;
import co.edu.konrad.Zoologico.Logic.TipoIdentificacionLogic;
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
@Path("/TipoIdentificacion")  
public class TipoIdentificacionResource {
    @EJB
    private TipoIdentificacionLogic TipoIdentificacionLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<TipoIdentificacionDTO> getTipoIdentificacionList(){
        List <TipoIdentificacionEntity> TipoIdentificacion = TipoIdentificacionLogic.obtenerTipoIdentificacion();
        return TipoIdentificacionDTO.toTipoIdentificacionList(TipoIdentificacion);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public TipoIdentificacionDTO getTipoIdentificacion(@PathParam("id") Long id) throws IllegalAccessException{
       TipoIdentificacionEntity TipoIdentificacion =TipoIdentificacionLogic.obtenerTipoIdentificacionPorId(id);
        if (TipoIdentificacion == null){
            throw new RuntimeException("El TipoIdentificacion no existe");
        } 
        return new TipoIdentificacionDTO(TipoIdentificacion);
    }
    
    @POST
    public TipoIdentificacionDTO createProducto(TipoIdentificacionDTO fdto){ 
        return new TipoIdentificacionDTO(TipoIdentificacionLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public TipoIdentificacionDTO updateTipoIdentificacion(@PathParam("id") Long id,TipoIdentificacionDTO TipoIdentificacionDTO) throws IllegalAccessException{
       TipoIdentificacionEntity TipoIdentificacionEntity =TipoIdentificacionLogic.obtenerTipoIdentificacionPorId(id);
        if(TipoIdentificacionEntity == null){
            throw new RuntimeException("El TipoIdentificacion no existe.");
        }
        return new TipoIdentificacionDTO(TipoIdentificacionLogic.actualizarTipoIdentificacion(id,TipoIdentificacionDTO.toEntity()));
    }
    
    @DELETE
    @Path("{TipoIdentificacionID: \\d+}")
    public void deleteTipoIdentificacion(@PathParam("TipoIdentificacionID") Long id) throws IllegalAccessException{
       TipoIdentificacionEntity TipoIdentificacionEntity =TipoIdentificacionLogic.obtenerTipoIdentificacionPorId(id);
        if(TipoIdentificacionEntity == null){
            throw new RuntimeException("El TipoIdentificacion no existe.");
        }
       TipoIdentificacionLogic.eliminarTipoIdentificacion(id);
    }
}
