import { Routes } from '@angular/router';

import { DashboardComponent } from '../../dashboard/dashboard.component';
import { UserProfileComponent } from '../../user-profile/user-profile.component';
import { TableListComponent } from '../../table-list/table-list.component';
import { TypographyComponent } from '../../typography/typography.component';
import { IconsComponent } from '../../icons/icons.component';
import { MapsComponent } from '../../maps/maps.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
import { UpgradeComponent } from '../../upgrade/upgrade.component';
import {GeneroComponent} from '../../formulariosDeCreacion/genero/genero.component';
import {EspecieComponent} from '../../formulariosDeCreacion/especie/especie.component';
import {CrearComponent} from './../../crear/crear.component';
import {TipoAnimalComponent} from '../../formulariosDeCreacion/tipo-animal/tipo-animal.component';
import { HorarioAlimentacionComponent } from '../../formulariosDeCreacion/horario-alimentacion/horario-alimentacion.component';
import{TipoIdentificacionComponent}from'../../formulariosDeCreacion/tipo-identificacion/tipo-identificacion.component';
import { TipoEmpleadoComponent } from '../../formulariosDeCreacion/tipo-empleado/tipo-empleado.component';
import { TipoEspacioComponent } from '../../formulariosDeCreacion/tipo-espacio/tipo-espacio.component';

export const AdminLayoutRoutes: Routes = [
    
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'table-list',     component: TableListComponent },
    { path: 'typography',     component: TypographyComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    { path: 'notifications',  component: NotificationsComponent },
    { path: 'upgrade',        component: UpgradeComponent },
    { path: 'genero',      component: GeneroComponent },
    { path: 'especie',      component: EspecieComponent },
    { path: 'crear',      component: CrearComponent },
    { path: 'tipoAnimal',      component: TipoAnimalComponent },
    {path:'horarioAlimentacion', component:HorarioAlimentacionComponent},
    {path:'tipoIdentificacion', component:TipoIdentificacionComponent},
    {path:'tipoEmpleado', component:TipoEmpleadoComponent},
    {path:'tipoEspacio', component:TipoEspacioComponent}
];
