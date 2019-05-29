/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.ShowDTO;
import co.edu.konrad.Zoologico.Entities.ShowEntity;
import co.edu.konrad.Zoologico.Logic.ShowLogic;
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
@Path("/Show")  
public class ShowResource {
    @EJB
    private ShowLogic ShowLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<ShowDTO> getShowList(){
        List <ShowEntity> Show = ShowLogic.obtenerShow();
        return ShowDTO.toShowList(Show);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public ShowDTO getRegistroAlimento(@PathParam("id") Long id) throws IllegalAccessException{
       ShowEntity Show =ShowLogic.obtenerShowPorId(id);
        if (Show == null){
            throw new RuntimeException("ElShow no existe");
        } 
        return new ShowDTO(Show);
    }
    
    @POST
    public ShowDTO createProducto(ShowDTO fdto){ 
        return new ShowDTO(ShowLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public ShowDTO updateShow(@PathParam("id") Long id,ShowDTO ShowDTO) throws IllegalAccessException{
       ShowEntity ShowEntity =ShowLogic.obtenerShowPorId(id);
        if(ShowEntity == null){
            throw new RuntimeException("ElShow no existe.");
        }
        return new ShowDTO(ShowLogic.actualizarShow(id,ShowDTO.toEntity()));
    }
    
    @DELETE
    @Path("{RegistroAlimentoID: \\d+}")
    public void deleteShow(@PathParam("ShowID") Long id) throws IllegalAccessException{
       ShowEntity ShowEntity =ShowLogic.obtenerShowPorId(id);
        if(ShowEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
       ShowLogic.eliminarShow(id);
    }
}
