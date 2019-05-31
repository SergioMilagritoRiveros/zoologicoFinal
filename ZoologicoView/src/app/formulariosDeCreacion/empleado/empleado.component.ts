import { Component, OnInit } from '@angular/core';
import { EmpleadoService } from 'app/services/Empleado/empleado.service';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
import { TipoEmpleadoService } from 'app/services/tipoEmpleado/tipo-empleado.service';
import { TipoIdentificacion } from 'app/interfaces/tipoIdentificacion.interface';
import { TipoIdentificacionService } from 'app/services/TipoIdentificacion/tipo-identificacion.service';
declare var $:any;
@Component({
  selector: 'app-empleado',
  templateUrl: './empleado.component.html',
  styleUrls: ['./empleado.component.scss']
})
export class EmpleadoComponent implements OnInit {
  informacion:any;
  tipoEmpleado:any;
  getUrlParameter = function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
      sURLVariables = sPageURL.split('&'),
      sParameterName,
      i;
    for (i = 0; i < sURLVariables.length; i++) {
      sParameterName = sURLVariables[i].split('=');
      if (sParameterName[0] === sParam) {
        return sParameterName[1] === undefined ? true : sParameterName[1];
      }
    }
  };
  TipoIdentificacion: any;
  idCrear: number;
  numeroIdentificacionCrear:number;
  nombreCrear:string;
  numeroTelefonoCrear:number;
  fechaNacimientoCrear:string;
  tipoIdentificacionCrear:number;
  constructor(private _generoService: EmpleadoService, private _UserService: UserService, private router: Router,private service2:TipoEmpleadoService,private service3:TipoIdentificacionService) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._generoService.getEmpleados().subscribe((data) => {
      console.log(data),
        this.informacion = data;
       this.idCrear=this.informacion.length+1;
    });
    this.service2.getTipoEmpleado().subscribe(data=>{
      console.log(data);
      this.tipoEmpleado=data;
    });
    this.service3.getTipoIdentificacions().subscribe(data=>{
      this.TipoIdentificacion=data;
    });
  }
  eliminar(id: number) {
    this._generoService.deleteEmpleado(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {
  
      this._generoService.postEmpleado(this.idCrear,
        this.fechaNacimientoCrear,
        this.nombreCrear,
        this.numeroIdentificacionCrear,
        this.numeroTelefonoCrear,
        this.tipoIdentificacionCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } 

  
}
