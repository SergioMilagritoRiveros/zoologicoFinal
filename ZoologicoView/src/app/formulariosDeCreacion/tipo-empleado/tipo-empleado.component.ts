import { Component, OnInit } from '@angular/core';
import { identifierModuleUrl } from '@angular/compiler';
import { FormControl, Validators } from '@angular/forms';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
import { TipoEmpleadoService } from 'app/services/tipoEmpleado/tipo-empleado.service';

declare var $: any;
@Component({
  selector: 'app-tipo-empleado',
  templateUrl: './tipo-empleado.component.html',
  styleUrls: ['./tipo-empleado.component.scss']
})
export class TipoEmpleadoComponent implements OnInit {

  informacion: any;
  idCrear: number;
  horasDiariasCrear: number;
  ocupacionCrear: string = '';
  salarioCrear: number;
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

  constructor(private _tipoEmpleadoService: TipoEmpleadoService, private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._tipoEmpleadoService.getTipoEmpleado().subscribe((data) => {
      console.log(data),
        this.informacion = data,
        this.idCrear = this.informacion.length + 1
    });
  }
  eliminar(id: number) {
    this._tipoEmpleadoService.deleteTipoEmpleado(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {
    if (this.ocupacionCrear != '') {
      this._tipoEmpleadoService.postTipoEmpleado(this.idCrear, this.horasDiariasCrear, this.ocupacionCrear, this.salarioCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } else {
      this.showNotification('top', 'rigth')
    }

  }
  /*
  actualizarFormulario(id: number) {
    this._tipoEmpleadoService.getTipoEmpleadosid(id).subscribe(data => {
      this.idActualizar = data['id'];
      this.tipoEmpleadoActualizar = data['tipoEmpleado'];
    });
  }
  actualizar() {
    this._tipoEmpleadoService.putTipoEmpleado(this.idActualizar, this.tipoEmpleadoActualizar).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load();
      $('#actualizarf').load();
    });
  }
  */
  showNotification(from, align) {
    const type = ['', 'info', 'success', 'warning', 'danger'];

    const color = Math.floor((Math.random() * 4) + 1);

    $.notify({
      icon: "notifications",
      message: "TipoEmpleado vacio , porfavor ingrese un valor <br>en la descripcion del tipoEmpleado"

    }, {
        type: type[color],
        timer: 4000,
        placement: {
          from: from,
          align: align
        },
        template: '<div data-notify="container" class="col-xl-4 col-lg-4 col-11 col-sm-4 col-md-4 alert alert-{0} alert-with-icon" role="alert">' +
          '<button mat-button  type="button" aria-hidden="true" class="close mat-button" data-notify="dismiss">  <i class="material-icons">close</i></button>' +
          '<i class="material-icons" data-notify="icon">notifications</i> ' +
          '<span data-notify="title">{1}</span> ' +
          '<span data-notify="message">{2}</span>' +
          '<div class="progress" data-notify="progressbar">' +
          '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
          '</div>' +
          '<a href="{3}" target="{4}" data-notify="url"></a>' +
          '</div>'
      });
  }

}
