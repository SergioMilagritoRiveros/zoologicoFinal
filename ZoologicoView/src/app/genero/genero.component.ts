import { Component, OnInit } from '@angular/core';
declare var $ :any;
@Component({
  selector: 'app-genero',
  templateUrl: './genero.component.html',
  styleUrls: ['./genero.component.css']
})
export class GeneroComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Genero',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
      for (let index = 0; index < data.length; index++) {
        console.log(data[index]);
        
      }
      });
  }

}
