/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zoologico.Logic;

/**
 *
 * @author ArturoC
 */
import co.edu.konrad.Zoologico.Entities.RegistroAlimentoEntity;
import co.edu.konrad.Zoologico.Persistence.RegistroAlimentoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class RegistroAlimentoLogic {

    @Inject
    private RegistroAlimentoPersistence persistance;

    public List<RegistroAlimentoEntity> obtenerRegistroAlimento() {
        List<RegistroAlimentoEntity> registroalimento=persistance.encontrarTodos();
        return registroalimento;
    }
     public RegistroAlimentoEntity obtenerRegistroAlimentoPorId(Long Id) throws IllegalAccessException {
        RegistroAlimentoEntity registroalimento = persistance.encontrarPorId(Id);
        if (registroalimento == null) {
            throw new IllegalAccessException("el registro de alimentacion no existe");
        }
        return registroalimento;
    }
/**
 * @param prod
 *crear producto
 *@return prod
 */
    public RegistroAlimentoEntity crearRegistroAlimento(RegistroAlimentoEntity registroAlimento) {
        persistance.inserta(registroAlimento);
        return registroAlimento;
    }
/**
 * @param Id, prod
 *actualizar producto
 *@return productoActualizar
 */
    public RegistroAlimentoEntity actualizarRegistroAlimento(Long Id, RegistroAlimentoEntity registroAlimento) {
        RegistroAlimentoEntity registroAlimentoactualizar = persistance.actualizar(registroAlimento);
        return registroAlimentoactualizar;

    }
/**
 * eliminar producto
 *
 * @param Id
 * 
 */
    public void eliminarRegistroAlimento(Long Id) {
        persistance.eliminar(Id);

    }
}
