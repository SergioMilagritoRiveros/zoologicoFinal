import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TipoAnimal } from 'app/interfaces/tipoanimal.interface';

@Injectable({
  providedIn: 'root'
})
export class TipoAnimalService {
  constructor(private http: HttpClient) { 

  }
  tipoAnimal = '/Zoologico/api/TipoAnimal';

getTipoAnimals() {
  return this.http.get(this.tipoAnimal);
} 
getTipoAnimalsid(id:number) {
  return this.http.get(this.tipoAnimal+'/'+id);
}
deleteTipoAnimal (id: number) {
  
  return this.http.delete(this.tipoAnimal+'/'+id);
}
postTipoAnimal(tipoanimaldesc:TipoAnimal){
  
  console.log('objeto: ',tipoanimaldesc);
  return this.http.post(this.tipoAnimal,{"descripcion": tipoanimaldesc.Descripcion,"especieID":{"especie":tipoanimaldesc.EspecieID.especie,"id":tipoanimaldesc.EspecieID.id},"generoID":{"genero":tipoanimaldesc.GeneroID.genero,"id":tipoanimaldesc.GeneroID.id},"id":tipoanimaldesc.id});
}
putTipoAnimal(id:number, tipoAnimal:string){
  return this.http.put(this.tipoAnimal+'/'+id,{tipoAnimal,id});
}
}
