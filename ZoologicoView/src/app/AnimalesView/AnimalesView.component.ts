import { Component, OnInit } from '@angular/core';
import { LoginService } from 'app/services/Login/login.service';
import { Router } from '@angular/router';
import { Alert } from 'selenium-webdriver';
import { UserService } from '../services/user/user.service';
import { AnimalService } from 'app/services/Animal/animal.service';

declare var $: any;

@Component({
  selector: 'app-AnimalesView',
  templateUrl: './AnimalesView.component.html',
  styleUrls: ['./AnimalesView.component.css']
})
export class AnimalesViewComponent implements OnInit {
  informacion: any;
  idCrear: number;
 
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

  constructor(private _AnimalService: AnimalService) { }

  ngOnInit() {
    
    this._AnimalService.getAnimaless().subscribe((data) => {
      console.log(data),
        this.informacion = data,
        this.idCrear = this.informacion.length + 1
    });
  }
  
}
