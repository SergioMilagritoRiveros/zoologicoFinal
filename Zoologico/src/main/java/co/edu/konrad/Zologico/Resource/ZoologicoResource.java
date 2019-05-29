/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.ZoologicoDTO;
import co.edu.konrad.Zoologico.Entities.ZoologicoEntity;
import co.edu.konrad.Zoologico.Logic.ZoologicoLogic;
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
@Path("/Zoologico")  
public class ZoologicoResource {
    @EJB
    private ZoologicoLogic ZoologicoLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<ZoologicoDTO> getShowList(){
        List <ZoologicoEntity> Zoologico = ZoologicoLogic.obtenerZoologico();
        return ZoologicoDTO.toZoologicoList(Zoologico);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public ZoologicoDTO getZoologico(@PathParam("id") Long id) throws IllegalAccessException{
       ZoologicoEntity Zoologico =ZoologicoLogic.obtenerZoologicoPorId(id);
        if (Zoologico == null){
            throw new RuntimeException("El Zoologico no existe");
        } 
        return new ZoologicoDTO(Zoologico);
    }
    
    @POST
    public ZoologicoDTO createProducto(ZoologicoDTO fdto){ 
        return new ZoologicoDTO(ZoologicoLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public ZoologicoDTO updateZoologico(@PathParam("id") Long id,ZoologicoDTO ZoologicoDTO) throws IllegalAccessException{
       ZoologicoEntity ZoologicoEntity =ZoologicoLogic.obtenerZoologicoPorId(id);
        if(ZoologicoEntity == null){
            throw new RuntimeException("El Zoologico no existe.");
        }
        return new ZoologicoDTO(ZoologicoLogic.actualizarZoologico(id,ZoologicoDTO.toEntity()));
    }
    
    @DELETE
    @Path("{RegistroAlimentoID: \\d+}")
    public void deleteZoologicow(@PathParam("ZoologicoID") Long id) throws IllegalAccessException{
       ZoologicoEntity ZoologicoEntity =ZoologicoLogic.obtenerZoologicoPorId(id);
        if(ZoologicoEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
       ZoologicoLogic.eliminarZoologico(id);
    }
}
