import { Component, OnInit } from '@angular/core';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
import { RatingService } from 'app/services/Rating/rating.service';


declare var $: any;
@Component({
  selector: 'app-rating',
  templateUrl: './rating.component.html',
  styleUrls: ['./rating.component.scss']
})
export class RatingComponent implements OnInit {
  informacion: any;
  idCrear: number;
  ratingCrear: string = '';
  comentariosCrear:string='';
  idActualizar: number;
  ratingActualizar: string;
  comentariosActualizar:string;
 
  constructor(private _ratingService: RatingService, private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._ratingService.getRating().subscribe((data) => {
      console.log(data),
        this.informacion = data,
        this.idCrear = this.informacion.length + 1
    });
  }
  eliminar(id: number) {
    this._ratingService.deleteRating (id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load()
    });

  }

  crear() {
    
    if ($('#commetarios').val()!='') {
      this._ratingService.postRating(this.idCrear,$('#commetarios').val() ,this.ratingCrear).subscribe(data => {
        this.ngOnInit();
        $('#tablex').load();
        $('#crearf').load();

      });
    } else {
      this.showNotification('top', 'rigth')
    }

  }
  actualizarFormulario(id: number) {
    this._ratingService.getRatingid(id).subscribe(data => {
      this.idActualizar = data['id'];
      this.ratingActualizar = data['rating '];
      this.comentariosActualizar= data['comentarios '];
    });
  }
  actualizar() {
    this.comentariosActualizar=$('#comentariosactu').val();
    this._ratingService.putRating (this.idActualizar,this.ratingActualizar,this.comentariosActualizar).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load();
      $('#actualizarf').load();
    });
  }
  showNotification(from, align) {
    const type = ['', 'info', 'success', 'warning', 'danger'];

    const color = Math.floor((Math.random() * 4) + 1);

    $.notify({
      icon: "notifications",
      message: "Rating  vacio , porfavor ingrese un valor <br>en la descripcion del rating "

    }, {
        type: type[color],
        timer: 4000,
        placement: {
          from: from,
          align: align
        },
        template: '<div data-notify="container" class="col-xl-4 col-lg-4 col-11 col-sm-4 col-md-4 alert alert-{0} alert-with-icon" role="alert">' +
          '<button mat-button  type="button" aria-hidden="true" class="close mat-button" data-notify="dismiss">  <i class="material-icons">close</i></button>' +
          '<i class="material-icons" data-notify="icon">notifications</i> ' +
          '<span data-notify="title">{1}</span> ' +
          '<span data-notify="message">{2}</span>' +
          '<div class="progress" data-notify="progressbar">' +
          '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
          '</div>' +
          '<a href="{3}" target="{4}" data-notify="url"></a>' +
          '</div>'
      });
  }
}
