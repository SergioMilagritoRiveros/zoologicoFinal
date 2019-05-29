import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TipoIdentificacionService {

  constructor(private http: HttpClient) { 

  }
  tipoIdentificacion = '/Zoologico/api/TipoIdentificacion';

getTipoIdentificacions() {
  return this.http.get(this.tipoIdentificacion);
} 
getTipoIdentificacionsid(id:number) {
  return this.http.get(this.tipoIdentificacion+'/'+id);
}
deleteTipoIdentificacion (id: number) {
  
  return this.http.delete(this.tipoIdentificacion+'/'+id);
}
postTipoIdentificacion(id:number, tipoIdentificacion:string){
  return this.http.post(this.tipoIdentificacion,{tipoIdentificacion,id});
}
putTipoIdentificacion(id:number, tipoIdentificacion:string){
  return this.http.put(this.tipoIdentificacion+'/'+id,{tipoIdentificacion,id});
}
}
