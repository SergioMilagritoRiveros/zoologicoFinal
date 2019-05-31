import { Component, OnInit } from '@angular/core';
import { ShowService } from 'app/services/Show/show.service';

@Component({
  selector: 'app-shows-view',
  templateUrl: './shows-view.component.html',
  styleUrls: ['./shows-view.component.scss']
})
export class ShowsViewComponent implements OnInit {
  informacion:any;
  constructor(private showService:ShowService) {
    this.showService.getshow().then((data) => {
      console.log(data),
        this.informacion = data;

    });
   }

  ngOnInit() {
  }

}
