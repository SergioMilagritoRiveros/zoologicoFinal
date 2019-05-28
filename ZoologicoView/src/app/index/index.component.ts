import { Component, OnInit } from '@angular/core';
import { LoginService } from 'app/services/Login/login.service';
import { Router } from '@angular/router';
import { Alert } from 'selenium-webdriver';
import { UserService } from './../services/user/user.service';

declare var $: any;

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  informacion: any[];
  correo: string;
  contrasena: string;
  idCrear: number;
  nombre: any;
  apellido: any;
  correoo: any;
  contrasenaa: any;
  constructor(private _loginservioce: LoginService, private router: Router, private _UserService: UserService) {
    this._UserService.setuser(0);
  }

  ngOnInit() {
    this._UserService.setuser(0);

  }
  signup() {
    var cont: number;
    this._loginservioce.login().subscribe(data => {
      console.log(data);
      this.idCrear = this.informacion.length + 1
    });
    this._loginservioce.postUser(this.idCrear,this.apellido,this.contrasenaa,this.correoo,this.nombre,"User").subscribe();
  }
  login() {
    var informacion2: any;
    var mtipoU: any;
    var contrasepa: any;
    if (this.correo == null) {
      alert('ingresa un correo');
    } else {
      if (this.contrasena == null) {
        alert('ingresa una contraseña');
      } else {
        this._loginservioce.login().subscribe(data => {
          informacion2 = data;
          console.log(informacion2.length);
          var results = informacion2.filter(informacion2 => {
            if (informacion2.correoElectronico == this.correo && informacion2.length != 0) {
              mtipoU = informacion2.tipoUser;
              contrasepa = informacion2.contrasena;

              if (contrasepa == this.contrasena) {
                if (mtipoU == 'Admin') {
                  if (this._UserService.getuser() == 0) {
                    this._UserService.setuser(1);
                    $('#cerrarpopoup').click();
                    this.router.navigate(['/dashboard']);
                  } else {
                    alert('ya has iniciado sesion');
                  }
                } else {
                  this._UserService.setuser(2);
                  $('#cerrarpopoup').click();
                  this.router.navigate(['/dashboardUser']);
                }
                $('#cerrarpopoup').click();
              } else {
                alert('contraseña o usuario invalido');
                console.log('contraseña equivocada');
              }

            } else {
              console.log('holabb');

            }

          });

        });
      }
    }
  }
}
