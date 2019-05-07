/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.TipoEspacioDTO;
import co.edu.konrad.Zoologico.Entities.TipoEspacioEntity;
import co.edu.konrad.Zoologico.Logic.TipoEspacioLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author ArturoC
 */

public class TipoEspacioResource {
    @EJB
    private TipoEspacioLogic TipoEspacioLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<TipoEspacioDTO> getTipoEspacioList(){
        List <TipoEspacioEntity> TipoEspacio = TipoEspacioLogic.obtenerTipoEspacio();
        return TipoEspacioDTO.toTipoEspacioList(TipoEspacio);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public TipoEspacioDTO getTipoEspacio(@PathParam("id") Long id) throws IllegalAccessException{
       TipoEspacioEntity TipoEspacio =TipoEspacioLogic.obtenerTipoEspacioPorId(id);
        if (TipoEspacio == null){
            throw new RuntimeException("El TipoEspacio no existe");
        } 
        return new TipoEspacioDTO(TipoEspacio);
    }
    
    @POST
    public TipoEspacioDTO createProducto(TipoEspacioDTO fdto){ 
        return new TipoEspacioDTO(TipoEspacioLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public TipoEspacioDTO updateTipoEspacio(@PathParam("id") Long id,TipoEspacioDTO TipoEspacioDTO) throws IllegalAccessException{
       TipoEspacioEntity TipoEspacioEntity =TipoEspacioLogic.obtenerTipoEspacioPorId(id);
        if(TipoEspacioEntity == null){
            throw new RuntimeException("El TipoEspacio no existe.");
        }
        return new TipoEspacioDTO(TipoEspacioLogic.actualizarTipoEspacio(id,TipoEspacioDTO.toEntity()));
    }
    
    @DELETE
    @Path("{TipoEspacioID: \\d+}")
    public void deleteTipoEspacio(@PathParam("TipoEspacioID") Long id) throws IllegalAccessException{
       TipoEspacioEntity TipoEspacioEntity =TipoEspacioLogic.obtenerTipoEspacioPorId(id);
        if(TipoEspacioEntity == null){
            throw new RuntimeException("El TipoEspacio no existe.");
        }
       TipoEspacioLogic.eliminarTipoEspacio(id);
    }
}
