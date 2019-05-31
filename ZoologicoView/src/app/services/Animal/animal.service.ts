import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {


  constructor(private http: HttpClient) {

  }
  animales = '/Zoologico/api/Animal';

  async getAnimaless() {
    try {
      let response = await this.http
        .get(this.animales)
        .toPromise();
      return response;
    } catch (error) {
      await error;
    }
  }
  getAnimalessid(id: number) {
    return this.http.get(this.animales + '/' + id);
  }
  deleteAnimales(id: number) {

    return this.http.delete(this.animales + '/' + id);
  }
  postAnimales(idCrear, cantidadHabitad, CantidadTotalAnimalCrear, HorarioAlimentacionCrear, espacioCrear, empleadoCrear, nombreCientifico, tipoAnimalformu
  ) {
    return this.http.post(this.animales, {
      animalID: idCrear, cantidadHabitad: cantidadHabitad,
      cantidadTotal: CantidadTotalAnimalCrear, empleadoEntityID: empleadoCrear,
      espaciosID: espacioCrear, horarioAlimentacionID: HorarioAlimentacionCrear,
      nombreCientifico: nombreCientifico, tipoAnimalID: tipoAnimalformu
    });

  }
  putAnimales(id: number, animales: string) {
    return this.http.put(this.animales + '/' + id, { animales, id });
  }
}
