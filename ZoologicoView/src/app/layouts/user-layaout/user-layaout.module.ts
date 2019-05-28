import { NgModule } from '@angular/core';


import {UserLayaoutRoutes} from './user-layaout.routing';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { ComponentsModule } from 'app/components.1/components.module';

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forChild(UserLayaoutRoutes),
    CommonModule,
    ComponentsModule
  
    
  ]
})
export class UserLayaoutModule { }
