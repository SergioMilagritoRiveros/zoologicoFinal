import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IGenero } from '../../interfaces/generoInterface';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class GeneroService {
  post: Observable<any>;
  constructor(private http: HttpClient) { }
  configUrl = 'http://localhost:8080/Zoologico/api/Genero';

  getGenero(): Observable<IGenero[]> {
    return this.http.get<IGenero[]>(this.configUrl);
  }
  postGenero(generoLL: string, idLL: number) {
    const data: IGenero = {
      genero: generoLL,
      id: idLL
    }
    return this.http.post(this.configUrl, data).subscribe(response => {
      console.log(response);
    }, err => {
      console.log("User authentication failed!");
    });
  }
  putGenero(generoLL: string, idLL: number){
    const data: IGenero = {
      genero: generoLL,
      id: idLL
    }
    return this.http.put(this.configUrl, data).subscribe(response => {
      console.log(response);
    }, err => {
      console.log("User authentication failed!");
    });
  }
  getGeneroporid(id:number) : Observable<IGenero[]> {
    return this.http.get<IGenero[]>(this.configUrl+'/'+id);
  }
}
