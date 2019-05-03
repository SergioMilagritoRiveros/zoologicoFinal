/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import co.edu.konrad.Zoologico.DTO.EmpleadoDTO;
import co.edu.konrad.Zoologico.Entities.EmpleadoEntity;
import co.edu.konrad.Zoologico.Logic.EmpleadoLogic;
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
@Path("/Empleado")    
public class EmpleadoResource {
    
    @EJB
    private EmpleadoLogic empleadoLogic;

    /**
     * Metodo que obtiene todos los datos de producto
     * @return Lista ProductoDTO
     */
    @GET
    public List<EmpleadoDTO> getEmpleadoList(){
        List <EmpleadoEntity> empleadoes = empleadoLogic.obtenerEmpleados();
        return EmpleadoDTO.toEmpleadoList(empleadoes);
    }
    
    /**
     * Obtener producto por su id
     * @param id
     * @return ProductoEntity
     */
    @GET
    @Path("{id: \\d+}")
    public EmpleadoDTO getEmpleado(@PathParam("id") Long id) throws IllegalAccessException{
        EmpleadoEntity empleado = empleadoLogic.obtenerEmpleadoPorId(id);
        if (empleado == null){
            throw new RuntimeException("El empleado no existe");
        } 
        return new EmpleadoDTO(empleado);
    }
    
    @POST
    public EmpleadoDTO createEmpleado(EmpleadoDTO empleadoDTO){
        return new EmpleadoDTO(empleadoLogic.crearEmpleado(empleadoDTO.toEntity()));
    }
    
    
    /**
     * Actualizar un producto
     * @param id
     * @param productoDTO
     * @return productoDTO actualizado
     */
    @PUT
    @Path("{id: \\d+}")
    public EmpleadoDTO updateEmpleado(@PathParam("id") Long id, EmpleadoDTO empleadoDTO) throws IllegalAccessException{
        EmpleadoEntity empleadoEntity = empleadoLogic.obtenerEmpleadoPorId(id);
        if(empleadoEntity == null){
            throw new RuntimeException("El empleado no existe.");
        }
        return new EmpleadoDTO(empleadoLogic.actualizarEmpleado(id, empleadoDTO.toEntity()));
    }
    
    @DELETE
    @Path("{EmpleadoID: \\d+}")
    public void deleteEmpleado(@PathParam("EmpleadoID") Long id) throws IllegalAccessException{
        EmpleadoEntity empleadoEntity = empleadoLogic.obtenerEmpleadoPorId(id);
        if(empleadoEntity == null){
            throw new RuntimeException("El empleado no existe.");
        }
        empleadoLogic.eliminarEmpleado(id);
    }
}

