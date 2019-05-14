import { Component, OnInit } from '@angular/core';
declare var $ :any;
@Component({
  selector: 'app-tipo-animal',
  templateUrl: './tipo-animal.component.html',
  styleUrls: ['./tipo-animal.component.css']
})
export class TipoAnimalComponent implements OnInit {

  informacion :Array<any>=[];
  genero : Array<any>=[];
  especie : Array<any>=[];
  constructor() { }

  ngOnInit() {
    var informacion3:Array<any>=[];
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/TipoAnimal',
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

    var genero2:Array<any>=[];
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Genero',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
    
  
        for (let i = 0; i < data.length; i++) {
          genero2.push(data[i]);
      }
      });
      this.genero=genero2;
      
    console.log(genero2.length);
    var especie2:Array<any>=[];
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Especie',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
    
  
        for (let i = 0; i < data.length; i++) {
          especie2.push(data[i]);
      }
      $('#Id').val(especie2.length+1);
      });
      this.especie=especie2;
    console.log(this.especie);
  }
  eliminar(id:number) {
    console.log('chupelo'+id);
    $.ajax({
      method: 'DELETE',
      url:'http://localhost:8080/Zoologico/api/TipoAnimal/'+id,
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
    alert( $('#Id').val()+$('#Descripcion').val()+$('#Especie').val().split("&", 0));
    $.ajax({
      method: 'POST',
      url: 'http://localhost:8080/Zoologico/api/TipoAnimal',
      contentType: 'application/json',
      dataType: 'json',
      data: JSON.stringify({
        id:$('#Id').val(),
        Descripcion: $('#Descripcion').val(),
        especieID: $.ajax({
              method: 'GET',
              url: 'http://localhost:8080/Zoologico/api/Especie/' + $('#Especie').val(),
              dataType: 'json'
          }),
        
        generoID: $.ajax({
          method: 'GET',
          url: 'http://localhost:8080/Zoologico/api/Genero/' + $('#Genero').val(),
          contentType: 'application/json',
          dataType: 'json'
      })
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
      url: 'http://localhost:8080/Zoologico/api/TipoAnimal/' + id,
      contentType: 'application/json',
      dataType: 'json'
  }).done(function (data) {
    $('#IdActualizar').val(data.id),
   $('#TipoAnimalActualizar').val(data.TipoAnimal)
  });
  }
  actualizar(){
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/TipoAnimal/' + $('#IdActualizar').val(),
      dataType: 'json'
  }).done(function (data) {

          $.ajax({
              method: 'PUT',
              url: 'http://localhost:8080/Zoologico/api/TipoAnimal/' + $('#IdActualizar').val(),
              contentType: 'application/json',
              dataType: 'json',
              data: JSON.stringify({
                id:$('#IdActualizar').val(),
                TipoAnimal: $('#TipoAnimalActualizar').val()
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
