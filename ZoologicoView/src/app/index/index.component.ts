import { Component, OnInit } from '@angular/core';
import { LoginService } from 'app/services/Login/login.service';
import { Router } from '@angular/router';

declare var $:any;

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  informacion: any[];
  correo: string;
  contrasena: string;
  constructor(private _loginservioce: LoginService, private router: Router) { }

  ngOnInit() {
  }
  login() {
    var informacion2: any;
var mtipoU:any;
var contrasepa:any;
    this._loginservioce.login().subscribe(data => {
      informacion2 = data;
      console.log(informacion2);
      var results = informacion2.filter(informacion2 => {
      if (informacion2.correoElectronico == this.correo) {
        mtipoU=informacion2.tipoUser;
        contrasepa=informacion2.contrasena;
        return informacion2.contrasena;
      } 
      });
      if (contrasepa== this.contrasena) {
        if (mtipoU=='Admin') {
          $('#cerrarpopoup').click();
          this.router.navigate(['/dashboard']);
        }else{alert('no eres admin');}
        $('#cerrarpopoup').click();
      } else {
        console.log('contraseña equivocada');
      }
    });
    

  }
}
