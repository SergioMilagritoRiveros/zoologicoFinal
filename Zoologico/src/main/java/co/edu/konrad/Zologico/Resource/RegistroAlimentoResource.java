/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;


import co.edu.konrad.Zoologico.DTO.RegistroAlimentoDTO;
import co.edu.konrad.Zoologico.Entities.RegistroAlimentoEntity;
import co.edu.konrad.Zoologico.Logic.RegistroAlimentoLogic;
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
public class RegistroAlimentoResource {
    @EJB
    private RegistroAlimentoLogic RegistroAlimentoLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<RegistroAlimentoDTO> getAnimalList(){
        List <RegistroAlimentoEntity> animales = RegistroAlimentoLogic.obtenerRegistroAlimento();
        return RegistroAlimentoDTO.toRegistroAlimentoList(animales);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public RegistroAlimentoDTO getRegistroAlimento(@PathParam("id") Long id) throws IllegalAccessException{
        RegistroAlimentoEntity RegistroAlimento = RegistroAlimentoLogic.obtenerRegistroAlimentoPorId(id);
        if (RegistroAlimento == null){
            throw new RuntimeException("El RegistroAlimento no existe");
        } 
        return new RegistroAlimentoDTO(RegistroAlimento);
    }
    
    @POST
    public RegistroAlimentoDTO createProducto(RegistroAlimentoDTO fdto){ 
        return new RegistroAlimentoDTO(RegistroAlimentoLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public RegistroAlimentoDTO updateRegistroAlimento(@PathParam("id") Long id, RegistroAlimentoDTO RegistroAlimentoDTO) throws IllegalAccessException{
        RegistroAlimentoEntity RegistroAlimentoEntity = RegistroAlimentoLogic.obtenerRegistroAlimentoPorId(id);
        if(RegistroAlimentoEntity == null){
            throw new RuntimeException("El RegistroAlimento no existe.");
        }
        return new RegistroAlimentoDTO(RegistroAlimentoLogic.actualizarRegistroAlimento(id, RegistroAlimentoDTO.toEntity()));
    }
    
    @DELETE
    @Path("{RegistroAlimentoID: \\d+}")
    public void deleteRegistroAlimento(@PathParam("RegistroAlimentoID") Long id) throws IllegalAccessException{
        RegistroAlimentoEntity RegistroAlimentoEntity = RegistroAlimentoLogic.obtenerRegistroAlimentoPorId(id);
        if(RegistroAlimentoEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
        RegistroAlimentoLogic.eliminarRegistroAlimento(id);
    }
}
