import { Component, OnInit } from '@angular/core';
import { TipoEspacioService } from 'app/services/tipoEspacio/tipo-espacio.service';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
declare var $ :any;
@Component({
  selector: 'app-tipo-espacio',
  templateUrl: './tipo-espacio.component.html',
  styleUrls: ['./tipo-espacio.component.scss']
})
export class TipoEspacioComponent implements OnInit {
  informacion: any;
  idCrear: number;
  disponibilidadPersonaCrear: number=0;
  nombreEspacioCrear:string='';
  tamanoCrear:number;
  idActualizar: number;
  disponibilidadPersonaActualizar: number=0;
  nombreEspacioActualizar:string='';
  tamanoActualizar:number;
  constructor(private _tipoEspacioService: TipoEspacioService, private _UserService: UserService, private router: Router) { }
  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._tipoEspacioService.getTipoEspacios().subscribe((data) => {
      console.log(data),
        this.informacion = data,
        this.idCrear = this.informacion.length + 1
    });
  }
  eliminar(id: number) {
    this._tipoEspacioService.deleteTipoEspacio(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {
    
    if( $('#dispo').prop('checked') ) {
      this.disponibilidadPersonaCrear=1;
  }else{
    this.disponibilidadPersonaCrear=0;
  }
  this.nombreEspacioCrear=$('#tipEs').val();
  this.tamanoCrear=$('#taman').val();
      this._tipoEspacioService.postTipoEspacio(this.idCrear, this.nombreEspacioCrear,this.tamanoCrear,this.disponibilidadPersonaCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } 
    

  
  
  actualizarFormulario(id: number) {
    this._tipoEspacioService.getTipoEspaciosid(id).subscribe(data => {
      this.idActualizar = data['id'];
      this.disponibilidadPersonaActualizar = data['dsponibilidadPersonas'];
      this.nombreEspacioActualizar=data['nombreEspacio'];
      this.tamanoActualizar=data['tamaño']
    });
  }
  actualizar() {
    this.idActualizar=$('#IdActualizar').val();
    if( $('#dispoActualizar').prop('checked') ) {
      this.disponibilidadPersonaActualizar=1;
  }else{
    this.disponibilidadPersonaActualizar=0;
  }
  this.nombreEspacioActualizar=$('#tipEsActualizar').val();
  this.tamanoActualizar=$('#tamanActualizar').val();
    this._tipoEspacioService.putTipoEspacio(this.idActualizar, this.nombreEspacioActualizar, this.tamanoActualizar, this.disponibilidadPersonaActualizar).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load();
      $('#actualizarf').load();
    });
  }
  showNotification(from, align) {
    const type = ['', 'info', 'success', 'warning', 'danger'];

    const color = Math.floor((Math.random() * 4) + 1);

    $.notify({
      icon: "notifications",
      message: "TipoEspacio vacio , porfavor ingrese un valor <br>en la descripcion del tipoEspacio"

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

