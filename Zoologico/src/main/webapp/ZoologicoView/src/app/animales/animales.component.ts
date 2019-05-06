import { Component, OnInit } from '@angular/core';
declare var $:any;
@Component({
  selector: 'app-animales',
  templateUrl: './animales.component.html',
  styleUrls: ['./animales.component.css']
})
export class AnimalesComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    $.ajax({
      method: 'GET',
      url: 'http://localhost:8080/Zoologico/api/Animal',
      dataType: 'json',
      contentType: 'application/json'
  }).done(function (data) {
      alert('se logro');
      });
  
  }

}
