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
  async gerregistroasync() {
    try {
     let response = await this.http
       .get(this.tipoAnimal)
       .toPromise();
     return response;
   } catch (error) {
     await error;
   }
  }
getTipoAnimals() {
  return this.http.get(this.tipoAnimal);
} 
getTipoAnimalsid(id:number) {
  return this.http.get(this.tipoAnimal+'/'+id);
}
deleteTipoAnimal (id: number) {
  
  return this.http.delete(this.tipoAnimal+'/'+id);
}
postTipoAnimal(descripcion: string, especieID: number, generoID: number, id: number){
  
  console.log('objeto: ',{descripcion: descripcion, especieID: especieID, generoID: generoID, id: id});
  return this.http.post(this.tipoAnimal,{descripcion: descripcion, especieID: especieID, generoID: generoID, id: id});
}
putTipoAnimal(id:number, tipoAnimal:string){
  return this.http.put(this.tipoAnimal+'/'+id,{tipoAnimal,id});
}
}
