import { Component, OnInit } from '@angular/core';
import { TipoAnimalService } from 'app/services/tipoAnimal/tipo-animal.service';
import { EspecieService } from 'app/services/Especie/especie.service';
import { GeneroService } from 'app/services/Genero/genero.service';
import { TipoAnimal } from 'app/interfaces/tipoanimal.interface';
import { Especie } from 'app/interfaces/especie.interface';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
declare var $: any;
@Component({
  selector: 'app-tipo-animal',
  templateUrl: './tipo-animal.component.html',
  styleUrls: ['./tipo-animal.component.css']
})
export class TipoAnimalComponent implements OnInit {

  informacion: any;
  genero: any;
  especie: any;
  idCrear: number;
  descripcionCrear: string = '';
  especieCrear: number;
  generoCrear: number;
  especieDesc: number;
  generoDesc: number;
  constructor(private _tipoAnimalService: TipoAnimalService, private _especieService: EspecieService, private _generoService: GeneroService, private _UserService: UserService, private router: Router) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);
    }
    this._especieService.getEspecies().subscribe(data => this.especie = data);
    this._generoService.getGeneros().subscribe(data => this.genero = data);
    this._tipoAnimalService.getTipoAnimals().subscribe(data => {
      console.log(data);
      this.informacion = data;
      this.idCrear = this.informacion.length + 1;
    });
  }
  eliminar(id: number) {
    this._tipoAnimalService.deleteTipoAnimal(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load();
    });
  }
  crear() {
    

        this._tipoAnimalService.postTipoAnimal(this.descripcionCrear,this.especieCrear, this.generoCrear,this.idCrear).subscribe(data => {

          this.ngOnInit();
          $('#tablex').load();
          $('#createFormulario').load();
        });
     



  


  }
  actualizarFormulario(id: number) {

  }
  actualizar() {

  }
  generodesc(id:number){
    
    return this.genero;
  }
}
