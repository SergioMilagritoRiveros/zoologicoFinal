import { Component, OnInit } from '@angular/core';
import { identifierModuleUrl } from '@angular/compiler';
import { GeneroService } from '../service/Genero/genero.service';
import { IGenero } from '../interfaces/generoInterface';


declare var $: any;
@Component({
  selector: 'app-genero',
  templateUrl: './genero.component.html',
  styleUrls: ['./genero.component.css']
})
export class GeneroComponent implements OnInit {
  informacion = [];
  objeto:Array<any>;
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

  constructor(private _generoService: GeneroService) {
    this._generoService.getGenero().subscribe(data => this.informacion = data);
  }

  ngOnInit() {


  }
  cragarid(){
    $('#Id').val(this.informacion.length + 1);
  }
  eliminar(id: number) {
    $.ajax({
      method: 'DELETE',
      url: 'http://localhost:8080/Zoologico/api/Genero/' + id,
      contentType: 'application/json',
      dataType: 'json'
    }).done(function (data) {
      console.log("Elemento eliminado");
      window.location.reload();
    }).fail(function (xhr, status, error) {
      console.log(error);
    });
  }
  
  crear() {
    console.log(this.informacion);
    this._generoService.postGenero($('#Genero').val(), this.informacion.length + 1);
    location.reload();
  }
  actualizarFormulario(id: number) {
   
   var data=this._generoService.getGeneroporid(id).subscribe(data =>{this.objeto=data 
    this.objeto.map(function(obj){ 
      var rObj = {};
      $('#IdAtualzar').val(rObj[obj.id]);
      $('#GeneroActualizar').val(rObj[obj.genero]);
      return rObj;
   })
  });
  }
  actualizar() {
   console.log(this.objeto);
  }
}
