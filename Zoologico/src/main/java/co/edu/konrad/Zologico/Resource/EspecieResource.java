/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.EspecieDTO;
import co.edu.konrad.Zoologico.Entities.EspecieEntity;
import co.edu.konrad.Zoologico.Logic.EspecieLogic;
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
@Path("/Especie")    
public class EspecieResource {
    
    @EJB
    private EspecieLogic especieLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<EspecieDTO> getEspecieList(){
        List <EspecieEntity> especiees = especieLogic.obtenerEspecie();
        return EspecieDTO.toEspecieList(especiees);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public EspecieDTO getEspecie(@PathParam("id") Long id) throws IllegalAccessException{
        EspecieEntity especie = especieLogic.obtenerEspeciePorId(id);
        if (especie == null){
            throw new RuntimeException("El especie no existe");
        } 
        return new EspecieDTO(especie);
    }
    
    @POST
    public EspecieDTO createProducto(EspecieDTO fdto){ 
        return new EspecieDTO(especieLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public EspecieDTO updateEspecie(@PathParam("id") Long id, EspecieDTO especieDTO) throws IllegalAccessException{
        EspecieEntity especieEntity = especieLogic.obtenerEspeciePorId(id);
        if(especieEntity == null){
            throw new RuntimeException("El especie no existe.");
        }
        return new EspecieDTO(especieLogic.actualizarEspecie(id, especieDTO.toEntity()));
    }
    
    @DELETE
    @Path("{EspecieID: \\d+}")
    public void deleteEspecie(@PathParam("EspecieID") Long id) throws IllegalAccessException{
        EspecieEntity especieEntity = especieLogic.obtenerEspeciePorId(id);
        if(especieEntity == null){
            throw new RuntimeException("El especie no existe.");
        }
        especieLogic.eliminarEspecie(id);
    }
}

