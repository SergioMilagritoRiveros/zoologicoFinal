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
  postAnimales(id: number, animales: string,
    cantidadHabitad:number,cantitadTotal:number,
    horarioAlimentacion:number,Espacios:number,
    nombreCientifico:string,empleado:number
    ) {
    return this.http.post(this.animales, { id: id, animales: animales,
      cantidadHabitad:cantidadHabitad,cantitadTotal:cantitadTotal,
      horarioAlimentacion:horarioAlimentacion,Espacios:Espacios,
      nombreCientifico:nombreCientifico,empleado:empleado });
  }
  putAnimales(id: number, animales: string) {
    return this.http.put(this.animales + '/' + id, { animales, id });
  }
}
