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
postTipoEspacio(id:number, tipoEspacio:string, tamaño: number, disponibilidadPersonas:boolean){
  return this.http.post(this.tipoEspacio,{id,tipoEspacio, tamaño, disponibilidadPersonas});
}
putTipoEspacio(id:number, tipoEspacio:string, tamaño: number, disponibilidadPersonas:boolean){
  return this.http.put(this.tipoEspacio+'/'+id,{id,tipoEspacio, tamaño, disponibilidadPersonas});
}
}
