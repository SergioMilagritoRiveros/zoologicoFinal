import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {


  constructor(private http: HttpClient) {

  }
  animales = '/Zoologico/api/Animal';

  getAnimaless() {
    return this.http.get(this.animales);
  }
  getAnimalessid(id: number) {
    return this.http.get(this.animales + '/' + id);
  }
  deleteAnimales(id: number) {

    return this.http.delete(this.animales + '/' + id);
  }
  postAnimales(id: number, animales: string) {
    return this.http.post(this.animales, { animales, id });
  }
  putAnimales(id: number, animales: string) {
    return this.http.put(this.animales + '/' + id, { animales, id });
  }
}
