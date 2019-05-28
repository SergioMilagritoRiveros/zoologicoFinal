import { NgModule } from '@angular/core';


import {UserLayaoutRoutes} from './user-layaout.routing';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';


@NgModule({
  declarations: [],
  imports: [
    RouterModule.forChild(UserLayaoutRoutes),
    CommonModule,
  
  
    
  ]
})
export class UserLayaoutModule { }
