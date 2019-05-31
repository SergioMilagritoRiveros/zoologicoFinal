import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EspecieService {

  constructor(private http: HttpClient) { 

  }
  especie = '/Zoologico/api/Especie';

getEspecies() {
  return this.http.get(this.especie);
} 
getEspeciesid(id:number) {
  return this.http.get(this.especie+'/'+id);
}
deleteEspecie (id: number) {
  
  return this.http.delete(this.especie+'/'+id);
}
postEspecie(id:number, especie:string){
  return this.http.post(this.especie,{especie,id});
}
putEspecie(id:number, especie:string){
  return this.http.put(this.especie+'/'+id,{especie,id});
}
}
