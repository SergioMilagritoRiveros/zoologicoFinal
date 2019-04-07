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
import co.edu.konrad.Zoologico.Entities.RatingEntity;
import co.edu.konrad.Zoologico.Persistence.RatingPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class RatingLogic {

    @Inject
    private RatingPersistence persistance;

    public List<RatingEntity> obtenerHorarioAlimentacion() {
        List<RatingEntity> rating=persistance.encontrarTodos();
        return rating;
    }
     public RatingEntity obtenerRatingPorId(Long Id) throws IllegalAccessException {
        RatingEntity rating = persistance.encontrarPorId(Id);
        if (rating == null) {
            throw new IllegalAccessException("el horario de alimentacion no existe");
        }
        return rating;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public RatingEntity crearHorarioAlimentacion(RatingEntity rating) {
        persistance.inserta(rating);
        return rating;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public RatingEntity actualizarHorarioAlimentacion(Long Id, RatingEntity rating) {
        RatingEntity ratingActualizar = persistance.actualizar(rating);
        return ratingActualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarHorarioRating(Long Id) {
        persistance.eliminar(Id);

    }
}



