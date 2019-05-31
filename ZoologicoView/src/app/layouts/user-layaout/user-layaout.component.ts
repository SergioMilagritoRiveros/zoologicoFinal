import { Component, OnInit, ElementRef } from '@angular/core';  
import {Location, LocationStrategy, PathLocationStrategy} from '@angular/common';
import { Router } from '@angular/router';
import { UserService } from './../../services/user/user.service';
declare const $: any;
declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/rating', title: 'Votar',  icon: 'dashboard', class: '' },
    
    
];
@Component({
  selector: 'app-user-layaout',
  templateUrl: './user-layaout.component.html',
  styleUrls: ['./user-layaout.component.scss']
})
export class UserLayaoutComponent implements OnInit {
    menuItems: any[];



    constructor( private router: Router, private _UserService: UserService) { }
  
    ngOnInit() {
      this.menuItems = ROUTES.filter(menuItem => menuItem);
     
    }

    salir(){
      this._UserService.setuser(0);
      this.router.navigate(['/']);
    } 
  
}
