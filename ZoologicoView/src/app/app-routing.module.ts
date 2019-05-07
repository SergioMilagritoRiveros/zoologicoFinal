import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalesComponent} from './animales/animales.component';
import {GeneroComponent} from './genero/genero.component';
import {EspecieComponent} from './especie/especie.component';

const routes: Routes = [
  {path :'animales' ,component: AnimalesComponent},
  {path:'genero',component:GeneroComponent},
  {path:'especie',component:EspecieComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
