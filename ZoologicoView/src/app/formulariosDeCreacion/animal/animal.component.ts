import { Component, OnInit } from '@angular/core';
import { UserService } from 'app/services/user/user.service';
import { Router } from '@angular/router';
import { AnimalService } from 'app/services/Animal/animal.service';
import { HorarioAlimentacionService } from 'app/services/horarioAlimentacion/horario-alimentacion.service';
import { EspacioService } from 'app/services/Espacio/espacio.service';
import { EmpleadoService } from 'app/services/Empleado/empleado.service';
import { TouchSequence } from 'selenium-webdriver';
import { TipoAnimalService } from 'app/services/tipoAnimal/tipo-animal.service';
declare var $: any;
@Component({
  selector: 'app-animal',
  templateUrl: './animal.component.html',
  styleUrls: ['./animal.component.scss']
})
export class AnimalComponent implements OnInit {
  informacion: any;
  id: number;
  idCrear: number;
  animal: string = '';
  animalCrear: number;
  cantidadHabitad: number;
  cantidadHabitadC: number;
  cantidadTotal: number;
  cantidadTotalC: number;
  horarioAlimentacion: any;
  horarioAlimentacionC: number;
  espacios: any;
  espacioCrear: number;
  nombreCientifico: string = '';
  empleado: any;
  empleadoC: number;
  TipoAnimalCrear: any;
  tipoAnimalformu: number;
  CantidadTotalAnimalCrear: number;
  empleadoCrear: number;
  NombreCientificoCrear: string;
  HorarioAlimentacionCrear: number;
  constructor(private _animalService: AnimalService, private _horarioAlientacionService: HorarioAlimentacionService, private _espaciosService: EspacioService, private _empleadoService: EmpleadoService, private _UserService: UserService, private router: Router, private _tipoanimal: TipoAnimalService) { }

  ngOnInit() {
    if (this._UserService.getuser() == 0) {
      this.router.navigate(['/']);



    }
    this._tipoanimal.getTipoAnimals().subscribe(data => {
      this.TipoAnimalCrear = data;
    });
    this._horarioAlientacionService.getHorarioAlimentacion().subscribe(data => { this.horarioAlimentacion = data; console.log(this.horarioAlimentacion) });
    this._espaciosService.getEspacios().subscribe(data => this.espacios = data);
    this._empleadoService.getEmpleados().subscribe(data => this.empleado = data);
    this._animalService.getAnimaless().then((data) => {
      console.log(data),
        this.informacion = data;
      this.idCrear = this.informacion.length + 1;
      alert(this.idCrear);
      $('#id').val(this.informacion.length + 1);
    });
  }
  eliminar(id: number) {
    this._animalService.deleteAnimales(id).subscribe(data => {
      this.ngOnInit();
      $('#tablex').load();
    });
  }
  crear() {
    this._animalService.postAnimales(this.idCrear, this.cantidadHabitad, this.CantidadTotalAnimalCrear, this.HorarioAlimentacionCrear, this.espacioCrear, this.empleadoCrear, this.NombreCientificoCrear, this.tipoAnimalformu).subscribe(data => {

      this.ngOnInit();
      $('#tablex').load();
      $('#createFormulario').load();
    });

  }


}
