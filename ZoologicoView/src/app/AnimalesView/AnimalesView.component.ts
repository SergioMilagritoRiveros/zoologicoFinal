import { Component, OnInit } from '@angular/core';
import { LoginService } from 'app/services/Login/login.service';
import { Router } from '@angular/router';
import { Alert } from 'selenium-webdriver';
import { UserService } from '../services/user/user.service';

declare var $: any;

@Component({
  selector: 'app-AnimalesView',
  templateUrl: './AnimalesView.component.html',
  styleUrls: ['./AnimalesView.component.css']
})
export class AnimalesViewComponent implements OnInit {
  informacion: any;
  correo: string;
  contrasena: string;
  idCrear: number;
  nombre: any;
  apellido: any;
  correoo: any;
  contrasenaa: any;
  constructor(private _loginservioce: LoginService, private router: Router, private _UserService: UserService) {    
  }

  ngOnInit() {
  }

  
}
