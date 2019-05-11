import { Component, OnInit } from '@angular/core';
import { identifierModuleUrl } from '@angular/compiler';

declare var $ :any;
@Component({
  selector: 'app-genero',
  templateUrl: './genero.component.html',
  styleUrls: ['./genero.component.css']
})
export class GeneroComponent implements OnInit {
  informacion :Array<any>=[];
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

  constructor() { }

  ngOnInit() {
    var informacion3:Array<any>=[];
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Genero',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
    
  
        for (let i = 0; i < data.length; i++) {
         informacion3.push(data[i]);
      }
     
      });
      this.informacion=informacion3;
    console.log(this.informacion);
  }
  eliminar(id:number) {
    console.log('chupelo'+id);
    $.ajax({
      method: 'DELETE',
      url:'http://localhost:8080/Zoologico/api/Genero/'+id,
      contentType: 'application/json',
      dataType: 'json'
  }).done(function(data){
      console.log("Elemento eliminado");
      window.location.reload();
  }).fail(function(xhr, status, error){
      console.log(error);
  });
  }

  crear(){
    $.ajax({
      method: 'POST',
      url: 'http://localhost:8080/Zoologico/api/Genero',
      contentType: 'application/json',
      dataType: 'json',
      data: JSON.stringify({
        id:$('#Id').val(),
        Genero: $('#Genero').val()
      })
  }).done(function (data) {
        window.location.reload();
  }).fail(function (xhr, status, error) {
      console.log(error);
  });
  }
  actualizarFormulario(id:number){
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Genero/' + id,
      contentType: 'application/json',
      dataType: 'json'
  }).done(function (data) {
    $('#IdActualizar').val(data.id),
   $('#GeneroActualizar').val(data.genero)
  });
  }
  actualizar(){
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Genero/' + $('#IdActualizar').val(),
      dataType: 'json'
  }).done(function (data) {

          $.ajax({
              method: 'PUT',
              url: 'http://localhost:8080/Zoologico/api/Genero/' + $('#IdActualizar').val(),
              contentType: 'application/json',
              dataType: 'json',
              data: JSON.stringify({
                id:$('#IdActualizar').val(),
                Genero: $('#GeneroActualizar').val()
              })
          }).done(function (data) {
            window.location.reload();
          }).fail(function (xhr, status, error) {
              console.log(error);
          });

  }).fail(function (xhr, status, error) {
      console.log(error);
  });
  }
}
