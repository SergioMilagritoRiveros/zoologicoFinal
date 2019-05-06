import { Component, OnInit } from '@angular/core';
declare var $ :any;
@Component({
  selector: 'app-genero',
  templateUrl: './genero.component.html',
  styleUrls: ['./genero.component.css']
})
export class GeneroComponent implements OnInit {
     informacion : any[]=[];
  constructor() { }

  ngOnInit() {
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Genero',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
        for (let i = 0; i < data.length; i++) {
        $('#tabla').append('<th>'+data[i].id+'</th>');
        $('#tabla').append('<th>'+data[i].genero+'</th>');
        $('#tabla').append('<th><button id="button1">Eliminar</button></th>');
        }
      });

      console.log(this.informacion);
  }
   eliminar() {
    alert('chupelo');
  }

}
