import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalesComponent} from './animales/animales.component';
import {GeneroComponent} from './genero/genero.component';
import {EspecieComponent} from './especie/especie.component';
import {TipoAnimalComponent} from './tipo-animal/tipo-animal.component';
import{IndexComponent} from './index/index.component';

const routes: Routes = [
  {path:'', component:IndexComponent},
  {path :'animales' ,component: AnimalesComponent},
  {path:'genero',component:GeneroComponent},
  {path:'especie',component:EspecieComponent},
  {path:'tipoAnimal',component:TipoAnimalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
