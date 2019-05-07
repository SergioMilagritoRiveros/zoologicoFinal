/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.HorarioAlimentacionDTO;
import co.edu.konrad.Zoologico.Entities.HorarioAlimentacionEntity;
import co.edu.konrad.Zoologico.Logic.HorarioAlimentacionLogic;
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
@Path("/HorarioAlimentacion")    
public class HorarioAlimentacionResource {
    
    @EJB
    private HorarioAlimentacionLogic horarioAlimentacionLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<HorarioAlimentacionDTO> getHorarioAlimentacionList(){
        List <HorarioAlimentacionEntity> horarioAlimentaciones = horarioAlimentacionLogic.obtenerHorarioAlimentacion();
        return HorarioAlimentacionDTO.toHorarioAlimentacionList(horarioAlimentaciones);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public HorarioAlimentacionDTO getHorarioAlimentacion(@PathParam("id") Long id) throws IllegalAccessException{
        HorarioAlimentacionEntity horarioAlimentacion = horarioAlimentacionLogic.obtenerHorarioAlimentacionPorId(id);
        if (horarioAlimentacion == null){
            throw new RuntimeException("El horarioAlimentacion no existe");
        } 
        return new HorarioAlimentacionDTO(horarioAlimentacion);
    }
    
    @POST
    public HorarioAlimentacionDTO createProducto(HorarioAlimentacionDTO fdto){ 
        return new HorarioAlimentacionDTO(horarioAlimentacionLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public HorarioAlimentacionDTO updateHorarioAlimentacion(@PathParam("id") Long id, HorarioAlimentacionDTO horarioAlimentacionDTO) throws IllegalAccessException{
        HorarioAlimentacionEntity horarioAlimentacionEntity = horarioAlimentacionLogic.obtenerHorarioAlimentacionPorId(id);
        if(horarioAlimentacionEntity == null){
            throw new RuntimeException("El horarioAlimentacion no existe.");
        }
        return new HorarioAlimentacionDTO(horarioAlimentacionLogic.actualizarHorarioAlimentacion(id, horarioAlimentacionDTO.toEntity()));
    }
    
    @DELETE
    @Path("{HorarioAlimentacionID: \\d+}")
    public void deleteHorarioAlimentacion(@PathParam("HorarioAlimentacionID") Long id) throws IllegalAccessException{
        HorarioAlimentacionEntity horarioAlimentacionEntity = horarioAlimentacionLogic.obtenerHorarioAlimentacionPorId(id);
        if(horarioAlimentacionEntity == null){
            throw new RuntimeException("El horarioAlimentacion no existe.");
        }
        horarioAlimentacionLogic.eliminarHorarioAlimentacion(id);
    }
}

