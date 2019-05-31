import { Component, OnInit } from '@angular/core';
import { AnimalService } from 'app/services/Animal/animal.service';
import { RatingService } from 'app/services/Rating/rating.service';

@Component({
  selector: 'app-animal-view',
  templateUrl: './animal-view.component.html',
  styleUrls: ['./animal-view.component.scss']
})
export class AnimalViewComponent implements OnInit { 
  idCrear: number;
  informacion:any;  
  dfjkhf:any[];
  constructor(private _animalService:AnimalService, private _ratingService: RatingService) {
    this._animalService.getAnimaless().then((data) => {
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
