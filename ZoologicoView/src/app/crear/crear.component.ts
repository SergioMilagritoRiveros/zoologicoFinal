import { Component, OnInit } from '@angular/core';
declare interface RouteInfo {
  path: string;
  title: string;
  icon: string;
  class: string;
}
export const  CREAR: RouteInfo[] = [
  { path: '/genero', title: 'Genero',  icon: 'backup', class: '' },
  { path: '/especie', title: 'Especie',  icon: 'backup', class: '' },
];
@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.scss']
})
export class CrearComponent implements OnInit {
  menuItems: any[];
  constructor() { }

  ngOnInit() {
    this.menuItems = CREAR.filter(menuItem => menuItem);
  }

}
