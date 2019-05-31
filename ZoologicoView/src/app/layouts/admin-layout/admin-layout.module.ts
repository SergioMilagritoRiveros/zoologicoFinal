import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminLayoutRoutes } from './admin-layout.routing';
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

import {
  MatButtonModule,
  MatInputModule,
  MatRippleModule,
  MatFormFieldModule,
  MatTooltipModule,
  MatSelectModule
} from '@angular/material';
import { from } from 'rxjs';
import { AnimalComponent } from 'app/formulariosDeCreacion/animal/animal.component';
@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(AdminLayoutRoutes),
    FormsModule,
    MatButtonModule,
    MatRippleModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatTooltipModule
  ],
  declarations: [
    DashboardComponent,
    TipoEmpleadoComponent,
    TipoEspacioComponent,
    GeneroComponent,
    EspecieComponent,
    CrearComponent,
    TipoAnimalComponent,
    HorarioAlimentacionComponent,
    TipoIdentificacionComponent,
    ShowComponent,
    RegistroAlimentoComponent,
    EspacioComponent,
    EmpleadoComponent,
    AnimalComponent
  ]
})

export class AdminLayoutModule { }
