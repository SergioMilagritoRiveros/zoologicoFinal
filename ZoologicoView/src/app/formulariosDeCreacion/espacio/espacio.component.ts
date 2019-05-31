import { Component, OnInit } from '@angular/core';
import { EspacioService } from 'app/services/Espacio/espacio.service';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
import { TipoEmpleadoService } from 'app/services/tipoEmpleado/tipo-empleado.service';
import { TipoEspacioService } from 'app/services/tipoEspacio/tipo-espacio.service';
declare var $:any;
@Component({
  selector: 'app-espacio',
  templateUrl: './espacio.component.html',
  styleUrls: ['./espacio.component.scss']
})
export class EspacioComponent implements OnInit {
  informacion:any;
  idCrear:number;
  nombreEspacioCrear:string;
  ubicacionCrear:string;
  tipoEspacioCrear:number;
  tipoespaciolist:any;
  
  constructor(private _especieService: EspacioService, private _UserService: UserService, private router: Router,private _tipoEspacio:TipoEspacioService) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._especieService.getEspacios().subscribe((data) => {
      console.log(data),
        this.informacion = data,
        this.idCrear = this.informacion.length + 1
    });
    this._tipoEspacio.getTipoEspaciosw2().then((data) => {
      console.log(data),
        this.tipoespaciolist = data;

    });
  }
  eliminar(id: number) {
    this._especieService.deleteEspacio(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {

      this._especieService.postEspacio(
        this.idCrear,
        this.nombreEspacioCrear,
        this.tipoEspacioCrear,
        this.ubicacionCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } 

  
}
