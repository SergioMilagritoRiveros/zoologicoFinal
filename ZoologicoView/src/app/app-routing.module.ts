import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {GeneroComponent} from './formulariosDeCreacion/genero/genero.component';
import {EspecieComponent} from './formulariosDeCreacion/especie/especie.component';
import {TipoAnimalComponent} from './formulariosDeCreacion/tipo-animal/tipo-animal.component';
import{IndexComponent} from './index/index.component';

const routes: Routes = [
  {path:'', component:IndexComponent},
 
  {path:'genero',component:GeneroComponent},
  {path:'especie',component:EspecieComponent},
  {path:'tipoAnimal',component:TipoAnimalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
