import { Component, OnInit } from '@angular/core';
import { identifierModuleUrl } from '@angular/compiler';
import {GeneroService} from '../services/Genero/genero.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-genero',
  templateUrl: './genero.component.html',
  styleUrls: ['./genero.component.css']
})
export class GeneroComponent implements OnInit {
  informacion :any;
   getUrlParameter = function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
            sURLVariables = sPageURL.split('&'),
            sParameterName,
            i;
    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');
        if (sParameterName[0] === sParam) {
            return sParameterName [1] === undefined ? true : sParameterName[1];
        }
    }
};

  constructor(private _generoservice:GeneroService) { }

  ngOnInit() {
    this._generoservice.getGenero().subscribe((data) => this.informacion=data);
  }
  eliminar(id:number) {
   
  }

  crear(){
   
  }
  actualizarFormulario(id:number){
   
  }
  actualizar(){
   
  }
}
