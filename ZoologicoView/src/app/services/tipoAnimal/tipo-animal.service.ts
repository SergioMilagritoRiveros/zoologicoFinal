import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TipoAnimalService {
  constructor(private http: HttpClient) { 

  }
  tipoAnimal = 'http://localhost:8080/Zoologico/api/TipoAnimal';

getTipoAnimals() {
  return this.http.get(this.tipoAnimal);
} 
getTipoAnimalsid(id:number) {
  return this.http.get(this.tipoAnimal+'/'+id);
}
deleteTipoAnimal (id: number) {
  
  return this.http.delete(this.tipoAnimal+'/'+id);
}
postTipoAnimal(id:number, tipoAnimal:string){
  return this.http.post(this.tipoAnimal,{tipoAnimal,id});
}
putTipoAnimal(id:number, tipoAnimal:string){
  return this.http.put(this.tipoAnimal+'/'+id,{tipoAnimal,id});
}
}
