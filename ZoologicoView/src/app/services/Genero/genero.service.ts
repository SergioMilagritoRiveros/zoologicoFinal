import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class GeneroService {

  constructor(private http: HttpClient) { 

  }
  genero = 'http://localhost:8080/Zoologico/api/Genero';

getGeneros() {
  return this.http.get(this.genero);
} 
getGenerosid(id:number) {
  return this.http.get(this.genero+'/'+id);
}
deleteGenero (id: number) {
  
  return this.http.delete(this.genero+'/'+id);
}
postGenero(id:number, genero:string){
  return this.http.post(this.genero,{genero,id});
}
putGenero(id:number, genero:string){
  return this.http.put(this.genero+'/'+id,{genero,id});
}
}
