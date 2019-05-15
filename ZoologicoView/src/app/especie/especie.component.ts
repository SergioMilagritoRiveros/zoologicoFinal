import { Component, OnInit } from '@angular/core';
declare var $ :any;
declare var informacion2:any[];
@Component({
  selector: 'app-especie',
  templateUrl: './especie.component.html',
  styleUrls: ['./especie.component.css']
})
export class EspecieComponent implements OnInit {
    informacion :Array<any>=[];
  constructor() { }

  ngOnInit() {
    var informacion3:Array<any>=[];
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Especie',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
    
  
        for (let i = 0; i < data.length; i++) {
         informacion3.push(data[i]);
      }
      $('#Id').val(informacion3.length+1);
      });
      this.informacion=informacion3;
    console.log(this.informacion);
  }
  eliminar(id:number) {
    $.ajax({
      method: 'DELETE',
      url:'http://localhost:8080/Zoologico/api/Especie/'+id,
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
      url: 'http://localhost:8080/Zoologico/api/Especie',
      contentType: 'application/json',
      dataType: 'json',
      data: JSON.stringify({
        id:$('#Id').val(),
        especie: $('#Especie').val()
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
      url: 'http://localhost:8080/Zoologico/api/Especie/' + id,
      contentType: 'application/json',
      dataType: 'json'
  }).done(function (data) {
    $('#IdActualizar').val(data.id),
   $('#EspecieActualizar').val(data.especie)
  });
  }
  actualizar(){
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Especie/' + $('#IdActualizar').val(),
      dataType: 'json'
  }).done(function (data) {

          $.ajax({
              method: 'PUT',
              url: 'http://localhost:8080/Zoologico/api/Especie/' + $('#IdActualizar').val(),
              contentType: 'application/json',
              dataType: 'json',
              data: JSON.stringify({
                id:$('#IdActualizar').val(),
                Especie: $('#EspecieActualizar').val()
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
