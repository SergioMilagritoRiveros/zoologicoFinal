/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.UserDTO;
import co.edu.konrad.Zoologico.Entities.UserEntity;
import co.edu.konrad.Zoologico.Logic.UserLogic;
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
 * @author Julia
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/User")    
public class UserResource {
    
    @EJB
    private UserLogic animalLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<UserDTO> getUserList(){
        List <UserEntity> animales = animalLogic.obtenerUseres();
        return UserDTO.toUserList(animales);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public UserDTO getUser(@PathParam("id") Long id) throws IllegalAccessException{
        UserEntity animal = animalLogic.obtenerUserPorId(id);
        if (animal == null){
            throw new RuntimeException("El animal no existe");
        } 
        return new UserDTO(animal);
    }
    
    @POST
    public UserDTO createProducto(UserDTO fdto){ 
        return new UserDTO(animalLogic.crearProducto(fdto.toEntity())); 
    } 
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public UserDTO updateUser(@PathParam("id") Long id, UserDTO animalDTO) throws IllegalAccessException{
        UserEntity animalEntity = animalLogic.obtenerUserPorId(id);
        if(animalEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
        return new UserDTO(animalLogic.actualizarUser(id, animalDTO.toEntity()));
    }
    
    @DELETE
    @Path("{UserID: \\d+}")
    public void deleteUser(@PathParam("UserID") Long id) throws IllegalAccessException{
        UserEntity animalEntity = animalLogic.obtenerUserPorId(id);
        if(animalEntity == null){
            throw new RuntimeException("El animal no existe.");
        }
        animalLogic.eliminarUser(id);
    }
}
