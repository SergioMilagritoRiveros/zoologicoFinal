import { Component, OnInit } from '@angular/core';
import { TipoAnimalService } from 'app/services/tipoAnimal/tipo-animal.service';
import { EspecieService } from 'app/services/Especie/especie.service';
import { GeneroService } from 'app/services/Genero/genero.service';
import { TipoAnimal } from 'app/interfaces/tipoanimal.interface';
import { Especie } from 'app/interfaces/especie.interface';
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
  especieDesc: any;
  generoDesc: any;
  constructor(private _tipoAnimalService: TipoAnimalService, private _especieService: EspecieService, private _generoService: GeneroService) { }

  ngOnInit() {
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
    var tipoanimalID: number = this.idCrear;
    var tipoAnimalDesc: string = this.descripcionCrear;

    this._especieService.getEspeciesid(this.especieCrear).subscribe(data => {
      
      this.especieDesc = data;
      this._generoService.getGenerosid(this.generoCrear).subscribe(data2 => {
        this.generoDesc = data2;
        console.log('especie',this.especieDesc,'genero', this.generoDesc)
        this._tipoAnimalService.postTipoAnimal({
          descripcion: tipoAnimalDesc,
          especieID: this.especieDesc,
          generoID: this.generoDesc,
          id: this.idCrear
        }).subscribe(data => {

          this.ngOnInit();
          $('#tablex').load();
          $('#createFormulario').load();
        });
      });

    });



    console.log('objeto: { descripcion:' + tipoAnimalDesc + ', especieID: {especie: ' + this.especieDesc.especie + ', id:' + this.especieDesc.id + ' }')


  }
  actualizarFormulario(id: number) {

  }
  actualizar() {

  }
}
