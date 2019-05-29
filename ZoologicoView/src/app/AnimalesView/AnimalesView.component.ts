import { Component, OnInit } from '@angular/core';
import { LoginService } from 'app/services/Login/login.service';
import { Router } from '@angular/router';
import { Alert } from 'selenium-webdriver';
import { UserService } from '../services/user/user.service';

declare var $: any;

@Component({
  selector: 'app-AnimalesView',
  templateUrl: './AnimalesView.component.html',
  styleUrls: ['./AnimalesView.component.css']
})
export class AnimalesViewComponent implements OnInit {
  informacion: any[]=[1,2,3,4,5,6];
 
  constructor(private _loginservioce: LoginService, private router: Router, private _UserService: UserService) {    
  }

  ngOnInit() {
  }

  
}
