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
 
  constructor(private _loginservioce: LoginService, private router: Router, private _UserService: UserService,private _animaService:AnimalService) {    
  }
  ngOnInit() {
    this._animaService.getAnimaless().subscribe((data) => {
      console.log('data',data),
        this.informacion = data;
    });
    console.log(this.informacion);
  }
  
  
}
