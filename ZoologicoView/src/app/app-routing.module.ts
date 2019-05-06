import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalesComponent} from './animales/animales.component';
import {GeneroComponent} from './genero/genero.component';

const routes: Routes = [
  {path :'animales' ,component: AnimalesComponent},
  {path:'genero',component:GeneroComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
