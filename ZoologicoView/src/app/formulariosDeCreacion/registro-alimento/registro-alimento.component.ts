import { Component, OnInit } from '@angular/core';
import { RegistroAlimentoService } from 'app/services/RegistroAlimento/registro-alimento.service';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
import { TipoAnimal } from 'app/interfaces/tipoanimal.interface';
declare var $:any;
@Component({
  selector: 'app-registro-alimento',
  templateUrl: './registro-alimento.component.html',
  styleUrls: ['./registro-alimento.component.scss']
})
export class RegistroAlimentoComponent implements OnInit {
  informacion: any;
  idCrear: number;
  cantidadAlimento:number;
  tipoAlimento:string;
  tipoAnimalCrear:TipoAnimal;
  registroAlimentoCrear: string = '';
  idActualizar: number;
  registroAlimentoActualizar: string;
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

  constructor(private _registroAlimentoService: RegistroAlimentoService, private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._registroAlimentoService.getRegistroAlimentos().subscribe((data) => {
      console.log(data),
        this.informacion = data,
        this.idCrear = this.informacion.length + 1
    });
  }
  eliminar(id: number) {
    this._registroAlimentoService.deleteRegistroAlimento(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {
    this.registroAlimentoCrear = $('#geenro').val();
    if (this.registroAlimentoCrear != '') {
      this._registroAlimentoService.postRegistroAlimento(this.idCrear, this.registroAlimentoCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } else {
      this.showNotification('top', 'rigth')
    }

  }
  actualizarFormulario(id: number) {
    this._registroAlimentoService.getRegistroAlimentosid(id).subscribe(data => {
      this.idActualizar = data['id'];
      this.registroAlimentoActualizar = data['registroAlimento'];
    });
  }
  actualizar() {
    this._registroAlimentoService.putRegistroAlimento(this.idActualizar, this.registroAlimentoActualizar).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load();
      $('#actualizarf').load();
    });
  }
  showNotification(from, align) {
    const type = ['', 'info', 'success', 'warning', 'danger'];

    const color = Math.floor((Math.random() * 4) + 1);


  }
}
