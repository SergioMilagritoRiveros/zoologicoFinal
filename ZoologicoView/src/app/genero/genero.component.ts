import { Component, OnInit } from '@angular/core';
declare var $ :any;
@Component({
  selector: 'app-genero',
  templateUrl: './genero.component.html',
  styleUrls: ['./genero.component.css']
})
export class GeneroComponent implements OnInit {
  informacion :Array<any>=[];
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

}
