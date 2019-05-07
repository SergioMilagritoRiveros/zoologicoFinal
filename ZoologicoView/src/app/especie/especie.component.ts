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
     
      });
      this.informacion=informacion3;
    console.log(this.informacion);
  }
  eliminar(id:number) {
    console.log('chupelo'+id);
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
}
