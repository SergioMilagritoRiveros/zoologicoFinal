/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.TipoEmpleadoDTO;
import co.edu.konrad.Zoologico.Entities.TipoEmpleadoEntity;
import co.edu.konrad.Zoologico.Logic.TipoEmpleadoLogic;
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
@Path("/TipoEmpleado")  
public class TipoEmpleadoResource {
    @EJB
    private TipoEmpleadoLogic TipoEmpleadoLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<TipoEmpleadoDTO> getTipoEmpleadoList(){
        List <TipoEmpleadoEntity> TipoEmpleado = TipoEmpleadoLogic.obtenerTipoEmpleado();
        return TipoEmpleadoDTO.toTipoEmpleadoList(TipoEmpleado);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public TipoEmpleadoDTO getTipoEmpleado(@PathParam("id") Long id) throws IllegalAccessException{
       TipoEmpleadoEntity TipoEmpleado =TipoEmpleadoLogic.obtenerTipoEmpleadoPorId(id);
        if (TipoEmpleado == null){
            throw new RuntimeException("El TipoEmpleado no existe");
        } 
        return new TipoEmpleadoDTO(TipoEmpleado);
    }
    
    @POST
    public TipoEmpleadoDTO createProducto(TipoEmpleadoDTO fdto){ 
        return new TipoEmpleadoDTO(TipoEmpleadoLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public TipoEmpleadoDTO updateTipoEmpleado(@PathParam("id") Long id,TipoEmpleadoDTO TipoEmpleadoDTO) throws IllegalAccessException{
       TipoEmpleadoEntity TipoEmpleadoEntity =TipoEmpleadoLogic.obtenerTipoEmpleadoPorId(id);
        if(TipoEmpleadoEntity == null){
            throw new RuntimeException("El TipoEmpleado no existe.");
        }
        return new TipoEmpleadoDTO(TipoEmpleadoLogic.actualizarTipoEmpleado(id,TipoEmpleadoDTO.toEntity()));
    }
    
    @DELETE
    @Path("{TipoEmpleadoID: \\d+}")
    public void deleteShow(@PathParam("TipoEmpleadoID") Long id) throws IllegalAccessException{
       TipoEmpleadoEntity TipoEmpleadoEntity =TipoEmpleadoLogic.obtenerTipoEmpleadoPorId(id);
        if(TipoEmpleadoEntity == null){
            throw new RuntimeException("El TipoEmpleado no existe.");
        }
       TipoEmpleadoLogic.eliminarTipoEmpleado(id);
    }
}
