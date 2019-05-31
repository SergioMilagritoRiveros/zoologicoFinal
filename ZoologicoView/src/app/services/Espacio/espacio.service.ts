import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EspacioService {

  constructor(private http: HttpClient) { 

  }
  espacio = '/Zoologico/api/Espacio';

getEspacios() {
  return this.http.get(this.espacio);
} 
getEspaciosid(id:number) {
  return this.http.get(this.espacio+'/'+id);
}
deleteEspacio (id: number) {
  
  return this.http.delete(this.espacio+'/'+id);
}
postEspacio(
  id: number,
  nombreEspacio: string,
  tipoEspacioID: number,
  ubicacion: string){
  return this.http.post(this.espacio,{
    id: id,
    nombreEspacio: nombreEspacio,
    tipoEspacioID: tipoEspacioID,
    ubicacion: ubicacion});
}
putEspacio(id:number, espacio:string){
  return this.http.put(this.espacio+'/'+id,{espacio,id});
}
}
