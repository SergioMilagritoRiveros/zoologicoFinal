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
import co.edu.konrad.Zoologico.Entities.TipoIdentificacionEntity;
import co.edu.konrad.Zoologico.Persistence.TipoIdentificacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class TipoIdentificacionLogic {

    @Inject
    private TipoIdentificacionPersistence persistance;

    public List<TipoIdentificacionEntity> obtenerTipoIdentificacion() {
        List<TipoIdentificacionEntity>tipoIdentificacion=persistance.encontrarTodos();
        return tipoIdentificacion;
    }
     public TipoIdentificacionEntity obtenerTipoIdentificacionPorId(Long Id) throws IllegalAccessException {
        TipoIdentificacionEntity tipoI = persistance.encontrarPorId(Id);
        if (tipoI == null) {
            throw new IllegalAccessException("el Tipo de Identificacion no existe");
        }
        return tipoI;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public TipoIdentificacionEntity crearTipoTipoIdentificacion(TipoIdentificacionEntity tipoespacio) {
        persistance.inserta(tipoespacio);
        return tipoespacio;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public TipoIdentificacionEntity actualizarTipoIdentificacion(Long Id, TipoIdentificacionEntity tipoEspacio) {
        TipoIdentificacionEntity tipospacio = persistance.actualizar(tipoEspacio);
        return tipospacio;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarHorarioTipoIdentificacion(Long Id) {
        persistance.eliminar(Id);

    }
}
