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
  idCrear: number=0;
  idActualizar: number;
  nombreEspacioCrear: string;
  nombreEspacioActualizar: string;
  dsponibilidadPersonasCrear: boolean;
  dsponibilidadpersonasActualizar: boolean;
  tamañoCrear: number;
  tamañoActualizar: number;


  constructor(private _tipoEspacioService: TipoEspacioService, private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._tipoEspacioService.getTipoEspacios().subscribe((data) => {
      console.log(data),
      this.informacion = data,
      this.idCrear = this.informacion.lenght + 1;
    });
   
  }
  eliminar(id: number) {
    this._tipoEspacioService.deleteTipoEspacio(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {

    if (this.nombreEspacioCrear != '' && this.tamañoCrear != null) {
      this._tipoEspacioService.postTipoEspacio(this.idCrear, this.nombreEspacioCrear, this.tamañoCrear, this.dsponibilidadPersonasCrear);
      this.ngOnInit();
      $('#tablex').load();
      $('#crearf').load();
    }
  }
}

