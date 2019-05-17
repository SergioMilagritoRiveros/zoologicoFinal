import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GeneroService {
   conexion ='http://localhost:8080/Zoologico/api/Genero';
  constructor(private http: HttpClient) {

   }
   getGenero() {
    return this.http.get(this.conexion);
  }
}
