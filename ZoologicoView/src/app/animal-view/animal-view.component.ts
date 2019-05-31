import { Component, OnInit } from '@angular/core';
import { AnimalService } from 'app/services/Animal/animal.service';

@Component({
  selector: 'app-animal-view',
  templateUrl: './animal-view.component.html',
  styleUrls: ['./animal-view.component.scss']
})
export class AnimalViewComponent implements OnInit {
  informacion:any;
dfjkhf:any[];
  constructor(private _animalService:AnimalService) {
    this._animalService.getAnimaless().then((data) => {
      console.log(data),
        this.informacion = data;

    });
   }

  ngOnInit() {
   
  
  }
  

}
