/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.Zologico.Resource;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Representa el registro de las clases que se personalizan como servicios REST
 * @author Cindy H.
 */
@ApplicationPath("/api")
public class ApplicationConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;      
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources){
        resources.add(co.edu.konrad.Zologico.Resource.AnimalResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.EmpleadoResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.EspacioResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.EspecieResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.GeneroResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.HorarioAlimentacionResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.RatingResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.RegistroAlimentoResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.ShowResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.TipoAnimalResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.TipoEmpleadoResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.TipoEspacioResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.TipoIdentificacionResource.class);
        resources.add(co.edu.konrad.Zologico.Resource.ZoologicoResource.class);
    }
}

