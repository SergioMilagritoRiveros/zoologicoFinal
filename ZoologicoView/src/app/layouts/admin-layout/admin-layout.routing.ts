import { Routes } from '@angular/router';

import { DashboardComponent } from '../../dashboard/dashboard.component';
import { GeneroComponent } from '../../formulariosDeCreacion/genero/genero.component';
import { EspecieComponent } from '../../formulariosDeCreacion/especie/especie.component';
import { CrearComponent } from './../../crear/crear.component';
import { TipoAnimalComponent } from '../../formulariosDeCreacion/tipo-animal/tipo-animal.component';
import { HorarioAlimentacionComponent } from '../../formulariosDeCreacion/horario-alimentacion/horario-alimentacion.component';
import { TipoIdentificacionComponent } from '../../formulariosDeCreacion/tipo-identificacion/tipo-identificacion.component';
import { TipoEmpleadoComponent } from '../../formulariosDeCreacion/tipo-empleado/tipo-empleado.component';
import { TipoEspacioComponent } from '../../formulariosDeCreacion/tipo-espacio/tipo-espacio.component';
import { ShowComponent } from '../../formulariosDeCreacion/show/show.component';
import { RegistroAlimentoComponent } from '../../formulariosDeCreacion/registro-alimento/registro-alimento.component';
import { EspacioComponent } from '../../formulariosDeCreacion/espacio/espacio.component';
import { EmpleadoComponent } from '../../formulariosDeCreacion/empleado/empleado.component';
export const AdminLayoutRoutes: Routes = [

    { path: 'dashboard', component: DashboardComponent },
    { path: 'genero', component: GeneroComponent },
    { path: 'especie', component: EspecieComponent },
    { path: 'crear', component: CrearComponent },
    { path: 'tipoAnimal', component: TipoAnimalComponent },
    { path: 'horarioAlimentacion', component: HorarioAlimentacionComponent },
    { path: 'tipoIdentificacion', component: TipoIdentificacionComponent },
    { path: 'tipoEmpleado', component: TipoEmpleadoComponent },
    { path: 'tipoEspacio', component: TipoEspacioComponent },
    { path: 'show', component: ShowComponent },
    { path: 'registroAlimento', component: RegistroAlimentoComponent },
    { path: 'espacio', component: EspacioComponent },
    { path: 'empleado', component: EmpleadoComponent }

];
