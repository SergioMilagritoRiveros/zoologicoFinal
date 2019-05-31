import { Component, OnInit } from '@angular/core';
import { ShowService } from 'app/services/Show/show.service';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
declare var $:any;
@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.scss']
})
export class ShowComponent implements OnInit {

  informacion: any;
  idCrear: number;
  generoCrear: string = '';
  idActualizar: number;
  generoActualizar: string;
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

  constructor(private _generoService: ShowService, private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._generoService.getshow().then((data) => {
      console.log(data),
        this.informacion = data;

    });
  }
  eliminar(id: number) {
    this._generoService.deleteShow(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {
   
      this._generoService.postShow(this.idCrear, this.generoCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } 

  }

