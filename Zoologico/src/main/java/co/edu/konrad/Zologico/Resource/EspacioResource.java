/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.EspacioDTO;
import co.edu.konrad.Zoologico.Entities.EspacioEntity;
import co.edu.konrad.Zoologico.Logic.EspacioLogic;
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
@Path("/Espacio")    
public class EspacioResource {
    
    @EJB
    private EspacioLogic espacioLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<EspacioDTO> getEspacioList(){
        List <EspacioEntity> espacioes = espacioLogic.obtenerEspacio();
        return EspacioDTO.toEspacioList(espacioes);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public EspacioDTO getEspacio(@PathParam("id") Long id) throws IllegalAccessException{
        EspacioEntity espacio = espacioLogic.obtenerEspacioPorId(id);
        if (espacio == null){
            throw new RuntimeException("El espacio no existe");
        } 
        return new EspacioDTO(espacio);
    }
    @POST
    public EspacioDTO createProducto(EspacioDTO fdto){ 
        return new EspacioDTO(espacioLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public EspacioDTO updateEspacio(@PathParam("id") Long id, EspacioDTO espacioDTO) throws IllegalAccessException{
        EspacioEntity espacioEntity = espacioLogic.obtenerEspacioPorId(id);
        if(espacioEntity == null){
            throw new RuntimeException("El espacio no existe.");
        }
        return new EspacioDTO(espacioLogic.actualizarEspacio(id, espacioDTO.toEntity()));
    }
    
    @DELETE
    @Path("{EspacioID: \\d+}")
    public void deleteEspacio(@PathParam("EspacioID") Long id) throws IllegalAccessException{
        EspacioEntity espacioEntity = espacioLogic.obtenerEspacioPorId(id);
        if(espacioEntity == null){
            throw new RuntimeException("El espacio no existe.");
        }
        espacioLogic.eliminarEspacio(id);
    }
}
