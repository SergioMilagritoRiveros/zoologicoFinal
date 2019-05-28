import { Component, OnInit, ElementRef } from '@angular/core';
import { NavbarComponent } from '../../components.1/navbar/navbar.component';
import {Location, LocationStrategy, PathLocationStrategy} from '@angular/common';
import { Router } from '@angular/router';
declare const $: any;
declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/dashboard', title: 'Dashboard',  icon: 'dashboard', class: '' },
    
    
];
@Component({
  selector: 'app-user-layaout',
  templateUrl: './user-layaout.component.html',
  styleUrls: ['./user-layaout.component.scss']
})
export class UserLayaoutComponent implements OnInit {
    menuItems: any[];



    constructor() { }
  
    ngOnInit() {
      this.menuItems = ROUTES.filter(menuItem => menuItem);
     
    }
  
}
