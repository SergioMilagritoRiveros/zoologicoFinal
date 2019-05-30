import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TipoEspacioService {

  constructor(private http: HttpClient) { }
  tipoEspacio = '/Zoologico/api/TipoEspacio';

getTipoEspacios() {
  return this.http.get(this.tipoEspacio);
} 
getTipoEspaciosid(id:number) {
  return this.http.get(this.tipoEspacio+'/'+id);
}
deleteTipoEspacio (id: number) {
  
  return this.http.delete(this.tipoEspacio+'/'+id);
}
postTipoEspacio(id:number, tipoEspacio:string, tamano: number, disponibilidadPersonas:number){
  console.log({disponibilidadPersonas,id, tamano,tipoEspacio});
  return this.http.post(this.tipoEspacio,{dsponibilidadPersonas:disponibilidadPersonas,id:id,nombreEspacio:tipoEspacio, tamano:tamano});
}
putTipoEspacio(id:number, tipoEspacio:string, tamano: number, disponibilidadPersonas:number){
  console.log({disponibilidadPersonas,id, tamano,tipoEspacio});
  return this.http.put(this.tipoEspacio+'/'+id,{dsponibilidadPersonas:disponibilidadPersonas,id:id,nombreEspacio:tipoEspacio, tamano:tamano });
}
}
