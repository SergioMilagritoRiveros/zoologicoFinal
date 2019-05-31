import { Component, OnInit } from '@angular/core';
import { ShowService } from 'app/services/Show/show.service';
import { RatingService } from 'app/services/Rating/rating.service';

@Component({
  selector: 'app-shows-view',
  templateUrl: './shows-view.component.html',
  styleUrls: ['./shows-view.component.scss']
})
export class ShowsViewComponent implements OnInit {
  informacion:any;
  idCrear: number;
  constructor(private showService:ShowService,  private _ratingService: RatingService) {
    this.showService.getshow().then((data) => {
      console.log(data),
        this.informacion = data;

    });
   }

  ngOnInit() {
  }

  crear(name:number) {
    if(name == 1){
      alert('Gracias Por Votar');
      this._ratingService.postRating(this.idCrear, name,'Muy Malo').subscribe(data => {
        this.ngOnInit();
      });
    }else{
      if (name == 2) {
        alert('Gracias Por Votar');
        this._ratingService.postRating(this.idCrear, name,'Malo').subscribe(data => {
          this.ngOnInit();
        });
      }else{
        if (name == 3) {
          alert('Gracias Por Votar');
          this._ratingService.postRating(this.idCrear, name,'Regular').subscribe(data => {
            this.ngOnInit();
          });
        } else {
          if (name == 4) {
            alert('Gracias Por Votar');
            this._ratingService.postRating(this.idCrear, name,'Bueno').subscribe(data => {
              this.ngOnInit();
            });
          } else {
            if (name == 5) {
              alert('Gracias Por Votar');
              this._ratingService.postRating(this.idCrear, name,'Muy Bueno').subscribe(data => {
                this.ngOnInit();
              });
            }
          }
        }
      }
    } 

  }
}
