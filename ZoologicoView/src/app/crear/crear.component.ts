import { Component, OnInit } from '@angular/core';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
declare interface RouteInfo {
  path: string;
  title: string;
  icon: string;
  class: string;
}
export const CREAR: RouteInfo[] = [
  { path: '/genero', title: 'Genero', icon: 'backup', class: '' },
  { path: '/especie', title: 'Especie', icon: 'backup', class: '' },
  { path: '/tipoAnimal', title: 'Tipo Animal', icon: 'backup', class: '' },
  { path: '/horarioAlimentacion', title: 'Horario de Alimentacion', icon: 'backup', class: '' },
  { path: '/tipoIdentificacion', title: 'Tipo de Identificacion', icon: 'backup', class: '' },
  { path: '/tipoEspacio', title: 'Tipo de Espacio', icon: 'backup', class: '' },
  { path: '/show', title: 'Show', icon: 'backup', class: '' },
  { path: '/registroAlimento', title: 'Registro Alimento', icon: 'backup', class: '' },
  { path: '/espacio', title: 'Espacio', icon: 'backup', class: '' },
  { path: '/empleado', title: 'Empleado', icon: 'backup', class: '' },
];
@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.scss']
})
export class CrearComponent implements OnInit {
  menuItems: any[];
  constructor(private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this.menuItems = CREAR.filter(menuItem => menuItem);
  }

}
