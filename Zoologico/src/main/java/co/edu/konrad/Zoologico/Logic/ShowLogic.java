/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;

/**
 *
 * @author julian
 */
import co.edu.konrad.Zoologico.Entities.ShowEntity;
import co.edu.konrad.Zoologico.Persistence.ShowPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class ShowLogic {

    @Inject
    private ShowPersistence persistance;

    public List<ShowEntity> obtenerShow() {
        List<ShowEntity> show=persistance.encontrarTodos();
        return show;
    }
     public ShowEntity obtenerShowPorId(Long Id) throws IllegalAccessException {
        ShowEntity show = persistance.encontrarPorId(Id);
        if (show == null) {
            throw new IllegalAccessException("el show no existe");
        }
        return show;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public ShowEntity crearProducto(ShowEntity productoCrear){ 
        persistance.create(productoCrear); 
        return productoCrear; 
    } 
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public ShowEntity actualizarShow(Long Id, ShowEntity show) {
        ShowEntity showActualizar = persistance.actualizar(show);
        return showActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarShow(Long Id) {
        persistance.eliminar(Id);

    }
}
